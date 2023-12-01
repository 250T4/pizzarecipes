package com.example.pizzarecipes;

public class PizzaRecipeItem {

    private int imageResourse;
    private String title;
    private String description;

    public PizzaRecipeItem(int imageResourse, String title, String description) {
        this.imageResourse = imageResourse;
        this.title = title;
        this.description = description;
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
}
