package com.java.santanu;

public class Main {

    public static void main(String[] args) {

        //Static method
        Calculator.add(5,7);

        //Instance method
        Calculator c= new Calculator();
        c.diff(5,7);
    }
}
