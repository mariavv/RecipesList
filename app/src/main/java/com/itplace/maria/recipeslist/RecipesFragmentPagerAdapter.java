package com.itplace.maria.recipeslist;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by maria on 04.10.2017
 */

public class RecipesFragmentPagerAdapter extends FragmentPagerAdapter {

    private static final int PAGE_COUNT = 2;

    private Context context;

    public RecipesFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        RecipeType type = null;
        switch (position) {
            case 0:
                type = RecipeType.Breakfast;
                break;

            case 1:
                type = RecipeType.Dinner;
                break;
        }
        return BreakfastsFragment.newInstance(type);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String s = "";
        switch (position) {
            case 0:
                s = context.getString(R.string.Breakfasts);
                break;

            case 1:
                s = context.getString(R.string.Dinners);
                break;
        }
        return s;
    }
}
