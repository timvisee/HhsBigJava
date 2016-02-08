/**
 * BigJava P2.4 challenge:
 * Write a program that prompts the user for two integers and then prints
 * A. The sum.
 * B. The difference.
 *
 * @author Tim Visee
 * @website www.timvisee.com
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
        // Create a scanner instance for user input
        Scanner in = new Scanner(System.in);

        // Ask the user for input
        int a = in.nextInt();
        int b = in.nextInt();

        // Calculate and print the sum
        System.out.println("Sum: " + (a + b));

        // Calculate and print the difference
        System.out.println("Absolute difference: " + Math.abs(a - b));
    }
}
