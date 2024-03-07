package com.java.collections.utils;

import java.util.HashSet;

public class Wishlist {
    private HashSet<String> categories;

    public Wishlist() {
        this.categories = new HashSet<>();
    }

    public void addCategory(String category) {
        categories.add(category);
    }

    public HashSet<String> getCategories() {
        return categories;
    }
}