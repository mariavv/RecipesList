package com.itplace.maria.recipeslist;

/**
 * Created by maria on 02.10.2017.
 * Структура данных - Рецепт
 */

class Recipe {

    private String id;
    private RecipeType type;
    private String name;
    private String ingredients;
    private int picture;

    Recipe(String id, RecipeType type, String name, String ingredients, int picture) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.ingredients = ingredients;
        this.picture = picture;
    }

    public String getId() { return  id; }

    public String getName() {
        return name;
    }

    String getIngredients() {
        return ingredients;
    }

    int getPicture() {
        return picture;
    }
}
