package com.java.collections;

public class PrimitiveTypes {
    public static void main(String[] args) {

        //-128 to 128
        byte myByte = 12;

        // -32,768 to 32,767 - Never use this really
        short myShort = 1234;

        //second most large number
        int myInt = 28371231;

        //moust large number in java
        long myLong = 283712312312L;

        //ABOUT 6 DECIMAL DIGITS
        float myFloat = 6.3f;

        // about 15 decimal digits
        double myDouble = 45.213434;

        //true or false
        boolean myBoolean = false;

        // one character
        char myChar = 'W';

        String name = "John";

        String secondName = "John";

        String thirdName = new String("John");

        System.out.println(thirdName == secondName);
    }
}
