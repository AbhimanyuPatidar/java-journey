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

# Java Identifiers
1. Identifiers are names given to various program elements such as variables, methods, classes, etc.
2. They must begin with a letter (A-Z or a-z), currency character ($), or an underscore (_).
3. Subsequent characters can be letters, digits (0-9), currency characters, or underscores.
4. Identifiers are case-sensitive.
5. They cannot be a reserved keyword in Java.
6. There is no limit on the length of an identifier.
7. The **reserved keywords** are:
    `abstract`, `assert`, `boolean`, `break`, `byte`, `case`, `catch`, `char`, `class`, `const`, `continue`, `default`, `do`, `double`, `else`, `enum`, `extends`, `final`, `finally`, `float`, `for`, `goto`, `if`, `implements`, `import`, `instanceof`, `int`, `interface`, `long`, `native`, `new`, `null`, `package`, `private`, `protected`, `public`, `return`, `short`, `static`, `strictfp`, `super`, `switch`, `synchronized`, `this`, `throw`, `throws`, `transient`, `try`, `void`, `volatile`, `while`

# Operators
Java provides a rich set of operators to manipulate variables. We can divide all the Java operators into the following groups:

1. **Arithmetic Operators**: Used to perform basic arithmetic operations.
    - `+` (Addition)
    - `-` (Subtraction)
    - `*` (Multiplication)
    - `/` (Division)
    - `%` (Modulus)

2. **Unary Operators**: Used with only one operand.
    - `+` (Unary plus)
    - `-` (Unary minus)
    - `++` (Increment)
    - `--` (Decrement)
    - `!` (Logical complement)

3. **Assignment Operators**: Used to assign values to variables.
    - `=` (Simple assignment)
    - `+=` (Add and assign)
    - `-=` (Subtract and assign)
    - `*=` (Multiply and assign)
    - `/=` (Divide and assign)
    - `%=` (Modulus and assign)

4. **Relational Operators**: Used to compare two values.
    - `==` (Equal to)
    - `!=` (Not equal to)
    - `>` (Greater than)
    - `<` (Less than)
    - `>=` (Greater than or equal to)
    - `<=` (Less than or equal to)

5. **Logical Operators**: Used to combine multiple boolean expressions.
    - `&&` (Logical AND)
    - `||` (Logical OR)
    - `!` (Logical NOT)

6. **Bitwise Operators**: Used to perform bit-level operations.
    - `&` (Bitwise AND)
    - `|` (Bitwise OR)
    - `^` (Bitwise XOR)
    - `~` (Bitwise complement)

7. **Ternary Operator**: Used as a shorthand for the `if-else` statement.
    - `condition ? if true : if false` (Ternary conditional)

8. **Shift Operators**: Used to shift bits left or right.
    - `<<` (Left shift)
    - `>>` (Right shift)
    - `>>>` (Unsigned right shift)

9. **Instanceof Operator**: Used to test whether an object is an instance of a specific class or subclass.
    - `instanceof`

10. **Miscellaneous Operators**:
    - `.` (Dot operator)
    - `[]` (Array subscript)
    - `()` (Parentheses for method calls)

Java code for operators is in 'Operators.java'

# Types of Variables
1. **Local Variables**:
    - Declared inside a method, constructor, or block.
    - Created when the method, constructor, or block is entered and destroyed once it is exited.
    - Only accessible within the method, constructor, or block where it is declared.
    - No default value; must be initialized before use.

2. **Instance Variables**:
    - Declared inside a class but outside any method, constructor, or block.
    - Created when an object of the class is instantiated and destroyed when the object is destroyed.
    - Each object has its own copy of instance variables.
    - Default values: 0 for numeric types, false for boolean, and null for object references.

3. **Class/Static Variables**:
    - Declared with the `static` keyword inside a class but outside any method, constructor, or block.
    - Created when the program starts and destroyed when the program stops.
    - Shared among all instances of the class.
    - Default values: 0 for numeric types, false for boolean, and null for object references.

Java code for variables is in 'VariableTypes.java'