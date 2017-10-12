package com.itplace.maria.recipeslist.view;

import com.itplace.maria.recipeslist.recipedatastruct.Recipe;

import java.util.List;

/**
 * Created by maria on 12.10.2017.
 * Методы работы с рецептами
 */

public interface RecipesView {
    void onRecipesReceived(List<Recipe> recipes);
}
