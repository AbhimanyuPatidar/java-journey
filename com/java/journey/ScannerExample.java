// Code to demonstrate the use of Scanner in Java

package com.java.journey;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
        
        scanner.close();
    }
}

/*
Output:
Enter your name: 
[User enters: John]
Enter your age: 
[User enters: 25]
Hello, John. You are 25 years old.

Explanation:
1. The program starts by importing the Scanner class from the java.util package.
2. It then creates a new Scanner object to read input from the standard input stream (System.in).
3. The program prompts the user to enter their name and reads the input using `scanner.nextLine()`.
4. It then prompts the user to enter their age and reads the input using `scanner.nextInt()`.
5. Finally, it prints a greeting message that includes the user's name and age.
6. The scanner is closed to free up resources.
*/