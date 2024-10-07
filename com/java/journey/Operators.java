// Code to demonstrate use of operators in Java

package com.java.journey;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operators");
        int a = 10;
        int b = 5;
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        System.out.println("\nUnary Operators");
        int c = +a; // Unary plus
        int d = -b; // Unary minus
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("++a = " + (++a)); // Pre-increment
        System.out.println("b++ = " + (b++)); // Post-increment
        System.out.println("--a = " + (--a)); // Pre-decrement
        System.out.println("b-- = " + (b--)); // Post-decrement

        System.out.println("\nRelational Operators");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        System.out.println("\nLogical Operators");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        System.out.println("\nBitwise Operators");
        int e = 5; // 0101 in binary
        int f = 3; // 0011 in binary
        System.out.println("e & f: " + (e & f)); // Bitwise AND
        System.out.println("e | f: " + (e | f)); // Bitwise OR
        System.out.println("e ^ f: " + (e ^ f)); // Bitwise XOR
        System.out.println("~e: " + (~e)); // Bitwise NOT
        
        System.out.println("\nShift Operators");
        System.out.println("e << 1: " + (e << 1)); // Left shift
        System.out.println("e >> 1: " + (e >> 1)); // Right shift
        System.out.println("e >>> 1: " + (e >>> 1)); // Unsigned right shift

        System.out.println("\nAssignment Operators");
        int g = 10;
        g += 5; // g = g + 5
        System.out.println("g += 5: " + g);
        g -= 3; // g = g - 3
        System.out.println("g -= 3: " + g);
        g *= 2; // g = g * 2
        System.out.println("g *= 2: " + g);
        g /= 4; // g = g / 4
        System.out.println("g /= 4: " + g);
        g %= 3; // g = g % 3
        System.out.println("g %= 3: " + g);

        System.out.println("\nTernary Operator");
        int h = (a > b) ? a : b;
        System.out.println("h = (a > b) ? a : b: " + h);

        System.out.println("\nInstanceof Operator");
        String str = "Hello, World!";
        boolean result = str instanceof String;
        System.out.println("str instanceof String: " + result);
    }
}

/*
Output and Explanation:
Arithmetic Operators
a + b = 15  // Adds a and b
a - b = 5   // Subtracts b from a
a * b = 50  // Multiplies a and b
a / b = 2   // Divides a by b
a % b = 0   // Remainder of a divided by b

Unary Operators
c = 10      // Unary plus, c is assigned the value of a
d = -5      // Unary minus, d is assigned the negative value of b
++a = 11    // Pre-increment, a is incremented before the value is used
b++ = 5     // Post-increment, b is incremented after the value is used
--a = 10    // Pre-decrement, a is decremented before the value is used
b-- = 6     // Post-decrement, b is decremented after the value is used

Relational Operators
a == b: false  // Checks if a is equal to b
a != b: true   // Checks if a is not equal to b
a > b: true    // Checks if a is greater than b
a < b: false   // Checks if a is less than b
a >= b: true   // Checks if a is greater than or equal to b
a <= b: false  // Checks if a is less than or equal to b

Logical Operators
x && y: false  // Logical AND, true if both x and y are true
x || y: true   // Logical OR, true if either x or y is true
!x: false      // Logical NOT, true if x is false

Bitwise Operators
e & f: 1       // Bitwise AND, performs AND on each bit of e and f
e | f: 7       // Bitwise OR, performs OR on each bit of e and f
e ^ f: 6       // Bitwise XOR, performs XOR on each bit of e and f
~e: -6         // Bitwise NOT, inverts each bit of e

Shift Operators
e << 1: 10     // Left shift, shifts bits of e left by 1 position
e >> 1: 2      // Right shift, shifts bits of e right by 1 position
e >>> 1: 2     // Unsigned right shift, shifts bits of e right by 1 position with zero fill

Assignment Operators
g += 5: 15     // Adds 5 to g
g -= 3: 12     // Subtracts 3 from g
g *= 2: 24     // Multiplies g by 2
g /= 4: 6      // Divides g by 4
g %= 3: 0      // Assigns remainder of g divided by 3 to g

Ternary Operator
h = (a > b) ? a : b: 10  // Assigns a to h if a is greater than b, otherwise assigns b

Instanceof Operator
str instanceof String: true  // Checks if str is an instance of String
*/