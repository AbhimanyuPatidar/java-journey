// Code to demonstrate the use of Console in Java

package com.java.journey;

import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.out.println("No console available");
            return;
        }
        
        String name = console.readLine("Enter your name: ");
        String ageStr = console.readLine("Enter your age: ");
        int age = Integer.parseInt(ageStr);
        
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
    }
}

/*
Output:
Enter your name: 
John
Enter your age: 
25
Hello, John. You are 25 years old.

Explanation:
1. The program prompts the user to enter their name and reads it using `console.readLine()`.
2. It then prompts the user to enter their age and reads it using `console.readLine()`.
3. The age is parsed from a String to an integer using `Integer.parseInt()`.
4. Finally, it prints a greeting message including the user's name and age.
*/