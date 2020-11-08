package com.kenova.classifieds.repository.itemcondition;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;

import com.kenova.classifieds.AppExecutors;
import com.kenova.classifieds.Config;
import com.kenova.classifieds.api.ApiResponse;
import com.kenova.classifieds.api.PSApiService;
import com.kenova.classifieds.db.ItemConditionDao;
import com.kenova.classifieds.db.PSCoreDb;
import com.kenova.classifieds.repository.common.NetworkBoundResource;
import com.kenova.classifieds.repository.common.PSRepository;
import com.kenova.classifieds.utils.Utils;
import com.kenova.classifieds.viewobject.ItemCondition;
import com.kenova.classifieds.viewobject.common.Resource;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ItemConditionRepository extends PSRepository {
    private ItemConditionDao itemConditionDao;

    @Inject
    ItemConditionRepository(PSApiService psApiService, AppExecutors appExecutors, PSCoreDb db, ItemConditionDao itemConditionDao) {

        super(psApiService, appExecutors, db);
        this.itemConditionDao = itemConditionDao;
    }

    public LiveData<Resource<List<ItemCondition>>> getAllItemConditionList(String limit, String offset) {

        return new NetworkBoundResource<List<ItemCondition>, List<ItemCondition>>(appExecutors) {

            @Override
            protected void saveCallResult(@NonNull List<ItemCondition> itemTypeList) {
                Utils.psLog("SaveCallResult of getAllCategoriesWithUserId");

                try {
                    db.runInTransaction(() -> {
                        itemConditionDao.deleteAllItemCondition();

                        itemConditionDao.insertAll(itemTypeList);

                    });
                } catch (Exception ex) {
                    Utils.psErrorLog("Error at ", ex);
                }
            }


            @Override
            protected boolean shouldFetch(@Nullable List<ItemCondition> data) {

                return connectivity.isConnected();
            }

            @NonNull
            @Override
            protected LiveData<List<ItemCondition>> loadFromDb() {

                Utils.psLog("Load From Db (All Categories)");

                return itemConditionDao.getAllItemCondition();

            }

            @NonNull
            @Override
            protected LiveData<ApiResponse<List<ItemCondition>>> createCall() {
                Utils.psLog("Call Get All Categories webservice.");

                return psApiService.getItemConditionTypeList(Config.API_KEY,limit, offset);
            }

            @Override
            protected void onFetchFailed(String message) {
                Utils.psLog("Fetch Failed of About Us");
            }

        }.asLiveData();
    }

    public LiveData<Resource<Boolean>> getNextPageItemConditionList( String limit, String offset) {

        final MediatorLiveData<Resource<Boolean>> statusLiveData = new MediatorLiveData<>();
        LiveData<ApiResponse<List<ItemCondition>>> apiResponse = psApiService.getItemConditionTypeList(Config.API_KEY, limit, offset);

        statusLiveData.addSource(apiResponse, response -> {

            statusLiveData.removeSource(apiResponse);

            //noinspection Constant Conditions
            if (response.isSuccessful()) {

                appExecutors.diskIO().execute(() -> {

                    try {
                        db.runInTransaction(() -> {
                            if (apiResponse.getValue() != null) {

                                itemConditionDao.insertAll(apiResponse.getValue().body);
                            }
                        });
                    } catch (Exception ex) {
                        Utils.psErrorLog("Error at ", ex);
                    }

                    statusLiveData.postValue(Resource.success(true));

                });
            } else {
                statusLiveData.postValue(Resource.error(response.errorMessage, null));
            }

        });

        return statusLiveData;

    }

}