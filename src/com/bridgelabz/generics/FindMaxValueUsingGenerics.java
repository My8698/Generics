package com.bridgelabz.generics;

public class FindMaxValueUsingGenerics {
    /**
     *T is generic type extending to comparable
     */
    public static <T extends Comparable <T>> T maxOfValues(T number1, T number2, T number3) {
        T max = number1;
        if (number2.compareTo(max) > 0)
            max = number2;
        if (number3.compareTo(max) > 0)
            max = number3;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("The maximum value between the three Integer is : " + maxOfValues (2, 25, 50)+ "\n");
        System.out.println("The maximum value between the three Float is : " + maxOfValues (2.7f, 25.5f, 50.9f)+ "\n");
        System.out.println("The maximum value between the three String is : " + maxOfValues ("apple", "peach", "banana"));
    }

}