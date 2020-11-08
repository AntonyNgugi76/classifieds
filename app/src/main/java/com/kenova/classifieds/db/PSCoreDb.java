package com.kenova.classifieds.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.kenova.classifieds.db.common.Converters;
import com.kenova.classifieds.viewobject.AboutUs;
import com.kenova.classifieds.viewobject.Blog;
import com.kenova.classifieds.viewobject.ChatHistory;
import com.kenova.classifieds.viewobject.ChatHistoryMap;
import com.kenova.classifieds.viewobject.City;
import com.kenova.classifieds.viewobject.CityMap;
import com.kenova.classifieds.viewobject.DeletedObject;
import com.kenova.classifieds.viewobject.Image;
import com.kenova.classifieds.viewobject.Item;
import com.kenova.classifieds.viewobject.ItemCategory;
import com.kenova.classifieds.viewobject.ItemCollection;
import com.kenova.classifieds.viewobject.ItemCollectionHeader;
import com.kenova.classifieds.viewobject.ItemCondition;
import com.kenova.classifieds.viewobject.ItemCurrency;
import com.kenova.classifieds.viewobject.ItemDealOption;
import com.kenova.classifieds.viewobject.ItemFavourite;
import com.kenova.classifieds.viewobject.ItemFromFollower;
import com.kenova.classifieds.viewobject.ItemHistory;
import com.kenova.classifieds.viewobject.ItemLocation;
import com.kenova.classifieds.viewobject.ItemMap;
import com.kenova.classifieds.viewobject.ItemPaidHistory;
import com.kenova.classifieds.viewobject.ItemPriceType;
import com.kenova.classifieds.viewobject.ItemSpecs;
import com.kenova.classifieds.viewobject.ItemSubCategory;
import com.kenova.classifieds.viewobject.ItemType;
import com.kenova.classifieds.viewobject.Noti;
import com.kenova.classifieds.viewobject.PSAppInfo;
import com.kenova.classifieds.viewobject.PSAppSetting;
import com.kenova.classifieds.viewobject.PSAppVersion;
import com.kenova.classifieds.viewobject.PSCount;
import com.kenova.classifieds.viewobject.Rating;
import com.kenova.classifieds.viewobject.User;
import com.kenova.classifieds.viewobject.UserLogin;
import com.kenova.classifieds.viewobject.UserMap;
import com.kenova.classifieds.viewobject.messageHolder.Message;


/**
 * Created by Panacea-Soft on 11/20/17.
 * Contact Email : teamps.is.cool@gmail.com
 */

@Database(entities = {
        Image.class,
        User.class,
        UserLogin.class,
        AboutUs.class,
        ItemFavourite.class,
        Noti.class,
        ItemHistory.class,
        Blog.class,
        Rating.class,
        PSAppInfo.class,
        PSAppVersion.class,
        DeletedObject.class,
        City.class,
        CityMap.class,
        Item.class,
        ItemMap.class,
        ItemCategory.class,
        ItemCollectionHeader.class,
        ItemCollection.class,
        ItemSubCategory.class,
        ItemSpecs.class,
        ItemCurrency.class,
        ItemPriceType.class,
        ItemType.class,
        ItemLocation.class,
        ItemDealOption.class,
        ItemCondition.class,
        ItemFromFollower.class,
        Message.class,
        ChatHistory.class,
        ChatHistoryMap.class,
        PSAppSetting.class,
        UserMap.class,
        PSCount.class,
        ItemPaidHistory.class
}, version = 10, exportSchema = false)
// app version 2.8 = db version 10
// app version 2.7 = db version 9
// app version 2.6 = db version 8
// app version 2.5 = db version 7
// app version 2.4 = db version 7
// app version 2.3 = db version 6
// app version 2.2 = db version 6
// app version 2.1 = db version 6
// app version 2.0 = db version 6
// app version 1.9 = db version 6
// app version 1.8 = db version 5
// app version 1.7 = db version 4
// app version 1.6 = db version 4
// app version 1.5 = db version 4
// app version 1.4 = db version 3
// app version 1.3 = db version 3
// app version 1.2 = db version 2
// app version 1.0 = db version 1


@TypeConverters({Converters.class})

public abstract class PSCoreDb extends RoomDatabase {

    abstract public UserDao userDao();

    abstract public UserMapDao userMapDao();

    abstract public HistoryDao historyDao();

    abstract public SpecsDao specsDao();

    abstract public AboutUsDao aboutUsDao();

    abstract public ImageDao imageDao();

    abstract public ItemDealOptionDao itemDealOptionDao();

    abstract public ItemConditionDao itemConditionDao();

    abstract public ItemLocationDao itemLocationDao();

    abstract public ItemCurrencyDao itemCurrencyDao();

    abstract public ItemPriceTypeDao itemPriceTypeDao();

    abstract public ItemTypeDao itemTypeDao();

    abstract public RatingDao ratingDao();

    abstract public NotificationDao notificationDao();

    abstract public BlogDao blogDao();

    abstract public PSAppInfoDao psAppInfoDao();

    abstract public PSAppVersionDao psAppVersionDao();

    abstract public DeletedObjectDao deletedObjectDao();

    abstract public CityDao cityDao();

    abstract public CityMapDao cityMapDao();

    abstract public ItemDao itemDao();

    abstract public ItemMapDao itemMapDao();

    abstract public ItemCategoryDao itemCategoryDao();

    abstract public ItemCollectionHeaderDao itemCollectionHeaderDao();

    abstract public ItemSubCategoryDao itemSubCategoryDao();

    abstract public ChatHistoryDao chatHistoryDao();

    abstract public MessageDao messageDao();

    abstract public PSCountDao psCountDao();

    abstract public ItemPaidHistoryDao itemPaidHistoryDao();


//    /**
//     * Migrate from:
//     * version 1 - using Room
//     * to
//     * version 2 - using Room where the {@link } has an extra field: addedDateStr
//     */
//    public static final Migration MIGRATION_1_2 = new Migration(1, 2) {
//        @Override
//        public void migrate(@NonNull SupportSQLiteDatabase database) {
//            database.execSQL("ALTER TABLE news "
//                    + " ADD COLUMN addedDateStr INTEGER NOT NULL DEFAULT 0");
//        }
//    };

    /* More migration write here */
}