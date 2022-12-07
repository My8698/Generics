package com.bridgelabz.generics;

public class IntegerMax {
    /**
     *compareTo method is used to compare three Integer values
     * and get maximum value
     */
    public static Integer maxOfInteger(Integer number1, Integer number2, Integer number3) {
            Integer max = number1;
            if (number2.compareTo(max) > 0)
                max = number2;
            if (number3.compareTo(max) > 0)
                max = number3;
            return max;
        }
        public static void main(String[] args) {
            System.out.println("Welcome to the find maximum value of three Integer using without Generics\n");
            System.out.println("The maximum value between the three Integer is : " + maxOfInteger (2, 25, 50));
        }
 }

