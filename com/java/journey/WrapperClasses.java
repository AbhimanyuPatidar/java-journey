// Code to demonstrate wrapper classes in Java

package com.java.journey;

public class WrapperClasses {
    public static void main(String[] args) {
        // Byte
        Byte byteObj = Byte.valueOf((byte) 10);
        byte byteValue = byteObj.byteValue();
        System.out.println("Byte value: " + byteValue);

        // Short
        Short shortObj = Short.valueOf((short) 20);
        short shortValue = shortObj.shortValue();
        System.out.println("Short value: " + shortValue);

        // Integer
        Integer intObj = Integer.valueOf(30);
        int intValue = intObj.intValue();
        System.out.println("Integer value: " + intValue);

        // Long
        Long longObj = Long.valueOf(40L);
        long longValue = longObj.longValue();
        System.out.println("Long value: " + longValue);

        // Float
        Float floatObj = Float.valueOf(50.0f);
        float floatValue = floatObj.floatValue();
        System.out.println("Float value: " + floatValue);

        // Double
        Double doubleObj = Double.valueOf(60.0);
        double doubleValue = doubleObj.doubleValue();
        System.out.println("Double value: " + doubleValue);

        // Character
        Character charObj = Character.valueOf('a');
        char charValue = charObj.charValue();
        System.out.println("Character value: " + charValue);

        // Boolean
        Boolean boolObj = Boolean.valueOf(true);
        boolean boolValue = boolObj.booleanValue();
        System.out.println("Boolean value: " + boolValue);
    }
}

/*
Output:
Byte value: 10
Short value: 20
Integer value: 30
Long value: 40
Float value: 50.0
Double value: 60.0
Character value: a
Boolean value: true
*/

/*
This code demonstrates the use of wrapper classes in Java. Wrapper classes provide a way to use primitive data types (int, boolean, etc.) as objects. Each primitive type has a corresponding wrapper class in the java.lang package.

- Byte: Wraps a value of the primitive type byte in an object.
- Short: Wraps a value of the primitive type short in an object.
- Integer: Wraps a value of the primitive type int in an object.
- Long: Wraps a value of the primitive type long in an object.
- Float: Wraps a value of the primitive type float in an object.
- Double: Wraps a value of the primitive type double in an object.
- Character: Wraps a value of the primitive type char in an object.
- Boolean: Wraps a value of the primitive type boolean in an object.

In this example, we create instances of each wrapper class using the valueOf() method, which returns a wrapped object containing the specified value. We then retrieve the primitive value from the wrapper object using the corresponding xxxValue() method (e.g., byteValue(), shortValue(), intValue(), etc.). Finally, we print the primitive values to the console.
*/