// Code to demonstrate various data types in Java

package com.java.journey;

public class DataTypes {
    public static void main(String[] args) {
        // Primitive data types
        byte byteVar = 1;
        short shortVar = 2;
        int intVar = 3;
        long longVar = 4L;
        float floatVar = 5.0f;
        double doubleVar = 6.0d;
        char charVar = 'A';
        boolean booleanVar = true;

        // Print sizes of primitive data types
        System.out.println("Size of primitive data types:");
        System.out.println("Size of byte: " + Byte.BYTES + " bytes");
        System.out.println("Size of short: " + Short.BYTES + " bytes");
        System.out.println("Size of int: " + Integer.BYTES + " bytes");
        System.out.println("Size of long: " + Long.BYTES + " bytes");
        System.out.println("Size of float: " + Float.BYTES + " bytes");
        System.out.println("Size of double: " + Double.BYTES + " bytes");
        System.out.println("Size of char: " + Character.BYTES + " bytes");
        System.out.println("Size of boolean: " + "1 bit (JVM dependent)");

        // Print values of primitive data types
        System.out.println("\nValues of primitive data types:");
        System.out.println("Value of byteVar: " + byteVar);
        System.out.println("Value of shortVar: " + shortVar);
        System.out.println("Value of intVar: " + intVar);
        System.out.println("Value of longVar: " + longVar);
        System.out.println("Value of floatVar: " + floatVar);
        System.out.println("Value of doubleVar: " + doubleVar);
        System.out.println("Value of charVar: " + charVar);
        System.out.println("Value of booleanVar: " + booleanVar);
    }
}

/*
Output:
Size of primitive data types:
Size of byte: 1 bytes
Size of short: 2 bytes
Size of int: 4 bytes
Size of long: 8 bytes
Size of float: 4 bytes
Size of double: 8 bytes
Size of char: 2 bytes
Size of boolean: 1 bit (JVM dependent)

Values of primitive data types:
Value of byteVar: 1
Value of shortVar: 2
Value of intVar: 3
Value of longVar: 4
Value of floatVar: 5.0
Value of doubleVar: 6.0
Value of charVar: A
Value of booleanVar: true
*/

/*
Explanation:
- The code demonstrates the use of various primitive data types in Java.
- It initializes variables of each primitive type and prints their sizes in bytes.
- It also prints the values of these variables.
- Note that the size of boolean is JVM dependent and typically represented as 1 bit.
*/