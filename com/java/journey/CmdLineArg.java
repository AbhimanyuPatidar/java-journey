// Code to demonstrate the use of command line arguments in Java

package com.java.journey;

public class CmdLineArg {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Command line arguments are:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command line arguments found.");
        }
    }
}

/*
Output:
If you run this program with command line arguments, for example:
java CmdLineArg arg1 arg2 arg3

The output will be:
Command line arguments are:
arg1
arg2
arg3

If you run this program without any command line arguments, the output will be:
No command line arguments found.

Explanation:
1. The `main` method is the entry point of the Java application.
2. `args` is an array of `String` objects that stores the command line arguments passed to the program.
3. The `if` statement checks if the length of `args` is greater than 0, meaning there are command line arguments.
4. If there are arguments, it prints "Command line arguments are:" and then iterates over each argument in the `args` array, printing each one.
5. If there are no arguments, it prints "No command line arguments found."
*/