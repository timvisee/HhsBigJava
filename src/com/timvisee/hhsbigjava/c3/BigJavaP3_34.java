/**
 * BigJava P3.34 challenge:
 * A supermarket awards coupons depending on how much a customer spends on
 * groceries. For example, if you spend $50, you will get a coupon worth eight percent
 * of that amount. The following table shows the percent used to calculate the coupon
 * awarded for different amounts spent. Write a program that calculates and prints the
 * value of the coupon a person can receive based on groceries purchased.
 *
 * - Up to 10 dollars:          No coupon
 * - From 10 to 60 dollars:     8% coupon
 * - From 50 to 150 dollars:    10% coupon
 * - From 150 to 210 dollars:   12% coupon
 * - More than 210 dollars:     14% coupon
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c3;

import java.util.Scanner;

/**
 * Main class.
 */
public class BigJavaP3_34 {

    /**
     * The prices required for coupon codes.
     * These values in [max_price, coupon_factor] format.
     * A max_price value of -1 will be interpreted as infinite.
     */
    public static final double[][] COUPONS = {
            {10.0, 0.0},
            {60.0, 0.08},
            {150.0, 0.1},
            {210.0, 0.12},
            {-1.0, 0.14},
    };

    /**
     * MaiZn method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner in = new Scanner(System.in);

        // Ask the user for the groceries cost, and gather the input
        System.out.print("Please enter the cost of your groceries: ");
        double cost = in.nextDouble();

        // Loop through the coupons
        for(int i = 0; i < COUPONS.length; i++) {
            // Check whether the current price is under the minimum price of this coupon
            if(cost < COUPONS[i][0] || COUPONS[i][0] == -1.0) {
                printCoupon(cost, COUPONS[i][1]);
                break;
            }
        }
    }

    /**
     * Print the data for a coupon.
     *
     * @param cost The cost.
     * @param couponFactor The coupon factor.
     */
    public static void printCoupon(double cost, double couponFactor) {
        // Show a message if no coupon was won
        if(couponFactor == 0.0) {
            System.out.println("You haven't won any coupon code!");
            return;
        }

        // Calculate the discount and the coupon percentage
        double discount = cost * couponFactor;
        int percentage = (int) (couponFactor * 100.0);

        // Print the result
        System.out.println("You win a discount coupon of $" + discount + ". (" + percentage + "% discount of your purchase))");
    }
}
