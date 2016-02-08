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

        // Ask the user for a price
        System.out.println("Enter a price:");
        double price = in.nextDouble();

        // Calculate the tax
        if(price <= 50000)
            System.out.println("Income tax: " + (price * 0.01));

        else if(price <= 75000)
            System.out.println("Income tax: " + (price * 0.02));

        else if(price <= 100000)
            System.out.println("Income tax: " + (price * 0.03));

        else if(price <= 250000)
            System.out.println("Income tax: " + (price * 0.04));

        else if(price <= 500000)
            System.out.println("Income tax: " + (price * 0.05));

        else
            System.out.println("Income tax: " + (price * 0.06));
    }
}
