/**
 * BigJava P5.3 challenge:
 * Write the following methods.
 * a. int firstDigit(int n), returning the first digit of the argument.
 * b. int lastDigit(int n), returning the last digit of the argument.
 * c. int digits(int n), returning the number of digits of the argument.
 * For example, firstDigit(1729) is 1, lastDigit(1729) is 9, and digits(1729) is 4. Provide a program that tests your methods.
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c5;

import java.util.Scanner;

/**
 * Main class.
 */
public class BigJavaP5_3 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner in = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Please enter a number.");
        int value = in.nextInt();

        // Return the results
        System.out.println("First digit: " + firstDigit(value));
        System.out.println("Last digit: " + lastDigit(value));
        System.out.println("Number of digits " + digits(value));
    }

    /**
     * Get the first digit from a number, the minus sign is omitted.
     *
     * @param n The number.
     *
     * @return The first digit as character.
     */
    public static char firstDigit(int n) {
        // Absolute the number, convert it to a string and return the first digit as character
        return String.valueOf(Math.abs(n)).charAt(0);
    }

    /**
     * Get the last digit from a number, the minus sign is omitted.
     *
     * @param n The number.
     *
     * @return The last digit as character.
     */
    public static char lastDigit(int n) {
        // Convert the value into a string
        String s = String.valueOf(n);

        // Return the last digit as character
        return s.charAt(s.length() - 1);
    }

    /**
     * Count the number of digits for a number, the minus is omitted.
     *
     * @param n The number.
     *
     * @return The number of digits a number has.
     */
    public static int digits(int n) {
        // Absolute the value, convert it into a string and return the number of characters
        return String.valueOf(Math.abs(n)).length();
    }
}
