package com.example.pizzarecipes;

public class PizzaRecipeItem {

    private int imageResourse;
    private String title;
    private String description;
    private String recipe;

    public PizzaRecipeItem(int imageResourse, String title, String description,
                           String recipe) {
        this.imageResourse = imageResourse;
        this.title = title;
        this.description = description;
        this.recipe = recipe;

    }

    public int getImageResourse() {
        return imageResourse;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getRecipe(){
        return recipe;
    }
}
