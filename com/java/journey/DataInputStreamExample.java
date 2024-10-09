// Code to demonstrate the use of DataInputStream in Java

package com.java.journey;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamExample {
    public static void main(String[] args) {
        DataInputStream reader = new DataInputStream(System.in);
        
        try {
            // Reading integers
            System.out.print("Enter an integer: ");
            int inputInt = Integer.parseInt(reader.readLine());
            
            // Reading strings
            System.out.print("Enter a string: ");
            String inputString = reader.readLine();
            System.out.println("You entered integer: " + inputInt);
            System.out.println("You entered string: " + inputString);
        } catch (IOException ioe) {
            ioe.printStackTrace();   
        }
    }
}

/*
Output:
Enter an integer: 12345
Enter a string: Hello
You entered integer: 12345
You entered string: Hello

Explanation:
This example demonstrates how to use DataInputStream to read data from the console.
- `DataInputStream` is used to read primitive data types from the console input stream.
- The `readLine()` method is used to read a line of text from the console.
- The `Integer.parseInt()` method is used to convert the input string to an integer.
- The values read from the console are then printed to the console.
- The try-catch block is used to handle any `IOException` that may occur during the input operations.
*/