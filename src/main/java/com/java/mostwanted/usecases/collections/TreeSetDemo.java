package com.java.mostwanted.usecases.collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
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
