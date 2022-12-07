package com.bridgelabz.generics;

public class StringMaxValue {
    public static String maxOfString(String string1, String string2, String string3) {
        /**
         *compareTo method is used to compare three Float values
         * and get maximum value
         */
        String max = string1;
        if (string2.compareTo(max) > 0)
            max = string2;
        if (string3.compareTo(max) > 0)
            max = string3;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the find maximum value of three strings without using Generics\n");
        System.out.println("The maximum value between the three strings is : " + maxOfString ("abc", "pqr", "xyz"));
    }
}
