package com.project.starwars.toptrumpsMVC.model;

public class Category {

    // The category type
    private CategoryType categoryType;

    // The category value
    private int value;

    public Category(CategoryType categoryType, int value) {
        this.categoryType = categoryType;
        this.value = value;
    }
}
