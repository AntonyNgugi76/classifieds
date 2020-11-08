package com.kenova.classifieds.viewmodel.pscount;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import com.kenova.classifieds.Config;
import com.kenova.classifieds.repository.pscount.PSCountRepository;
import com.kenova.classifieds.utils.AbsentLiveData;
import com.kenova.classifieds.utils.Utils;
import com.kenova.classifieds.viewmodel.common.PSViewModel;
import com.kenova.classifieds.viewobject.PSCount;

import com.kenova.classifieds.viewobject.common.Resource;

import javax.inject.Inject;

/**
 * Created by Panacea-Soft on 2019-08-28.
 * Contact Email : teamps.is.cool@gmail.com
 */


public class PSCountViewModel extends PSViewModel {

    private final LiveData<Resource<PSCount>> psCountData;
    private MutableLiveData<TmpDataHolder> psCountObj = new MutableLiveData<>();

    public String appSettingLat;
    public String appSettingLng;

    @Inject
    PSCountViewModel(PSCountRepository repository) {
        psCountData = Transformations.switchMap(psCountObj, obj -> {
            if (obj == null) {
                return AbsentLiveData.create();
            }
            Utils.psLog("PSCountViewModel");
            return repository.getPSCount(Config.API_KEY, obj.userId, obj.deviceToken);
        });
    }

    public void setPsCountObj(String userId, String deviceToken) {

        TmpDataHolder tmpDataHolder = new TmpDataHolder(userId, deviceToken);

        this.psCountObj.setValue(tmpDataHolder);
    }

    public LiveData<Resource<PSCount>> getPSCount() {
        return psCountData;
    }

    class TmpDataHolder {
        String userId, deviceToken;

        private TmpDataHolder(String userId, String deviceToken) {
            this.userId = userId;
            this.deviceToken = deviceToken;
        }
    }

}