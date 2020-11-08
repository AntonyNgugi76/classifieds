package com.kenova.agribiz.ui.item.itemtype;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import androidx.databinding.DataBindingUtil;

import com.kenova.agribiz.Config;
import com.kenova.agribiz.R;
import com.kenova.agribiz.databinding.ActivitySearchViewBinding;
import com.kenova.agribiz.ui.common.PSAppCompactActivity;
import com.kenova.agribiz.ui.item.itemcondition.ItemConditionFragment;
import com.kenova.agribiz.ui.item.itemcurrency.ItemCurrencyTypeFragment;
import com.kenova.agribiz.ui.item.itemdealoption.ItemDealOptionTypeFragment;
import com.kenova.agribiz.ui.item.itemlocation.ItemLocationFragment;
import com.kenova.agribiz.ui.item.itempricetype.ItemPriceTypeFragment;
import com.kenova.agribiz.utils.Constants;
import com.kenova.agribiz.utils.MyContextWrapper;

public class SearchViewActivity extends PSAppCompactActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivitySearchViewBinding databinding = DataBindingUtil.setContentView(this, R.layout.activity_search_view);

        initUI(databinding);

    }

    @Override
    protected void attachBaseContext(Context newBase) {

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(newBase);
        String CURRENT_LANG_CODE = preferences.getString(Constants.LANGUAGE_CODE, Config.DEFAULT_LANGUAGE);
        String CURRENT_LANG_COUNTRY_CODE = preferences.getString(Constants.LANGUAGE_COUNTRY_CODE, Config.DEFAULT_LANGUAGE_COUNTRY_CODE);

        super.attachBaseContext(MyContextWrapper.wrap(newBase, CURRENT_LANG_CODE, CURRENT_LANG_COUNTRY_CODE, true));
    }

    protected void initUI(ActivitySearchViewBinding binding) {
        Intent intent = getIntent();

        String fragName = intent.getStringExtra(Constants.ITEM_TYPE_FLAG);

        switch (fragName) {
            case Constants.ITEM_TYPE:
                setupFragment(new ItemTypeFragment());
                initToolbar(binding.toolbar, getResources().getString(R.string.Feature_UI__search_alert_type_title));
                break;
            case Constants.ITEM_PRICE_TYPE:
                setupFragment(new ItemPriceTypeFragment());
                initToolbar(binding.toolbar, getResources().getString(R.string.Feature_UI__search_alert_price_type_title));
                break;
            case Constants.ITEM_CURRENCY_TYPE:
                setupFragment(new ItemCurrencyTypeFragment());
                initToolbar(binding.toolbar, getResources().getString(R.string.Feature_UI__search_alert_currency_title));
                break;
            case Constants.ITEM_DEAL_OPTION_TYPE:
                setupFragment(new ItemDealOptionTypeFragment());
                initToolbar(binding.toolbar, getResources().getString(R.string.Feature_UI__search_alert_deal_option_title));
                break;
            case Constants.ITEM_LOCATION_TYPE:
                setupFragment(new ItemLocationFragment());
                initToolbar(binding.toolbar, getResources().getString(R.string.Feature_UI__search_alert_location_title));
                break;
            case Constants.ITEM_CONDITION_TYPE:
                setupFragment(new ItemConditionFragment());
                initToolbar(binding.toolbar, getResources().getString(R.string.Feature_UI__search_alert_condition_title));
                break;
        }

    }
}