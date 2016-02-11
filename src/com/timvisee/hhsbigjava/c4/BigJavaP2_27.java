/**
 * BigJava P4.27 challenge:
 * Currency conversion. Write a program that first asks the user to type today’s price for one
 * dollar in Japanese yen, then reads U.S. dollar values and converts each to yen. Use 0 as a sentinel.
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main class.
 */
public class BigJavaP2_27 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner in = new Scanner(System.in);

        // Ask the user for the conversion rate
        System.out.println("Please enter the amount in Japanese yen that corresponds to one dollar: ");
        double yenBase = in.nextDouble();

        // Calculate the factor
        double rateFactor = yenBase / 1.00;

        // Create a list to put the dollar values in
        List<Double> prices = new ArrayList<>();

        // Start a loop to gather prices
        System.out.println("Please enter dollar values, enter 0 when you're done:");
        while(true) {
            // Gather a value as string
            String nextValueStr = in.nextLine();

            // Try to convert the value to a double, and store it in the list if it's not zero
            try {
                double nextValue = Double.valueOf(nextValueStr);

                // If the value equals zero, stop the loop
                if(nextValue == 0)
                    break;

                // Put the value in the list
                prices.add(nextValue);

            } catch(Exception ex) {
                System.out.println("The value you've entered is invalid! Enter an additional value or 0 to stop the input.");
            }
        }

        // Make sure any values have been entered
        if(prices.size() == 0) {
            System.out.println("You haven't entered any values.");
            System.exit(0);
        }

        // Loop through all the entered values, and return the converted rate
        for(double v : prices)
            System.out.println("$" + v + "   ->   " + (v * rateFactor) + " yen");
    }
}
