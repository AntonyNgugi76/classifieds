package com.kenova.agribiz.viewmodel.itemtype;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import com.kenova.agribiz.repository.itemtype.ItemTypeRepository;
import com.kenova.agribiz.utils.AbsentLiveData;
import com.kenova.agribiz.utils.Utils;
import com.kenova.agribiz.viewmodel.common.PSViewModel;
import com.kenova.agribiz.viewobject.ItemType;
import com.kenova.agribiz.viewobject.common.Resource;
import com.kenova.agribiz.viewobject.holder.CategoryParameterHolder;
import com.kenova.agribiz.viewobject.holder.ItemParameterHolder;

import java.util.List;

import javax.inject.Inject;

public class ItemTypeViewModel extends PSViewModel {


    //region Variables

    private final LiveData<Resource<List<ItemType>>> itemTypeListData;
    private MutableLiveData<ItemTypeViewModel.TmpDataHolder> itemTypeListObj = new MutableLiveData<>();

    private final LiveData<Resource<Boolean>> nextPageLoadingStateData;
    private MutableLiveData<ItemTypeViewModel.TmpDataHolder> nextPageLoadingStateObj = new MutableLiveData<>();

    public ItemParameterHolder productParameterHolder = new ItemParameterHolder();

    public CategoryParameterHolder categoryParameterHolder = new CategoryParameterHolder();

    //endregion

    //region Constructors

    @Inject
    ItemTypeViewModel(ItemTypeRepository repository) {

        Utils.psLog("ItemTypeViewModel");

        itemTypeListData = Transformations.switchMap(itemTypeListObj, obj -> {
            if (obj == null) {
                return AbsentLiveData.create();
            }

            Utils.psLog("ItemTypeViewModel : categories");
            return repository.getAllItemTypeList(obj.limit, obj.offset);
        });

        nextPageLoadingStateData = Transformations.switchMap(nextPageLoadingStateObj, obj -> {
            if (obj == null) {
                return AbsentLiveData.create();
            }

            Utils.psLog("ItemType List.");
            return repository.getNextPageItemTypeList(obj.limit, obj.offset);
        });

    }

    //endregion

    public void setItemTypeListObj(String limit, String offset) {
        if (!isLoading) {
            TmpDataHolder tmpDataHolder = new TmpDataHolder();
            tmpDataHolder.offset = offset;
            tmpDataHolder.limit = limit;
            itemTypeListObj.setValue(tmpDataHolder);

            // start loading
            setLoadingState(true);
        }
    }

    public LiveData<Resource<List<ItemType>>> getItemTypeListData() {
        return itemTypeListData;
    }

    //Get Latest Category Next Page
    public void setNextPageLoadingStateObj(String limit, String offset) {

        if (!isLoading) {
            TmpDataHolder tmpDataHolder = new TmpDataHolder();
            tmpDataHolder.offset = offset;
            tmpDataHolder.limit = limit;
            nextPageLoadingStateObj.setValue(tmpDataHolder);

            // start loading
            setLoadingState(true);
        }
    }

    public LiveData<Resource<Boolean>> getNextPageLoadingStateData() {
        return nextPageLoadingStateData;
    }


    class TmpDataHolder {
        public String limit = "";
        public String offset = "";
        public String cityId = "";
    }
}