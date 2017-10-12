package com.itplace.maria.recipeslist;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by maria on 04.10.2017.
 * PagerAdapter
 */

class RecipesFragmentPagerAdapter extends FragmentPagerAdapter {

    private static final int PAGE_COUNT = 2;
    private static final int PAGE_BREAKFASTS = 0;
    private static final int PAGE_DINNERS = 1;

    private Context context;

    //public RecipesFragmentPagerAdapterCallBack callBack;

    RecipesFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        RecipeType type = null;
        switch (position) {
            case PAGE_BREAKFASTS:
                type = RecipeType.BREAKFAST;
                break;

            case PAGE_DINNERS:
                type = RecipeType.DINNER;
                break;
        }
        return RecipesListFragment.newInstance(type);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String pageTitle = "";
        switch (position) {
            case PAGE_BREAKFASTS:
                pageTitle = context.getString(R.string.Breakfasts);
                break;

            case PAGE_DINNERS:
                pageTitle = context.getString(R.string.Dinners);
                break;
        }
        return pageTitle;
    }

    /*void registerCallBack(RecipesFragmentPagerAdapterCallBack call_back){
        this.callBack = call_back;
    }

    void pfff(){
        // вызываем метод обратного вызова
        callBack.onItemClick(int position);
    }

    interface RecipesFragmentPagerAdapterCallBack {
        void onItemClick(int position);
    }*/
}
