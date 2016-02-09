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
     * Tax configuration. This configuration specifies the tax over each amount of money.
     * These taxes are specified in [max_price, tax_factor] format.
     * If the max_price value is set to -1, it's maximum price is ignored.
     */
    public static final double TAX_CONFIG[][] = {
            {50000.0, 0.01},
            {75000.0, 0.02},
            {100000.0, 0.03},
            {250000.0, 0.04},
            {500000.0, 0.05},
            {-1.0, 0.06},
    };

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

        // Calculate and print the tax
        System.out.println("Income tax: " + calculateTax(price));
    }

    /**
     * Calculate the tax for the specified annual income.
     *
     * @param income The annual income.
     *
     * @return The tax over this income.
     */
    private static double calculateTax(double income) {
        // Define a variable to put the tax in
        double tax = 0.0;

        // Loop through all the taxes
        for(int i = 0; i < TAX_CONFIG.length; i++) {
            // Calculate and add the tax with the proper factor, max the price to the max_price value or ignore it for -1
            tax += (TAX_CONFIG[i][0] != -1.0 ? Math.min(income, TAX_CONFIG[i][0]) : TAX_CONFIG[i][0]) * TAX_CONFIG[i][1];

            // Decrease the current price
            income -= TAX_CONFIG[i][0];

            // Make sure the price doesn't go out of bound
            if(income <= 0)
                break;
        }

        return tax;
    }
}
