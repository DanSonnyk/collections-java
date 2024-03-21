package com.java.collections;

import java.util.Arrays;

public class Arrays1D {
    public static void main(String[] args) {
//        Fixed in size
//        Fast for data search
//        Compact memory usage if size is know
//        Delete Operation very hard
//        2D Arrays
//        complexity O(n)

        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        int[] numbers = new int[10];

        for (int n: numbers) {
            System.out.println(n);
        }

        for (String c : colors) {
            System.out.println(c);
        }
        Arrays.stream(colors).forEach(System.out::println);


    }
}
