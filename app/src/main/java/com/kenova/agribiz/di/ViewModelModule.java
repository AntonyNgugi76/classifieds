package com.kenova.agribiz.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.kenova.agribiz.viewmodel.ItemPaidHistoryViewModel.ItemPaidHistoryViewModel;
import com.kenova.agribiz.viewmodel.aboutus.AboutUsViewModel;
import com.kenova.agribiz.viewmodel.apploading.PSAPPLoadingViewModel;
import com.kenova.agribiz.viewmodel.blog.BlogViewModel;
import com.kenova.agribiz.viewmodel.chat.ChatViewModel;
import com.kenova.agribiz.viewmodel.chathistory.ChatHistoryViewModel;
import com.kenova.agribiz.viewmodel.city.CityViewModel;
import com.kenova.agribiz.viewmodel.city.FeaturedCitiesViewModel;
import com.kenova.agribiz.viewmodel.city.PopularCitiesViewModel;
import com.kenova.agribiz.viewmodel.city.RecentCitiesViewModel;
import com.kenova.agribiz.viewmodel.clearalldata.ClearAllDataViewModel;
import com.kenova.agribiz.viewmodel.common.NotificationViewModel;
import com.kenova.agribiz.viewmodel.common.PSNewsViewModelFactory;
import com.kenova.agribiz.viewmodel.contactus.ContactUsViewModel;
import com.kenova.agribiz.viewmodel.homelist.HomeTrendingCategoryListViewModel;
import com.kenova.agribiz.viewmodel.image.ImageViewModel;
import com.kenova.agribiz.viewmodel.item.DisabledViewModel;
import com.kenova.agribiz.viewmodel.item.FavouriteViewModel;
import com.kenova.agribiz.viewmodel.item.HistoryViewModel;
import com.kenova.agribiz.viewmodel.item.PendingViewModel;
import com.kenova.agribiz.viewmodel.item.PopularItemViewModel;
import com.kenova.agribiz.viewmodel.item.RecentItemViewModel;
import com.kenova.agribiz.viewmodel.item.RejectedViewModel;
import com.kenova.agribiz.viewmodel.item.SpecsViewModel;
import com.kenova.agribiz.viewmodel.item.TouchCountViewModel;
import com.kenova.agribiz.viewmodel.itemcategory.ItemCategoryViewModel;
import com.kenova.agribiz.viewmodel.itemcondition.ItemConditionViewModel;
import com.kenova.agribiz.viewmodel.itemcurrency.ItemCurrencyViewModel;
import com.kenova.agribiz.viewmodel.itemdealoption.ItemDealOptionViewModel;
import com.kenova.agribiz.viewmodel.itemfromfollower.ItemFromFollowerViewModel;
import com.kenova.agribiz.viewmodel.itemlocation.ItemLocationViewModel;
import com.kenova.agribiz.viewmodel.itempricetype.ItemPriceTypeViewModel;
import com.kenova.agribiz.viewmodel.itemsubcategory.ItemSubCategoryViewModel;
import com.kenova.agribiz.viewmodel.itemtype.ItemTypeViewModel;
import com.kenova.agribiz.viewmodel.notification.NotificationsViewModel;
import com.kenova.agribiz.viewmodel.paypal.PaypalViewModel;
import com.kenova.agribiz.viewmodel.pscount.PSCountViewModel;
import com.kenova.agribiz.viewmodel.rating.RatingViewModel;
import com.kenova.agribiz.viewmodel.user.UserViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by Panacea-Soft on 11/16/17.
 * Contact Email : teamps.is.cool@gmail.com
 */

@Module
abstract class ViewModelModule {

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(PSNewsViewModelFactory factory);

    @Binds
    @IntoMap
    @ViewModelKey(UserViewModel.class)
    abstract ViewModel bindUserViewModel(UserViewModel userViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(AboutUsViewModel.class)
    abstract ViewModel bindAboutUsViewModel(AboutUsViewModel aboutUsViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemLocationViewModel.class)
    abstract ViewModel bindItemLocationViewModel(ItemLocationViewModel itemLocationViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemDealOptionViewModel.class)
    abstract ViewModel bindItemDealOptionViewModel(ItemDealOptionViewModel itemDealOptionViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemConditionViewModel.class)
    abstract ViewModel bindItemConditionViewModel(ItemConditionViewModel itemConditionViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ImageViewModel.class)
    abstract ViewModel bindImageViewModel(ImageViewModel imageViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemTypeViewModel.class)
    abstract ViewModel bindItemTypeViewModel(ItemTypeViewModel itemTypeViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(RatingViewModel.class)
    abstract ViewModel bindRatingViewModel(RatingViewModel ratingViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(NotificationViewModel.class)
    abstract ViewModel bindNotificationViewModel(NotificationViewModel notificationViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemFromFollowerViewModel.class)
    abstract ViewModel bindItemFromFollowerViewModel(ItemFromFollowerViewModel itemFromFollowerViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemPriceTypeViewModel.class)
    abstract ViewModel bindItemPriceTypeViewModel(ItemPriceTypeViewModel itemPriceTypeViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemCurrencyViewModel.class)
    abstract ViewModel bindItemCurrencyViewModel(ItemCurrencyViewModel itemCurrencyViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(ContactUsViewModel.class)
    abstract ViewModel bindContactUsViewModel(ContactUsViewModel contactUsViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(DisabledViewModel.class)
    abstract ViewModel bindDisabledViewModel(DisabledViewModel disabledViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(RejectedViewModel.class)
    abstract ViewModel bindRejectedViewModel(RejectedViewModel rejectedViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PendingViewModel.class)
    abstract ViewModel bindPendingViewModel(PendingViewModel pendingViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(FavouriteViewModel.class)
    abstract ViewModel bindFavouriteViewModel(FavouriteViewModel favouriteViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(TouchCountViewModel.class)
    abstract ViewModel bindTouchCountViewModel(TouchCountViewModel touchCountViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(SpecsViewModel.class)
    abstract ViewModel bindProductSpecsViewModel(SpecsViewModel specsViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(HistoryViewModel.class)
    abstract ViewModel bindHistoryProductViewModel(HistoryViewModel historyViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemCategoryViewModel.class)
    abstract ViewModel bindCityCategoryViewModel(ItemCategoryViewModel itemCategoryViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(NotificationsViewModel.class)
    abstract ViewModel bindNotificationListViewModel(NotificationsViewModel notificationListViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(HomeTrendingCategoryListViewModel.class)
    abstract ViewModel bindHomeTrendingCategoryListViewModel(HomeTrendingCategoryListViewModel transactionListViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(BlogViewModel.class)
    abstract ViewModel bindNewsFeedViewModel(BlogViewModel blogViewModel);

//    @Binds
//    @IntoMap
//    @ViewModelKey(PSAppInfoViewModel.class)
//    abstract ViewModel bindPSAppInfoViewModel(PSAppInfoViewModel psAppInfoViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ClearAllDataViewModel.class)
    abstract ViewModel bindClearAllDataViewModel(ClearAllDataViewModel clearAllDataViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(CityViewModel.class)
    abstract ViewModel bindCityViewModel(CityViewModel cityViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(com.kenova.agribiz.viewmodel.item.ItemViewModel.class)
    abstract ViewModel bindItemViewModel(com.kenova.agribiz.viewmodel.item.ItemViewModel itemViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PopularItemViewModel.class)
    abstract ViewModel bindPopularItemViewModel(PopularItemViewModel popularItemViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(RecentItemViewModel.class)
    abstract ViewModel bindRecentItemViewModel(RecentItemViewModel recentItemViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PSAPPLoadingViewModel.class)
    abstract ViewModel bindPSAPPLoadingViewModel(PSAPPLoadingViewModel psappLoadingViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PopularCitiesViewModel.class)
    abstract ViewModel bindPopularCitiesViewModel(PopularCitiesViewModel popularCitiesViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(FeaturedCitiesViewModel.class)
    abstract ViewModel bindFeaturedCitiesViewModel(FeaturedCitiesViewModel featuredCitiesViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(RecentCitiesViewModel.class)
    abstract ViewModel bindRecentCitiesViewModel(RecentCitiesViewModel recentCitiesViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemSubCategoryViewModel.class)
    abstract ViewModel bindItemSubCategoryViewModel(ItemSubCategoryViewModel itemSubCategoryViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ChatViewModel.class)
    abstract ViewModel bindChatViewModel(ChatViewModel chatViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ChatHistoryViewModel.class)
    abstract ViewModel bindSellerViewModel(ChatHistoryViewModel chatHistoryViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PSCountViewModel.class)
    abstract ViewModel bindPSCountViewModel(PSCountViewModel psCountViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PaypalViewModel.class)
    abstract ViewModel bindPaypalViewModel(PaypalViewModel paypalViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemPaidHistoryViewModel.class)
    abstract ViewModel bindItemPaidHistoryViewModel(ItemPaidHistoryViewModel itemPaidHistoryViewModel);
}


