// Code to demonstrate types of variables in Java

package com.java.journey;

public class VariableTypes {
    // Instance variable
    int instanceVariable = 10;

    // Static variable
    static int staticVariable = 20;

    public static void main(String[] args) {
        // Creating an instance of VariableTypes
        VariableTypes obj = new VariableTypes();

        // Accessing instance variable
        System.out.println("Instance Variable: " + obj.instanceVariable);

        // Accessing static variable
        System.out.println("Static Variable: " + staticVariable);

        // Calling method to demonstrate local variable
        obj.displayLocalVariable();
    }

    public void displayLocalVariable() {
        // Local variable
        int localVariable = 30;

        // Accessing local variable
        System.out.println("Local Variable: " + localVariable);

        // Accessing instance variable within the same class
        System.out.println("Instance Variable within displayLocalVariable: " + instanceVariable);

        // Accessing static variable within the same class
        System.out.println("Static Variable within displayLocalVariable: " + staticVariable);
    }
}
