/**
 * BigJava P3.21 challenge:
 * The original U.S. income tax of 1913 was quite simple. The tax was:
 * - 1 percent on the first $50,000.
 * - 2 percent on the amount over $50,000 up to $75,000.
 * - 3 percent on the amount over $75,000 up to $100,000.
 * - 4 percent on the amount over $100,000 up to $250,000.
 * - 5 percent on the amount over $250,000 up to $500,000.
 * - 6 percent on the amount over $500,000.
 * There was no separate schedule for single or married taxpayers. Write a program that computes the income tax
 * according to this schedule.
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c3;

import java.util.Scanner;

/**
 * Main class.
 */
public class BigJavaP3_21 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner instance for user input
        Scanner in = new Scanner(System.in);

        // Ask the user for a price
        System.out.println("Enter your annual income:");
        double price = in.nextDouble();

        // Define an array of taxes
        double taxes[][] = {
                {50000.0, 0.01},
                {75000.0, 0.02},
                {100000.0, 0.03},
                {250000.0, 0.04},
                {500000.0, 0.05},
                {-1.0, 0.06},
        };

        // Define a variable to put the tax in
        double tax = 0.0;

        // Loop through all the taxes
        for(int i = 0; i < taxes.length; i++) {
            // Add the tax to the sum
            if(taxes[i][0] != -1.0)
                tax += Math.min(price, taxes[i][0]) * taxes[i][1];
            else
                tax += taxes[i][0] * taxes[i][1];

            // Decrease the current price
            price -= taxes[i][0];

            // Make sure the price doesn't go out of bound
            if(price <= 0)
                break;
        }

        System.out.println("Income tax: " + tax);
    }
}
