package com.itplace.maria.recipeslist.repository;


import com.itplace.maria.recipeslist.R;
import com.itplace.maria.recipeslist.recipedatastruct.Recipe;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;

import static com.itplace.maria.recipeslist.recipedatastruct.RecipeType.*;

/**
 * Created by maria on 12.10.2017.
 * Хранит список рецептов
 */

public class RecipesRepository {
    public Observable<List<Recipe>> getRecipes() {
        return Observable.defer(() -> {
                    List<Recipe> recipes = new ArrayList<>();

                    // TODO Набросать рецептов.

                    recipes.add(new Recipe("1", BREAKFAST, "Кофе", "кофе, печенька", R.drawable.pic));
                    recipes.add(new Recipe("2", BREAKFAST, "Омлет", "яйца, молоко, соль", R.drawable.omlet));
                    recipes.add(new Recipe("3", BREAKFAST, "Салат с крабовыми палочками",
                            "крабовые палочки, капуста белокочанная, огурцы, кукуруза, сыр, майонез, соль",
                            R.drawable.salat_krab));
                    recipes.add(new Recipe("4", DINNER, "Вкусный ужин", "продукты", R.drawable.pic));

                    return Observable.just(recipes);
                }
        );
    }
}
