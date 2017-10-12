package com.itplace.maria.recipeslist.presenter;

import com.itplace.maria.recipeslist.recipedatastruct.Recipe;
import com.itplace.maria.recipeslist.repository.RecipesRepository;
import com.itplace.maria.recipeslist.view.RecipesView;

import java.util.List;

/**
 * Created by maria on 12.10.2017.
 * Осуществляет взаимодействие интерфейса и репозитория
 */

public class RecipesPresenter {
    private RecipesView view;
    private final RecipesRepository recipesRepository = new RecipesRepository();

    public void attachView(RecipesView view) {
        this.view = view;
    }

    public void loadRecipes() {
        List<Recipe> recipes = recipesRepository.getRecipes();
        if (view != null) {
            view.onRecipesReceived(recipes);
        }
    }

    public void detachView() {
        view = null;
    }
}
