package com.itplace.maria.recipeslist.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.itplace.maria.recipeslist.R;
import com.itplace.maria.recipeslist.recipedatastruct.RecipeType;
import com.itplace.maria.recipeslist.ui.RecipesListFragment;


/**
 * Created by maria on 04.10.2017.
 * PagerAdapter
 */

public class RecipesFragmentPagerAdapter extends FragmentPagerAdapter {

    private static final int PAGE_COUNT = 2;
    private static final int PAGE_BREAKFASTS = 0;
    private static final int PAGE_DINNERS = 1;

    private Context context;

    public RecipesFragmentPagerAdapter(FragmentManager fm, Context context) {
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
}
