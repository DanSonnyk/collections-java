package com.java.mostwanted.usecases;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //When you need a list of unordered data or unique data ArrayList its indicated
        List<Integer> arrayList = new ArrayList<>();

        for(int i = 0 ; i <= 5; i++){
            arrayList.add(i);
        }

        System.out.println(arrayList);
        arrayList.remove(3);

    }

}
