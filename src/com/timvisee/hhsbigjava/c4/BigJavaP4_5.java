/**
 * BigJava P4.5 challenge:
 * Write a program that reads a set of floating­point values. Ask the user to enter the
 * values, then print:
 * - the average of the values.
 * - the smallest of the values.
 * - the largest of the values.
 * - the range, that is the difference between the smallest and largest.
 * Of course, you may only prompt for the values once.
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
public class BigJavaP4_5 {

    /**
     * Main method, called ons start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner in = new Scanner(System.in);

        // Ask the user for input values
        System.out.println("Please enter some floating point values, end with an empty line:");

        // Create a list for the numbers
        List<Float> floats = new ArrayList<>();

        // Gather the input
        while(true) {
            // Gather the input
            String line = in.nextLine();

            // If the line is blank, continue
            if(line.trim().length() == 0)
                break;

            // Try to parse the line as a float value
            try {
                floats.add(Float.valueOf(line));

            } catch(Exception ex) {
                System.out.println("The value you've entered is invalid, please enter a new valid value.");
            }
        }

        // Make sure some values are entered
        if(floats.size() == 0) {
            System.out.println("You haven't entered any floating point values, the program will quit!");
            System.exit(0);
        }

        // Loop through the values and determine the minimum, maximum and the sum
        float min = floats.get(0);
        float max = floats.get(0);
        float total = 0.0f;
        for(float f : floats) {
            // Update the minimum value
            if(f < min)
                min = f;

            // Update the maximum value
            if(f > max)
                max = f;

            // Add the number to the total
            total += f;
        }

        // Calculate the average and the range of the values
        float avg = total / ((float) floats.size());
        float range = Math.abs(max - min);

        // Print the results
        System.out.println("Number of values: " + floats.size());
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average of the values: " + avg);
        System.out.println("Range of the values: " + range);
    }
}
