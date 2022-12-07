package com.bridgelabz.generics;

public class FloatMaxValue {
    /**
     *compareTo method is used to compare three Float values
     * and get maximum value
     */
    public static Float maxOfFloat(Float number1, Float number2, Float number3) {
        Float max = number1;
        if (number2.compareTo(max) > 0)
            max = number2;
        if (number3.compareTo(max) > 0)
            max = number3;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the find maximum value of three Floats without using Generics\n");
        System.out.println("The maximum value between the three Floats is : " + maxOfFloat (2.2f, 25.3f, 0.5f));
    }
}

