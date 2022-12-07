package com.bridgelabz.generics;
public class FindMaxUsingClass<T extends Comparable <T>> {
    /**
     * initialize with more than three instance variables
     */
    T number1, number2, number3,number4;

    /**
     * parameterized constructor call
     */
    public FindMaxUsingClass(T number1, T number2, T number3,T number4) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
    }
    public T maximum(){
        return FindMaxUsingClass.maxOfValue(number1, number2, number3, number4);
    }
    /**
     * static method maxOfValues by passing three instance variables
     */
    public static <T extends Comparable <T>> T maxOfValue(T number1, T number2, T number3,T number4) {
        T max = number1;
        if (number2.compareTo(max) > 0)
            max = number2;
        if (number3.compareTo(max) > 0)
            max = number3;
        if (number4.compareTo(max) > 0)
            max = number4;
        return max;
    }

    /**
     *Generic method to printMax to print the maximum values
     */
    public static <T> void printMax(T number) {
        System.out.println("Maximum value is : "+ number);
    }
    public static void main(String[] args) {
       /** System.out.println("The maximum value between the three Integer is : " + maxOfValues (2, 25, 50,65)+ "\n");
        System.out.println("The maximum value between the three Float is : " + maxOfValues (2.7f, 25.5f, 50.9f,66.1f)+ "\n");
        System.out.println("The maximum value between the three String is : " + maxOfValues ("apple", "peach", "banana","guava"));
    */
        FindMaxUsingClass<Integer> maxInteger = new FindMaxUsingClass<Integer>(2, 25, 50, 60);
        System.out.println("The maximum value between the three Integer is : "+ maxInteger.maximum());
        FindMaxUsingClass<Float> maxFloat = new FindMaxUsingClass<Float>(2.7f, 25.5f, 50.9f, 44.9f);
        System.out.println("The maximum value between the three Float is : "+ maxFloat.maximum());
        FindMaxUsingClass<String> maxString = new FindMaxUsingClass<String>("abc", "pug", "zca", "zza");
        System.out.println("The maximum value between the three String is : "+ maxString.maximum());
        }
}