package com.kenova.agribiz.repository.itemlocation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;

import com.kenova.agribiz.AppExecutors;
import com.kenova.agribiz.Config;
import com.kenova.agribiz.api.ApiResponse;
import com.kenova.agribiz.api.PSApiService;
import com.kenova.agribiz.db.ItemLocationDao;
import com.kenova.agribiz.db.PSCoreDb;
import com.kenova.agribiz.repository.common.NetworkBoundResource;
import com.kenova.agribiz.repository.common.PSRepository;
import com.kenova.agribiz.utils.Utils;
import com.kenova.agribiz.viewobject.ItemLocation;
import com.kenova.agribiz.viewobject.common.Resource;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ItemLocationRepository extends PSRepository {
    private ItemLocationDao itemLocationDao;

    @Inject
    ItemLocationRepository(PSApiService psApiService, AppExecutors appExecutors, PSCoreDb db, ItemLocationDao itemLocationDao) {

        super(psApiService, appExecutors, db);
        this.itemLocationDao = itemLocationDao;
    }

    public LiveData<Resource<List<ItemLocation>>> getAllItemLocationList(String limit, String offset) {

        return new NetworkBoundResource<List<ItemLocation>, List<ItemLocation>>(appExecutors) {

            @Override
            protected void saveCallResult(@NonNull List<ItemLocation> itemTypeList) {
                Utils.psLog("SaveCallResult of getAllCategoriesWithUserId");

                try {
                    db.runInTransaction(() -> {
                        itemLocationDao.deleteAllItemLocation();

                        itemLocationDao.insertAll(itemTypeList);
                    });
                } catch (Exception ex) {
                    Utils.psErrorLog("Error at ", ex);
                }
            }


            @Override
            protected boolean shouldFetch(@Nullable List<ItemLocation> data) {

                return connectivity.isConnected();
            }

            @NonNull
            @Override
            protected LiveData<List<ItemLocation>> loadFromDb() {

                Utils.psLog("Load From Db (All Categories)");

                return itemLocationDao.getAllItemLocation();

            }

            @NonNull
            @Override
            protected LiveData<ApiResponse<List<ItemLocation>>> createCall() {
                Utils.psLog("Call Get All Categories webservice.");

                return psApiService.getItemLocationList(Config.API_KEY, limit, offset);
            }

            @Override
            protected void onFetchFailed(String message) {
                Utils.psLog("Fetch Failed of About Us");
            }

        }.asLiveData();
    }

    public LiveData<Resource<Boolean>> getNextPageLocationList( String limit, String offset) {

        final MediatorLiveData<Resource<Boolean>> statusLiveData = new MediatorLiveData<>();
        LiveData<ApiResponse<List<ItemLocation>>> apiResponse = psApiService.getItemLocationList(Config.API_KEY, limit, offset);

        statusLiveData.addSource(apiResponse, response -> {

            statusLiveData.removeSource(apiResponse);

            //noinspection Constant Conditions
            if (response.isSuccessful()) {

                appExecutors.diskIO().execute(() -> {

                    try {
                        db.runInTransaction(() -> {
                            if (apiResponse.getValue() != null) {

                                itemLocationDao.insertAll(apiResponse.getValue().body);
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