package com.java.mostwanted.usecases;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //When you need a list order and with no duplicated data TreeSet is indicated

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("D");
        treeSet.add("F");
        treeSet.add("E");
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("A");


        System.out.println(treeSet);

    }
}
