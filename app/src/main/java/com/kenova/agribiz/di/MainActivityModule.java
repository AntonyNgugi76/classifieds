package com.kenova.agribiz.di;


import com.kenova.agribiz.MainActivity;
import com.kenova.agribiz.ui.apploading.AppLoadingActivity;
import com.kenova.agribiz.ui.apploading.AppLoadingFragment;
import com.kenova.agribiz.ui.blog.detail.BlogDetailActivity;
import com.kenova.agribiz.ui.blog.detail.BlogDetailFragment;
import com.kenova.agribiz.ui.blog.list.BlogListActivity;
import com.kenova.agribiz.ui.blog.list.BlogListFragment;
import com.kenova.agribiz.ui.category.categoryfilter.CategoryFilterFragment;
import com.kenova.agribiz.ui.category.list.CategoryListActivity;
import com.kenova.agribiz.ui.category.list.CategoryListFragment;
import com.kenova.agribiz.ui.chat.chat.ChatActivity;
import com.kenova.agribiz.ui.chat.chat.ChatFragment;
import com.kenova.agribiz.ui.chat.chatimage.ChatImageFullScreenActivity;
import com.kenova.agribiz.ui.chat.chatimage.ChatImageFullScreenFragment;
import com.kenova.agribiz.ui.chathistory.BuyerFragment;
import com.kenova.agribiz.ui.chathistory.MessageFragment;
import com.kenova.agribiz.ui.chathistory.SellerFragment;
import com.kenova.agribiz.ui.city.menu.CityMenuFragment;
import com.kenova.agribiz.ui.city.selectedcity.SelectedCityActivity;
import com.kenova.agribiz.ui.city.selectedcity.SelectedCityFragment;
import com.kenova.agribiz.ui.contactus.ContactUsFragment;
import com.kenova.agribiz.ui.customcamera.CameraActivity;
import com.kenova.agribiz.ui.customcamera.CameraFragment;
import com.kenova.agribiz.ui.customcamera.setting.CameraSettingActivity;
import com.kenova.agribiz.ui.customcamera.setting.CameraSettingFragment;
import com.kenova.agribiz.ui.dashboard.DashBoardSearchCategoryFragment;
import com.kenova.agribiz.ui.dashboard.DashBoardSearchFragment;
import com.kenova.agribiz.ui.dashboard.DashBoardSearchSubCategoryFragment;
import com.kenova.agribiz.ui.dashboard.DashboardSearchByCategoryActivity;
import com.kenova.agribiz.ui.forceupdate.ForceUpdateActivity;
import com.kenova.agribiz.ui.forceupdate.ForceUpdateFragment;
import com.kenova.agribiz.ui.gallery.GalleryActivity;
import com.kenova.agribiz.ui.gallery.GalleryFragment;
import com.kenova.agribiz.ui.gallery.detail.GalleryDetailActivity;
import com.kenova.agribiz.ui.gallery.detail.GalleryDetailFragment;
import com.kenova.agribiz.ui.item.detail.ItemActivity;
import com.kenova.agribiz.ui.item.detail.ItemFragment;
import com.kenova.agribiz.ui.item.entry.ItemEntryActivity;
import com.kenova.agribiz.ui.item.entry.ItemEntryFragment;
import com.kenova.agribiz.ui.item.favourite.FavouriteListActivity;
import com.kenova.agribiz.ui.item.favourite.FavouriteListFragment;
import com.kenova.agribiz.ui.item.history.HistoryFragment;
import com.kenova.agribiz.ui.item.history.UserHistoryListActivity;
import com.kenova.agribiz.ui.item.itemcondition.ItemConditionFragment;
import com.kenova.agribiz.ui.item.itemcurrency.ItemCurrencyTypeFragment;
import com.kenova.agribiz.ui.item.itemdealoption.ItemDealOptionTypeFragment;
import com.kenova.agribiz.ui.item.itemfromfollower.ItemFromFollowerListActivity;
import com.kenova.agribiz.ui.item.itemfromfollower.ItemFromFollowerListFragment;
import com.kenova.agribiz.ui.item.itemlocation.ItemLocationFragment;
import com.kenova.agribiz.ui.item.itempricetype.ItemPriceTypeFragment;
import com.kenova.agribiz.ui.item.itemtype.ItemTypeFragment;
import com.kenova.agribiz.ui.item.itemtype.SearchViewActivity;
import com.kenova.agribiz.ui.item.loginUserItem.LoginUserItemFragment;
import com.kenova.agribiz.ui.item.loginUserItem.LoginUserItemListActivity;
import com.kenova.agribiz.ui.item.loginUserItem.LoginUserPaidItemFragment;
import com.kenova.agribiz.ui.item.map.MapActivity;
import com.kenova.agribiz.ui.item.map.MapFragment;
import com.kenova.agribiz.ui.item.map.PickMapFragment;
import com.kenova.agribiz.ui.item.map.mapFilter.MapFilteringActivity;
import com.kenova.agribiz.ui.item.map.mapFilter.MapFilteringFragment;
import com.kenova.agribiz.ui.item.promote.ItemPromoteActivity;
import com.kenova.agribiz.ui.item.promote.ItemPromoteFragment;
import com.kenova.agribiz.ui.item.rating.RatingListActivity;
import com.kenova.agribiz.ui.item.rating.RatingListFragment;
import com.kenova.agribiz.ui.item.readmore.ReadMoreActivity;
import com.kenova.agribiz.ui.item.readmore.ReadMoreFragment;
import com.kenova.agribiz.ui.item.search.searchlist.SearchListActivity;
import com.kenova.agribiz.ui.item.search.searchlist.SearchListFragment;
import com.kenova.agribiz.ui.item.search.specialfilterbyattributes.FilteringActivity;
import com.kenova.agribiz.ui.item.search.specialfilterbyattributes.FilteringFragment;
import com.kenova.agribiz.ui.language.LanguageFragment;
import com.kenova.agribiz.ui.location.LocationActivity;
import com.kenova.agribiz.ui.notification.detail.NotificationActivity;
import com.kenova.agribiz.ui.notification.detail.NotificationFragment;
import com.kenova.agribiz.ui.notification.list.NotificationListActivity;
import com.kenova.agribiz.ui.notification.list.NotificationListFragment;
import com.kenova.agribiz.ui.notification.setting.NotificationSettingActivity;
import com.kenova.agribiz.ui.notification.setting.NotificationSettingFragment;
import com.kenova.agribiz.ui.privacypolicy.PrivacyPolicyActivity;
import com.kenova.agribiz.ui.privacypolicy.PrivacyPolicyFragment;
import com.kenova.agribiz.ui.safetytip.SafetyTipFragment;
import com.kenova.agribiz.ui.safetytip.SafetyTipsActivity;
import com.kenova.agribiz.ui.setting.SettingActivity;
import com.kenova.agribiz.ui.setting.SettingFragment;
import com.kenova.agribiz.ui.setting.appinfo.AppInfoActivity;
import com.kenova.agribiz.ui.setting.appinfo.AppInfoFragment;
import com.kenova.agribiz.ui.stripe.StripeActivity;
import com.kenova.agribiz.ui.stripe.StripeFragment;
import com.kenova.agribiz.ui.subcategory.SubCategoryActivity;
import com.kenova.agribiz.ui.subcategory.SubCategoryFragment;
import com.kenova.agribiz.ui.user.PasswordChangeActivity;
import com.kenova.agribiz.ui.user.PasswordChangeFragment;
import com.kenova.agribiz.ui.user.ProfileEditActivity;
import com.kenova.agribiz.ui.user.ProfileEditFragment;
import com.kenova.agribiz.ui.user.ProfileFragment;
import com.kenova.agribiz.ui.user.UserFBRegisterActivity;
import com.kenova.agribiz.ui.user.UserFBRegisterFragment;
import com.kenova.agribiz.ui.user.UserForgotPasswordActivity;
import com.kenova.agribiz.ui.user.UserForgotPasswordFragment;
import com.kenova.agribiz.ui.user.UserLoginActivity;
import com.kenova.agribiz.ui.user.UserLoginFragment;
import com.kenova.agribiz.ui.user.UserRegisterActivity;
import com.kenova.agribiz.ui.user.UserRegisterFragment;
import com.kenova.agribiz.ui.user.phonelogin.PhoneLoginActivity;
import com.kenova.agribiz.ui.user.phonelogin.PhoneLoginFragment;
import com.kenova.agribiz.ui.user.userlist.UserListActivity;
import com.kenova.agribiz.ui.user.userlist.UserListFragment;
import com.kenova.agribiz.ui.user.userlist.detail.UserDetailActivity;
import com.kenova.agribiz.ui.user.userlist.detail.UserDetailFragment;
import com.kenova.agribiz.ui.user.verifyemail.VerifyEmailActivity;
import com.kenova.agribiz.ui.user.verifyemail.VerifyEmailFragment;
import com.kenova.agribiz.ui.user.verifyphone.VerifyMobileActivity;
import com.kenova.agribiz.ui.user.verifyphone.VerifyMobileFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

//import com.kenova.agribiz.ui.followinguser.FollowingUserActivity;
//import com.kenova.agribiz.ui.followinguser.FollowingUserFragment;
//import com.kenova.agribiz.ui.followinguser.detail.FollowingUserDetailActivity;
//import com.kenova.agribiz.ui.followinguser.detail.FollowingUserDetailFragment;

/**
 * Created by Panacea-Soft on 11/15/17.
 * Contact Email : teamps.is.cool@gmail.com
 */


@Module
abstract class MainActivityModule {

    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity contributeMainActivity();

    @ContributesAndroidInjector(modules = FavouriteListModule.class)
    abstract FavouriteListActivity contributeFavouriteListActivity();

    @ContributesAndroidInjector(modules = UserHistoryModule.class)
    abstract UserHistoryListActivity contributeUserHistoryListActivity();

    @ContributesAndroidInjector(modules = UserRegisterModule.class)
    abstract UserRegisterActivity contributeUserRegisterActivity();

    @ContributesAndroidInjector(modules = UserFBRegisterModule.class)
    abstract UserFBRegisterActivity contributeUserFBRegisterActivity();

    @ContributesAndroidInjector(modules = UserForgotPasswordModule.class)
    abstract UserForgotPasswordActivity contributeUserForgotPasswordActivity();

    @ContributesAndroidInjector(modules = UserLoginModule.class)
    abstract UserLoginActivity contributeUserLoginActivity();

    @ContributesAndroidInjector(modules = PasswordChangeModule.class)
    abstract PasswordChangeActivity contributePasswordChangeActivity();

    @ContributesAndroidInjector(modules = FilteringModule.class)
    abstract FilteringActivity filteringActivity();

    @ContributesAndroidInjector(modules = SubCategoryActivityModule.class)
    abstract SubCategoryActivity subCategoryActivity();

    @ContributesAndroidInjector(modules = NotificationModule.class)
    abstract NotificationListActivity notificationActivity();

    @ContributesAndroidInjector(modules = CameraSettingActivityModule.class)
    abstract CameraSettingActivity cameraSettingActivity();

   @ContributesAndroidInjector(modules = PhoneLoginActivityModule.class)
    abstract PhoneLoginActivity contributePhoneLoginActivity();

    @ContributesAndroidInjector(modules = SearchActivityModule.class)
    abstract SearchListActivity contributeSearchListActivity();

    @ContributesAndroidInjector(modules = CameraActivityModule.class)
    abstract CameraActivity contributeCameraActivity();

    @ContributesAndroidInjector(modules = ItemEntryActivityModule.class)
    abstract ItemEntryActivity contributeItemEntryActivity();

    @ContributesAndroidInjector(modules = ItemPromoteEntryActivityModule.class)
    abstract ItemPromoteActivity contributeItemPromoteEntryActivity();

    @ContributesAndroidInjector(modules = NotificationDetailModule.class)
    abstract NotificationActivity notificationDetailActivity();

    @ContributesAndroidInjector(modules = ItemActivityModule.class)
    abstract ItemActivity itemActivity();

    @ContributesAndroidInjector(modules = SafetyTipsActivityModule.class)
    abstract SafetyTipsActivity safetyTipsActivity();

    @ContributesAndroidInjector(modules = GalleryDetailActivityModule.class)
    abstract GalleryDetailActivity galleryDetailActivity();

    @ContributesAndroidInjector(modules = GalleryActivityModule.class)
    abstract GalleryActivity galleryActivity();

    @ContributesAndroidInjector(modules = SearchByCategoryActivityModule.class)
    abstract DashboardSearchByCategoryActivity searchByCategoryActivity();

    @ContributesAndroidInjector(modules = readMoreActivityModule.class)
    abstract ReadMoreActivity readMoreActivity();

    @ContributesAndroidInjector(modules = EditSettingModule.class)
    abstract SettingActivity editSettingActivity();

    @ContributesAndroidInjector(modules = LanguageChangeModule.class)
    abstract NotificationSettingActivity languageChangeActivity();

    @ContributesAndroidInjector(modules = ProfileEditModule.class)
    abstract ProfileEditActivity contributeProfileEditActivity();

    @ContributesAndroidInjector(modules = AppInfoModule.class)
    abstract AppInfoActivity AppInfoActivity();

    @ContributesAndroidInjector(modules = CategoryListActivityAppInfoModule.class)
    abstract CategoryListActivity categoryListActivity();

    @ContributesAndroidInjector(modules = RatingListActivityModule.class)
    abstract RatingListActivity ratingListActivity();

    @ContributesAndroidInjector(modules = SelectedCityModule.class)
    abstract SelectedCityActivity selectedShopActivity();

    @ContributesAndroidInjector(modules = SelectedShopListBlogModule.class)
    abstract BlogListActivity selectedShopListBlogActivity();

    @ContributesAndroidInjector(modules = BlogDetailModule.class)
    abstract BlogDetailActivity blogDetailActivity();

    @ContributesAndroidInjector(modules = MapActivityModule.class)
    abstract MapActivity mapActivity();

    @ContributesAndroidInjector(modules = forceUpdateModule.class)
    abstract ForceUpdateActivity forceUpdateActivity();

    @ContributesAndroidInjector(modules = MapFilteringModule.class)
    abstract MapFilteringActivity mapFilteringActivity();

    @ContributesAndroidInjector(modules = SearchViewActivityModule.class)
    abstract SearchViewActivity searchViewActivity();

    @ContributesAndroidInjector(modules = LoginUserItemListActivityModule.class)
    abstract LoginUserItemListActivity loginUserItemListActivity();

    @ContributesAndroidInjector(modules = chatActivityModule.class)
    abstract ChatActivity chatActivity();

    @ContributesAndroidInjector(modules = ImageFullScreenModule.class)
    abstract ChatImageFullScreenActivity imageFullScreenActivity();

//    @ContributesAndroidInjector(modules = LoginUserItemModule.class)
//    abstract LoginUserItemListActivity contributeLoginUserItemListActivity();

    @ContributesAndroidInjector(modules = FollowerUserModule.class)
    abstract UserListActivity contributeFollowerUserListActivity();

    @ContributesAndroidInjector(modules = VerifyEmailModule.class)
    abstract VerifyEmailActivity contributeVerifyEmailActivity();

    @ContributesAndroidInjector(modules = VerifyMobileModule.class)
    abstract VerifyMobileActivity contributeVerifyMobileActivity();

    @ContributesAndroidInjector(modules = FollowerUserDetailModule.class)
    abstract UserDetailActivity contributeFollowerUserDetailActivity();

    @ContributesAndroidInjector(modules = AppLoadingActivityModule.class)
    abstract AppLoadingActivity appLoadingActivity();

    @ContributesAndroidInjector(modules = ItemFromFollowerListModule.class)
    abstract ItemFromFollowerListActivity itemFromFollowerListActivity();

    @ContributesAndroidInjector(modules = LocationActivityModule.class)
    abstract LocationActivity locationActivity();

    @ContributesAndroidInjector(modules = PrivacyAndPolicyActivityModule.class)
    abstract PrivacyPolicyActivity privacyPolicyActivity();

    @ContributesAndroidInjector(modules = StripeModule.class)
    abstract StripeActivity stripeActivity();
}


@Module
abstract class MainModule {

    @ContributesAndroidInjector
    abstract ContactUsFragment contributeContactUsFragment();

    @ContributesAndroidInjector
    abstract VerifyMobileFragment contributeVerifyMobileFragment();

    @ContributesAndroidInjector
    abstract PhoneLoginFragment contributePhoneLoginFragment();

    @ContributesAndroidInjector
    abstract BuyerFragment contributeBuyerFragment();

    @ContributesAndroidInjector
    abstract SellerFragment contributeSellerFragment();

    @ContributesAndroidInjector
    abstract UserLoginFragment contributeUserLoginFragment();

    @ContributesAndroidInjector
    abstract UserForgotPasswordFragment contributeUserForgotPasswordFragment();

    @ContributesAndroidInjector
    abstract UserRegisterFragment contributeUserRegisterFragment();

    @ContributesAndroidInjector
    abstract UserFBRegisterFragment contributeUserFBRegisterFragment();

    @ContributesAndroidInjector
    abstract NotificationSettingFragment contributeNotificationSettingFragment();

    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();

    @ContributesAndroidInjector
    abstract LanguageFragment contributeLanguageFragment();

    @ContributesAndroidInjector
    abstract FavouriteListFragment contributeFavouriteListFragment();

    @ContributesAndroidInjector
    abstract LoginUserPaidItemFragment contributeLoginUserPaidItemFragment();

    @ContributesAndroidInjector
    abstract SettingFragment contributEditSettingFragment();

    @ContributesAndroidInjector
    abstract HistoryFragment historyFragment();

    @ContributesAndroidInjector
    abstract NotificationListFragment contributeNotificationFragment();

    @ContributesAndroidInjector
    abstract AppInfoFragment contributeAppInfoFragment();

    @ContributesAndroidInjector
    abstract SelectedCityFragment contributeSelectedCityFragment();

    @ContributesAndroidInjector
    abstract SearchListFragment contributeSearchListFragment();

    @ContributesAndroidInjector
    abstract CategoryListFragment contributeCategoryListFragment();

    @ContributesAndroidInjector
    abstract MessageFragment contributeMessageFragment();

    @ContributesAndroidInjector
    abstract DashBoardSearchFragment contributeDashBoardSearchFragment();

    @ContributesAndroidInjector
    abstract VerifyEmailFragment contributeVerifyEmailFragment();

    @ContributesAndroidInjector
    abstract PrivacyPolicyFragment contributePrivacyPolicyFragment();
}


@Module
abstract class ProfileEditModule {
    @ContributesAndroidInjector
    abstract ProfileEditFragment contributeProfileEditFragment();
}

@Module
abstract class UserFBRegisterModule {
    @ContributesAndroidInjector
    abstract UserFBRegisterFragment contributeUserFBRegisterFragment();
}

@Module
abstract class ItemActivityModule {
    @ContributesAndroidInjector
    abstract ItemFragment contributeItemFragment();
}

@Module
abstract class SafetyTipsActivityModule {
    @ContributesAndroidInjector
    abstract SafetyTipFragment contributeSafetyTipFragment();
}

@Module
abstract class FavouriteListModule {
    @ContributesAndroidInjector
    abstract FavouriteListFragment contributeFavouriteFragment();
}


@Module
abstract class UserRegisterModule {
    @ContributesAndroidInjector
    abstract UserRegisterFragment contributeUserRegisterFragment();
}

@Module
abstract class UserForgotPasswordModule {
    @ContributesAndroidInjector
    abstract UserForgotPasswordFragment contributeUserForgotPasswordFragment();
}

@Module
abstract class UserLoginModule {
    @ContributesAndroidInjector
    abstract UserLoginFragment contributeUserLoginFragment();
}

@Module
abstract class PasswordChangeModule {
    @ContributesAndroidInjector
    abstract PasswordChangeFragment contributePasswordChangeFragment();
}


@Module
abstract class NotificationModule {
    @ContributesAndroidInjector
    abstract NotificationListFragment notificationFragment();
}

@Module
abstract class CameraSettingActivityModule {
    @ContributesAndroidInjector
    abstract CameraSettingFragment cameraSettingFragment();
}

@Module
abstract class PhoneLoginActivityModule {
    @ContributesAndroidInjector
    abstract PhoneLoginFragment cameraPhoneLoginFragment();
}

@Module
abstract class NotificationDetailModule {
    @ContributesAndroidInjector
    abstract NotificationFragment notificationDetailFragment();
}

@Module
abstract class UserHistoryModule {
    @ContributesAndroidInjector
    abstract HistoryFragment contributeHistoryFragment();
}

@Module
abstract class AppInfoModule {
    @ContributesAndroidInjector
    abstract AppInfoFragment contributeAppInfoFragment();
}

@Module
abstract class CategoryListActivityAppInfoModule {
    @ContributesAndroidInjector
    abstract CategoryListFragment contributeCategoryFragment();

}

@Module
abstract class RatingListActivityModule {
    @ContributesAndroidInjector
    abstract RatingListFragment contributeRatingListFragment();
}

@Module
abstract class readMoreActivityModule {
    @ContributesAndroidInjector
    abstract ReadMoreFragment contributeReadMoreFragment();
}

@Module
abstract class EditSettingModule {
    @ContributesAndroidInjector
    abstract SettingFragment EditSettingFragment();
}

@Module
abstract class LanguageChangeModule {
    @ContributesAndroidInjector
    abstract NotificationSettingFragment notificationSettingFragment();
}

@Module
abstract class EditProfileModule {
    @ContributesAndroidInjector
    abstract ProfileFragment ProfileFragment();
}

@Module
abstract class SubCategoryActivityModule {
    @ContributesAndroidInjector
    abstract SubCategoryFragment contributeSubCategoryFragment();

}

@Module
abstract class FilteringModule {

    @ContributesAndroidInjector
    abstract CategoryFilterFragment contributeTypeFilterFragment();

    @ContributesAndroidInjector
    abstract FilteringFragment contributeSpecialFilteringFragment();

}

@Module
abstract class SearchActivityModule {
    @ContributesAndroidInjector
    abstract SearchListFragment contributefeaturedProductFragment();

    @ContributesAndroidInjector
    abstract CategoryListFragment contributeCategoryFragment();

    @ContributesAndroidInjector
    abstract CategoryFilterFragment contributeTypeFilterFragment();

}


@Module
abstract class CameraActivityModule {
    @ContributesAndroidInjector
    abstract CameraFragment contributeCameraFragment();
}

@Module
abstract class ItemEntryActivityModule {
    @ContributesAndroidInjector
    abstract ItemEntryFragment contributeItemEntryFragment();
}

@Module
abstract class ItemPromoteEntryActivityModule {
    @ContributesAndroidInjector
    abstract ItemPromoteFragment contributeItemPromoteFragment();
}
@Module
abstract class GalleryDetailActivityModule {
    @ContributesAndroidInjector
    abstract GalleryDetailFragment contributeGalleryDetailFragment();
}

@Module
abstract class GalleryActivityModule {
    @ContributesAndroidInjector
    abstract GalleryFragment contributeGalleryFragment();
}

@Module
abstract class SearchByCategoryActivityModule {

    @ContributesAndroidInjector
    abstract DashBoardSearchCategoryFragment contributeDashBoardSearchCategoryFragment();

    @ContributesAndroidInjector
    abstract DashBoardSearchSubCategoryFragment contributeDashBoardSearchSubCategoryFragment();
}

@Module
abstract class SelectedCityModule {

    @ContributesAndroidInjector
    abstract SearchListFragment contributefeaturedProductFragment();

    @ContributesAndroidInjector
    abstract CategoryListFragment categoryListFragment();

    @ContributesAndroidInjector
    abstract SelectedCityFragment contributeSelectedCityFragment();

    @ContributesAndroidInjector
    abstract CategoryFilterFragment contributeTypeFilterFragment();

    @ContributesAndroidInjector
    abstract CityMenuFragment contributeCityMenuFragment();

    @ContributesAndroidInjector
    abstract DashBoardSearchFragment contributeDashBoardSearchFragment();
}

@Module
abstract class SelectedShopListBlogModule {

    @ContributesAndroidInjector
    abstract BlogListFragment contributeSelectedShopListBlogFragment();

}

@Module
abstract class BlogDetailModule {

    @ContributesAndroidInjector
    abstract BlogDetailFragment contributeBlogDetailFragment();
}

@Module
abstract class MapActivityModule {

    @ContributesAndroidInjector
    abstract MapFragment contributeMapFragment();

    @ContributesAndroidInjector
    abstract PickMapFragment contributePickMapFragment();

}

@Module
abstract class forceUpdateModule {

    @ContributesAndroidInjector
    abstract ForceUpdateFragment contributeForceUpdateFragment();
}

@Module
abstract class MapFilteringModule {

    @ContributesAndroidInjector
    abstract MapFilteringFragment contributeMapFilteringFragment();
}

@Module
abstract class SearchViewActivityModule {

    @ContributesAndroidInjector
    abstract ItemCurrencyTypeFragment contributeItemConditionTypeFragment();

    @ContributesAndroidInjector
    abstract ItemConditionFragment contributeItemConditionFragment();

    @ContributesAndroidInjector
    abstract ItemLocationFragment contributeItemLocationFragment();

    @ContributesAndroidInjector
    abstract ItemDealOptionTypeFragment contributeItemDealOptionTypeFragment();

    @ContributesAndroidInjector
    abstract ItemPriceTypeFragment contributeItemPriceTypeFragment();

    @ContributesAndroidInjector
    abstract ItemTypeFragment contributeItemTypeFragment();


}

@Module
abstract class LoginUserItemListActivityModule {

    @ContributesAndroidInjector
    abstract  LoginUserItemFragment contributeLoginUserItemFragment();

    @ContributesAndroidInjector
    abstract  LoginUserPaidItemFragment contributeLoginUserPaidItemFragment();

}

@Module
abstract class chatActivityModule {

    @ContributesAndroidInjector
    abstract ChatFragment contributeChatFragment();
}

@Module
abstract class ImageFullScreenModule {

    @ContributesAndroidInjector
    abstract ChatImageFullScreenFragment contributeImageFullScreenFragment();

}

//@Module
//abstract class LoginUserItemModule {
//    @ContributesAndroidInjector
//    abstract LoginUserItemFragment contributeLoginUserItemFragment();
//}
//
//@Module
//abstract class LoginUserPaidItemModule {
//    @ContributesAndroidInjector
//    abstract LoginUserPaidItemFragment contributeLoginUserPaidItemFragment();
//}

@Module
abstract class FollowerUserModule {
    @ContributesAndroidInjector
    abstract UserListFragment contributeFollowerUserFragment();
}

@Module
abstract class VerifyEmailModule {
    @ContributesAndroidInjector
    abstract VerifyEmailFragment contributeVerifyEmailFragment();

}

@Module
abstract class VerifyMobileModule {
    @ContributesAndroidInjector
    abstract VerifyMobileFragment contributeVerifyMobileFragment();
}

@Module
abstract class FollowerUserDetailModule {
    @ContributesAndroidInjector
    abstract UserDetailFragment contributeFollowerUserDetailFragment();
}

@Module
abstract class AppLoadingActivityModule {

    @ContributesAndroidInjector
    abstract AppLoadingFragment contributeAppLoadingFragment();
}

@Module
abstract class ItemFromFollowerListModule {

    @ContributesAndroidInjector
    abstract ItemFromFollowerListFragment contributeItemFromFollowerListFragment();
}

@Module
abstract class LocationActivityModule {

    @ContributesAndroidInjector
    abstract ItemLocationFragment contributeItemLocationFragment();

}

@Module
abstract class PrivacyAndPolicyActivityModule {

    @ContributesAndroidInjector
    abstract PrivacyPolicyFragment contributePrivacyPolicyFragment();

}

@Module
abstract class StripeModule {

    @ContributesAndroidInjector
    abstract StripeFragment contributeStripeFragment();

}
