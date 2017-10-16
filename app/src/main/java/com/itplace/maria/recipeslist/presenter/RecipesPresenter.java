package com.itplace.maria.recipeslist.presenter;

import com.itplace.maria.recipeslist.recipedatastruct.Recipe;
import com.itplace.maria.recipeslist.repository.RecipesRepository;
import com.itplace.maria.recipeslist.view.RecipesView;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
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
                .subscribe(new Consumer<List<Recipe>>() {
                    @Override
                    public void accept(List<Recipe> recipes) throws Exception {
                        if (view != null) {
                            view.onRecipesReceived(recipes);
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        if (view != null) {
                            //view.showError();
                        }
                    }
                });
        //List<Recipe> recipes = recipesRepository.getRecipes();

        /*List<Recipe> recipes = recipesRepository.getRecipes();
        if (view != null) {
            view.onRecipesReceived(recipes);
        }*/
    }

    public void detachView() {
        view = null;
    }
}
