package com.kenova.classifieds.viewmodel.item;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import com.kenova.classifieds.repository.item.ItemRepository;
import com.kenova.classifieds.utils.AbsentLiveData;
import com.kenova.classifieds.viewmodel.common.PSViewModel;
import com.kenova.classifieds.viewobject.common.Resource;

import javax.inject.Inject;

public class TouchCountViewModel extends PSViewModel {
    private final LiveData<Resource<Boolean>> sendTouchCountPostData;
    private MutableLiveData<TouchCountViewModel.TmpDataHolder> sendTouchCountDataPostObj = new MutableLiveData<>();

    @Inject
    TouchCountViewModel(ItemRepository itemRepository) {
        sendTouchCountPostData = Transformations.switchMap(sendTouchCountDataPostObj, obj -> {

            if (obj == null) {
                return AbsentLiveData.create();
            }
            return itemRepository.uploadTouchCountPostToServer(obj.userId, obj.itemId);
        });
    }

    public void setTouchCountPostDataObj(String userId, String itemId) {

        TouchCountViewModel.TmpDataHolder tmpDataHolder = new TouchCountViewModel.TmpDataHolder();
        tmpDataHolder.userId = userId;
        tmpDataHolder.itemId = itemId;

        sendTouchCountDataPostObj.setValue(tmpDataHolder);
    }

    public LiveData<Resource<Boolean>> getTouchCountPostData() {
        return sendTouchCountPostData;
    }

    class TmpDataHolder {
        public String userId = "";
        String itemId = "";
    }
}
