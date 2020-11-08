package com.kenova.agribiz.repository.paypal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.kenova.agribiz.AppExecutors;
import com.kenova.agribiz.Config;
import com.kenova.agribiz.api.ApiResponse;
import com.kenova.agribiz.api.PSApiService;
import com.kenova.agribiz.db.PSCoreDb;
import com.kenova.agribiz.repository.common.PSRepository;
import com.kenova.agribiz.utils.Utils;
import com.kenova.agribiz.viewobject.ApiStatus;
import com.kenova.agribiz.viewobject.common.Resource;

import java.io.IOException;

import javax.inject.Inject;

import retrofit2.Response;

public class PaypalRepository extends PSRepository {


    @Inject
    PaypalRepository(PSApiService psApiService, AppExecutors appExecutors, PSCoreDb db) {
        super(psApiService, appExecutors, db);

        Utils.psLog("Inside PaypalRepository");
    }

    public LiveData<Resource<Boolean>> getPaypalToken() {

        final MutableLiveData<Resource<Boolean>> statusLiveData = new MutableLiveData<>();

        appExecutors.networkIO().execute(() -> {

            Response<ApiStatus> response;

            try {
                response = psApiService.getPaypalToken(Config.API_KEY).execute();

                ApiResponse<ApiStatus> apiResponse = new ApiResponse<>(response);

                if (apiResponse.isSuccessful()) {
                    if(apiResponse.body != null) {
                        statusLiveData.postValue(Resource.successWithMsg(apiResponse.body.message, true));
                    }else {
                        statusLiveData.postValue(Resource.error(apiResponse.errorMessage, false));
                    }
                } else {
                    statusLiveData.postValue(Resource.error(apiResponse.errorMessage, false));
                }

            } catch (IOException e) {
                statusLiveData.postValue(Resource.error(e.getMessage(), false));
            }

        });

        return statusLiveData;
    }
}
