package com.java.mostwanted.usecases;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //When you need a list of order data with duplicates LinkedList its indicated
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("D");
        System.out.println(linkedList);

    }
}
