package com.itplace.maria.recipeslist.presenter;


import com.itplace.maria.recipeslist.adapters.RecipesAdapter;
import com.itplace.maria.recipeslist.recipedatastruct.Recipe;
import com.itplace.maria.recipeslist.recipedatastruct.RecipeType;
import com.itplace.maria.recipeslist.repository.RecipesRepository;
import com.itplace.maria.recipeslist.view.RecipesView;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

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
        recipesRepository.getRecipes()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(recipes -> {
                            if (view != null) {
                                view.onRecipesReceived(recipes);
                            }
                        }, throwable -> {
                            if (view != null) {
                                view.showError(throwable);
                            }
                        }
                );

    }

    public void detachView() {
        view = null;
    }

    public void loadCard(String recipe_id) {
    }
}
