/**
 * BigJava P3.3 challenge:
 * Write a program that reads an integer and prints how many digits the number has, by
 * checking whether the number is ≥ 10, ≥ 100, and so on. (Assume that all integers are
 * less than ten billion.) If the number is negative, first multiply it with –1.
 */

package com.timvisee.hhs;

import java.util.Scanner;

/**
 * Main class.
 */
public class Main {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner in = new Scanner(System.in);

        // Ask for an input value
        System.out.println("Enter an input value:");
        int val = in.nextInt();

        // Absolute the value
        val = Math.abs(val);

        // Convert the number to a string
        String valStr = String.valueOf(val);

        // Count the number of digits the number has
        int digitCount = valStr.length();

        // Print the results
        System.out.println("Number of digits: " + digitCount);
    }
}
