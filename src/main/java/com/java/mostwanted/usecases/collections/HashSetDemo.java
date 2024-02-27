package com.java.mostwanted.usecases.collections;

import com.java.mostwanted.usecases.collections.utils.Wishlist;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //HashSet: Consider a scenario where you're developing an online shopping platform and you want to store unique
        // product categories for a particular user's wishlist. You can use a HashSet to ensure that each category
        // is unique.

        Wishlist userWishlist = new Wishlist();
        userWishlist.addCategory("Electronics");
        userWishlist.addCategory("Books");
        userWishlist.addCategory("Clothing");

        // Adding a duplicate category (will be ignored)
        userWishlist.addCategory("Books");

        // Retrieving unique categories from user's wishlist
        HashSet<String> uniqueCategories = userWishlist.getCategories();
        for (String category : uniqueCategories) {
            System.out.println(category);
        }
    }
}
