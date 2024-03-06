package com.java.mostwanted.usecases.collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //TreeSet: Suppose you're developing an employee management system where you need to store a sorted list of
        // employee IDs. You can use a TreeSet to automatically maintain the employee IDs in sorted order.
        TreeSet<Integer> employeeIds = new TreeSet<>();
        employeeIds.add(1023);
        employeeIds.add(1005);
        employeeIds.add(1010);
        employeeIds.add(1001);

        // Automatically sorted employee IDs
        System.out.println("Employee IDs:");
        for (int id : employeeIds) {
            System.out.println(id);
        }
    }
}
