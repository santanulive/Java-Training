package com.java.santanu;

public class Calculator {

    public static String name;

    //Static method
    //Doesn't require an object to be initialized
    //Can't call the instance method diff
    public static void add(int a, int b){
        System.out.println("Add result="+(a+b));
    }

    //Instance method
    //Requires an object to be initialized
    public void diff(int a , int b){
        System.out.println("Diff result="+ (a-b));
    }
}
