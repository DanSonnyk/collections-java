package com.java.mostwanted.usecases;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //When you need a list of unordered data with no duplicates HashSet its indicated
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("C");

        System.out.println(hashSet);

        hashSet.remove("C");
        System.out.println(hashSet);

    }
}
