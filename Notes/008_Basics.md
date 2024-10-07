# Terminologies
1. **Class**: Blueprint of instances of a class, they share common properties and methods.
2. **Object**: Instance of a class. It has a behavior and a state.
3. **Method**: Behavior of an object.
4. **Instance variable**: State of an object is created by the value assigned to instance variables.

# Syntax
1. Single Line Comments: Use '//'
2. Multi Line Comments: Use '/* */'
3. Javadoc comment: '/** */'
4. Source file name: If the class is public, name of the class and the file should be the same (including case).
5. Case sensitivity: Java is a case sensitive language.
6. Class names: First letter of the class is recommended to be in Uppercase. For multiword name, use PascalCase
7. Entry point: public static void main(String [] args) is the starting point of execution.
8. Method Names: Recommended to start with a lowercase. If multiword is used, use camelCase.
9. Blank line is ignored by compiler.
10. Access Modifiers: Control the scope of class and methods.
    - Private: Only within class.
    - Default: Only within package.
    - Protected: Within package and within subclasses outside package.
    - Public: No restriction.
11. Non-access Modifiers: final, abstract, static, transient, synchronized, volatile, native.
12. Java Keywords: Reserved words that cannot be used as identifiers.

# Data Types
1. Java is *statically* and *strongly* typed.
    - **Statically Typed Language**: A statically typed language is one in which the type of a variable is known at compile time. This means that type checking is performed during compilation rather than at runtime. Examples of statically typed languages include Java, C, and C++.
    - **Strongly Typed Language**: A strongly typed language is one in which types are enforced strictly, meaning that operations on incompatible types are not allowed without explicit conversion. This helps to prevent type errors and enhances code reliability. Examples of strongly typed languages include Java, Python, and Haskell.
2. Types of data types in Java:
    - **Primitive**: Primitive data types are the most basic data types available in Java. They are not objects and hold their values directly in memory. Java has 8 primitive data types:
        - **byte**: 8-bit signed integer.
        - **short**: 16-bit signed integer.
        - **int**: 32-bit signed integer.
        - **long**: 64-bit signed integer.
        - **float**: Single-precision 32-bit IEEE 754 floating point.
        - **double**: Double-precision 64-bit IEEE 754 floating point.
        - **boolean**: Represents one bit of information, either true or false.
        - **char**: Single 16-bit Unicode character.
    - **Non-Primitive**: Non-primitive data types are also known as reference types because they refer to objects. Unlike primitive data types, non-primitive types can be used to call methods to perform certain operations. Examples of non-primitive data types include:
        - **String**: Represents a sequence of characters.
        - **Arrays**: A collection of elements of the same type.
        - **Classes**: Blueprints for creating objects.
        - **Interfaces**: Abstract types used to specify a behavior that classes must implement.
        - **Enums**: Special classes that represent a group of constants.
3. Java code for datatypes is in *DataTypes.java*