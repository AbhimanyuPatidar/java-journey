# Introduction to Input/Output in Java
Input and Output (I/O) in Java is a fundamental concept that allows programs to interact with the external environment, such as reading data from a user, writing data to files, or communicating over a network. Java provides a rich set of I/O classes and interfaces in the `java.io` and `java.nio` packages to handle various I/O operations efficiently.

## Key Concepts

- **Streams**: Java I/O is built around the concept of streams, which represent a sequence of data. There are two main types of streams:
    - **Input Streams**: Used to read data from a source (e.g., `FileInputStream`, `BufferedInputStream`).
    - **Output Streams**: Used to write data to a destination (e.g., `FileOutputStream`, `BufferedOutputStream`).

- **Readers and Writers**: For handling character data, Java provides `Reader` and `Writer` classes (e.g., `FileReader`, `BufferedReader`, `FileWriter`, `BufferedWriter`).

- **File I/O**: Java offers classes like `File`, `FileInputStream`, `FileOutputStream`, `FileReader`, and `FileWriter` to perform file operations.

- **Serialization**: Java supports object serialization, allowing objects to be converted into a byte stream and stored or transmitted. This is achieved using the `Serializable` interface and classes like `ObjectOutputStream` and `ObjectInputStream`.

Understanding these concepts is crucial for performing efficient and effective I/O operations in Java applications.

## Methods of I/O in Java

### Using `BufferedReader`

`BufferedReader` is used to read text from an input stream efficiently. Below is an example of how to use `BufferedReader` to read input from the console:

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = reader.readLine();
        System.out.println("Hello, " + name + "!");
    }
}
```

#### Explanation of `BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));`

- **`BufferedReader`**: This is a class in the `java.io` package used to read the text from an input stream (like a file or the console) efficiently.
- **`new BufferedReader(...)`**: This creates a new `BufferedReader` object. The `BufferedReader` class reads text from a character-input stream, buffering characters to provide efficient reading of characters, arrays, and lines.
- **`new InputStreamReader(System.in)`**: This creates a new `InputStreamReader` object, which is a bridge from byte streams to character streams. It reads bytes and decodes them into characters using a specified charset. Here, `System.in` is the standard input stream (typically the keyboard), and `InputStreamReader` converts the byte stream from `System.in` into a character stream.
- **Combining them**: By wrapping `System.in` in an `InputStreamReader` and then wrapping that in a `BufferedReader`, you can read text input from the console efficiently.

#### BufferedReader Methods
Here are some commonly used methods of the `BufferedReader` class:

- **`read()`**: Reads a single character. Returns the character read, or -1 if the end of the stream has been reached.
- **`readLine()`**: Reads a line of text. A line is considered to be terminated by any one of a line feed (`\n`), a carriage return (`\r`), or a carriage return followed immediately by a line feed. Returns the line read, or `null` if the end of the stream has been reached.
- **`close()`**: Closes the stream and releases any system resources associated with it. Once the stream has been closed, further read(), readLine(), or close() invocations will throw an `IOException`.

Code example is in `BufferedReaderExample.java`

### Using `Scanner`

`Scanner` is a simpler way to read input from various sources, including the console. Here is an example of using `Scanner` to read input from the console:

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
```

#### Explanation of `Scanner scanner = new Scanner(System.in);`

- **`Scanner`**: 
This is a class in the `java.util` package used to parse primitive types and strings using regular expressions.

- **`new Scanner(System.in)`**: This creates a new `Scanner` object that reads input from the standard input stream (typically the keyboard).

#### Scanner Methods
Here are some commonly used methods of the `Scanner` class:

- **`nextLine()`**: Advances the scanner past the current line and returns the input that was skipped. This method returns the rest of the current line, excluding any line separator at the end.
- **`next()`**: Finds and returns the next complete token from this scanner. A complete token is preceded and followed by input that matches the delimiter pattern.
- **`nextInt()`**: Scans the next token of the input as an `int`. If the next token is not an integer, `InputMismatchException` is thrown.
- **`nextDouble()`**: Scans the next token of the input as a `double`. If the next token is not a double, `InputMismatchException` is thrown.
- **`close()`**: Closes the scanner and releases any system resources associated with it. Once a `Scanner` is closed, it cannot be used to perform further input operations.

- **`hasNext()`**: Returns true if this scanner has another token in its input.
- **`hasNextInt()`**: Returns true if the next token in this scanner's input can be interpreted as an `int` value.
- **`hasNextDouble()`**: Returns true if the next token in this scanner's input can be interpreted as a `double` value.
- **`nextBoolean()`**: Scans the next token of the input into a `boolean`.
- **`nextFloat()`**: Scans the next token of the input into a `float`.
- **`nextLong()`**: Scans the next token of the input into a `long`.
- **`nextShort()`**: Scans the next token of the input into a `short`.

Code example is in `ScannerExample.java`

## Difference Between Scanner and BufferedReader
1. BufferedReader is synchronous while Scanner is not. BufferedReader should be used if we are working with multiple threads.
2. BufferedReader has a significantly larger buffer memory than Scanner.
3. The Scanner has a little buffer (1KB char buffer) as opposed to the BufferedReader (8KB byte buffer), but it’s more than enough.
4. BufferedReader is a bit faster as compared to Scanner because the Scanner does the parsing of input data and BufferedReader simply reads a sequence of characters.

### Using Command Line Arguments

Command line arguments are a way to pass information to a program when you run it. They are passed to the `main` method as an array of `String` objects. Here is an example of how to use command line arguments in Java:

```java
public class CommandLineExample {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Command line arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command line arguments found.");
        }
    }
}
```

#### Explanation of `public static void main(String[] args)`

- **`String[] args`**: This is an array of `String` objects that contains the command line arguments passed to the program. Each element in the array is one of the command line arguments.
- **`args.length`**: This gives the number of command line arguments passed to the program.
- **`for (String arg : args)`**: This loop iterates over each command line argument and prints it.

Command line arguments are useful for passing configuration information to your program without hardcoding it in the source code.

Code example is in `CmdLineArg.java`

### Using `Console`

The `Console` class provides methods to read text from the console and write text to the console. It is part of the `java.io` package. Here is an example of using `Console` to read input from the console:

```java
import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String name = console.readLine("Enter your name: ");
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("No console available");
        }
    }
}
```

#### Explanation of `Console console = System.console();`

- **`Console`**: This is a class in the `java.io` package that provides methods to access the character-based console device, if any, associated with the current Java virtual machine.
- **`System.console()`**: This method returns the unique `Console` object associated with the current Java virtual machine, if any. If no console device is available, it returns `null`.

#### Console Methods
Here are some commonly used methods of the `Console` class:

- **`readLine(String fmt, Object... args)`**: Provides a formatted prompt, then reads a single line of text from the console.
- **`readPassword(String fmt, Object... args)`**: Provides a formatted prompt, then reads a password or passphrase from the console with echoing disabled.
- **`printf(String format, Object... args)`**: Writes a formatted string to the console's output stream.
- **`flush()`**: Flushes the console and forces any buffered output to be written immediately.

Code example is in `ConsoleExample.java`

### Using `DataInputStream`

`DataInputStream` allows an application to read primitive Java data types from an underlying input stream in a machine-independent way. Here is an example of using `DataInputStream` to read input from the console:

```java
import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamExample {
    public static void main(String[] args) {
        DataInputStream dataInputStream = new DataInputStream(System.in);
        try {
            System.out.print("Enter your name: ");
            String name = dataInputStream.readLine();
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

#### Explanation of `DataInputStream dataInputStream = new DataInputStream(System.in);`

- **`DataInputStream`**: This is a class in the `java.io` package that lets an application read primitive Java data types from an underlying input stream in a machine-independent way.
- **`new DataInputStream(System.in)`**: This creates a new `DataInputStream` object that reads input from the standard input stream (typically the keyboard).

#### DataInputStream Methods
Here are some commonly used methods of the `DataInputStream` class:

- **`readLine()`**: Reads the next line of text from the input stream. Deprecated, use `BufferedReader` instead.
- **`readInt()`**: Reads four input bytes and returns an `int` value.
- **`readDouble()`**: Reads eight input bytes and returns a `double` value.
- **`readBoolean()`**: Reads one input byte and returns a `boolean` value.
- **`close()`**: Closes this input stream and releases any system resources associated with the stream.

These methods provide various ways to read input from the console in Java, each with its own use cases and advantages.

## System.out.println()

- `System.out.println()` is a method in Java used to print a message to the console.
- `System` is a built-in class in the `java.lang` package that provides access to system-level resources.
- `out` is a static member of the `System` class, which is an instance of `PrintStream`. It represents the standard output stream.
- `println` is a method of the `PrintStream` class that prints a message followed by a newline character.

- `print` outputs text without a newline, while `println` outputs text followed by a newline.

## System.err

- `System.err` is a predefined `PrintStream` object in Java that is used to output error messages or diagnostics.
- Similar to `System.out`, `System.err` is a static member of the `System` class.
- By default, `System.err` is directed to the console, but it can be redirected to a file or another output stream if needed.
- Using `System.err.println()` allows you to print error messages to the standard error stream, which can be useful for debugging and logging purposes.

### Example of Using `System.err`

```java
public class SystemErrExample {
    public static void main(String[] args) {
        System.err.println("This is an error message.");
    }
}
```

#### Explanation of `System.err.println("This is an error message.");`

- **`System.err`**: This is the standard error output stream.
- **`println`**: This method prints the specified message to the error output stream followed by a newline character.

Using `System.err` helps in distinguishing between regular output and error messages, making it easier to debug and maintain your code.

## Formatted Output using printf
`printf()` uses format specifiers for formatting. There are certain data types are mentioned below:
- For Number Formatting
- Formatting Decimal Numbers
- For Boolean Formatting
- For String Formatting
- For Char Formatting
- For Date and Time Formatting

1. For Number Formatting
```java
public class NumberFormattingExample {
    public static void main(String[] args) {
        int number = 12345;
        System.out.printf("Number: %d%n", number); // Decimal integer
        System.out.printf("Number with leading zeros: %08d%n", number); // Decimal integer with leading zeros
        System.out.printf("Number with commas: %,d%n", number); // Decimal integer with commas
        System.out.printf("Hexadecimal: %x%n", number); // Hexadecimal
        System.out.printf("Octal: %o%n", number); // Octal
    }
}
```

- **`%d`**: Formats the number as a decimal integer.
- **`%08d`**: Formats the number as a decimal integer with leading zeros, ensuring the output is at least 8 characters wide.
- **`%,d`**: Formats the number as a decimal integer with commas as thousands separators.
- **`%x`**: Formats the number as a hexadecimal integer.
- **`%o`**: Formats the number as an octal integer.

These format specifiers allow you to control the appearance of numeric output in your Java programs.

2. Formatting Decimal Numbers
```java
public class DecimalFormattingExample {
    public static void main(String[] args) {
        double number = 12345.6789;
        System.out.printf("Number: %f%n", number); // Decimal number
        System.out.printf("Number with 2 decimal places: %.2f%n", number); // Decimal number with 2 decimal places
        System.out.printf("Number with commas: %,.2f%n", number); // Decimal number with commas and 2 decimal places
        System.out.printf("Scientific notation: %e%n", number); // Scientific notation
    }
}
```

- **`%f`**: Formats the number as a decimal number.
- **`%.2f`**: Formats the number as a decimal number with 2 decimal places.
- **`%,.2f`**: Formats the number as a decimal number with commas as thousands separators and 2 decimal places.
- **`%e`**: Formats the number in scientific notation.

These format specifiers allow you to control the appearance of decimal numbers in your Java programs.

3. For Boolean Formatting
```java
public class BooleanFormattingExample {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.printf("Boolean value: %b%n", flag); // Boolean value
        System.out.printf("Boolean value (false): %b%n", false); // Boolean value (false)
    }
}
```

- **`%b`**: Formats the value as a boolean (`true` or `false`).

These format specifiers allow you to control the appearance of boolean values in your Java programs.

4. For String Formatting
```java
public class StringFormattingExample {
    public static void main(String[] args) {
        String text = "Hello, World!";
        System.out.printf("String: %s%n", text); // String
        System.out.printf("String in uppercase: %S%n", text); // String in uppercase
    }
}
```

- **`%s`**: Formats the value as a string.
- **`%S`**: Formats the value as an uppercase string.

These format specifiers allow you to control the appearance of strings in your Java programs.

5. For Char Formatting
```java
public class CharFormattingExample {
    public static void main(String[] args) {
        char letter = 'A';
        System.out.printf("Character: %c%n", letter); // Character
        System.out.printf("Character in uppercase: %C%n", letter); // Character in uppercase
    }
}
```

- **`%c`**: Formats the value as a character.
- **`%C`**: Formats the value as an uppercase character.

These format specifiers allow you to control the appearance of characters in your Java programs.

6. For Date and Time Formatting
```java
import java.util.Date;

public class DateFormattingExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("Current date and time: %tc%n", date); // Date and time
        System.out.printf("Current date: %tF%n", date); // Date in ISO 8601 format
        System.out.printf("Current time: %tr%n", date); // Time in 12-hour format
    }
}
```

- **`%tc`**: Formats the value as a date and time.
- **`%tF`**: Formats the value as a date in ISO 8601 format.
- **`%tr`**: Formats the value as a time in 12-hour format.

These format specifiers allow you to control the appearance of dates and times in your Java programs.