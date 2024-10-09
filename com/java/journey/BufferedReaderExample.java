// Code to demonstrate the use of BufferedReader in Java

package com.java.journey;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
Output:
Enter your name: [User enters "John"]
Hello, John!

Explanation:
1. The program starts by creating a `BufferedReader` object that reads from the standard input stream (System.in).
2. It prompts the user to enter their name by printing "Enter your name: ".
3. The program waits for the user to input their name and press Enter.
4. The input is read as a string using `reader.readLine()` and stored in the variable `name`.
5. The program then prints a greeting message "Hello, " followed by the user's name.
6. If an `IOException` occurs during the reading process, it is caught and the stack trace is printed.
*/