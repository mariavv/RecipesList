package com.itplace.maria.recipeslist.recipedatastruct;

/**
 * Created by maria on 02.10.2017.
 * Структура данных - Рецепт
 */

public class Recipe {

    private String id;
    private RecipeType type;
    private String name;
    private String ingredients;
    private int picture;

    public Recipe(String id, RecipeType type, String name, String ingredients, int picture) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.ingredients = ingredients;
        this.picture = picture;
    }

    public String getId() { return  id; }

    public RecipeType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public int getPicture() {
        return picture;
    }
}
