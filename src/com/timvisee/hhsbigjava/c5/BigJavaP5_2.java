/**
 * BigJava P5.2 challenge:
 * Write the following methods and provide a program to test them.
 * a. boolean allTheSame(double x, double y, double z), returning true if the arguments are all the same.
 * b. boolean allDifferent(double x, double y, double z), returning true if the arguments are all different.
 * c. boolean sorted(double x, double y, double z), returning true if the arguments are sorted, with the smallest one
 *     coming first.
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c5;

import java.util.Scanner;

/**
 * Main class.
 */
public class BigJavaP5_2 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner in = new Scanner(System.in);

        // Ask the user for three values
        System.out.println("Please enter three values:");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        // Return the results
        System.out.println("All the same: " + (allTheSame(x, y, z) ? "true" : "false"));
        System.out.println("All different: " + (allDifferent(x, y, z) ? "true" : "false"));
        System.out.println("Sorted (smallest to largest) " + (sorted(x, y, z) ? "true" : "false"));
    }

    /**
     * Check whether three values are equal to each other.
     *
     * @param x The first value.
     * @param y The second value.
     * @param z The third value.
     *
     * @return True if all the values are the same, false if not.
     */
    public static boolean allTheSame(double x, double y, double z) {
        return x == y && y == z;
    }

    /**
     * Check whether three values are all different.
     *
     * @param x The first value.
     * @param y The second value.
     * @param z The third value.
     *
     * @return True if all three values are different, false if not.
     */
    public static boolean allDifferent(double x, double y, double z) {
        return x != y && x != z && y != z;
    }

    /**
     * Check whether three values are storted, where the smallest value comes first, and the biggest value last.
     *
     * @param x The first value.
     * @param y The second value.
     * @param z The third value.
     *
     * @return True if x is the smallest value, and z is the biggest value, false otherwise.
     */
    public static boolean sorted(double x, double y, double z) {
        return x <= y && z >= y;
    }
}
