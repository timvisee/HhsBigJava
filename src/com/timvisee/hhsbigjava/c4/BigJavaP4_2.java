/**
 * BigJava P4.2 challenge:
 * Write programs that read a sequence of integer inputs and print:
 * a. The smallest and largest of the inputs.
 * b. The number of even and odd inputs.
 * c. Cumulative totals. For example, if the input is 1 7 2 9, the program should print 1 8 10 19.
 * d. All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the program should print 3 5 6.
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
public class BigJavaP4_2 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner in = new Scanner(System.in);

        // Create a list to put the input numbers in
        List<Integer> ints = new ArrayList<>();

        // Ask the user for input
        System.out.println("Please enter some numbers, enter a blank line to stop the input:");
        while(true) {
            // Gather the user input
            String valStr = in.nextLine();

            // Check whether the line is empty, to stop asking for user input
            if(valStr.trim().length() == 0) {
                break;
            }

            // Try to parse the value, and add it to the list
            try {
                ints.add(Integer.valueOf(valStr));
            } catch(Exception ex) {
                System.out.println("You've entered an illegal integer! ");
                System.out.println("Enter a new integer, or a blank line to stop the input.");
            }
        }

        // Make sure the user has entered at least one integer
        if(ints.size() == 0) {
            System.out.println("You haven't entered any integers! The application will quit.");
            System.exit(0);
        }
    }

    /**
     * Get the smallest value from a list of integers.
     *
     * @param ints List of integers.
     *
     * @return The smallest integer.
     */
    public static int getSmallest(List<Integer> ints) {
        // Store the smallest integer
        int smallest = ints.get(0);

        // Loop through all the numbers
        for(Integer i : ints)
            if(smallest > i)
                smallest = i;

        // Return the smallest value
        return smallest;
    }

    /**
     * Get the largest value from a list of integers.
     *
     * @param ints List of integers.
     *
     * @return The smallest integer.
     */
    public static int getLargest(List<Integer> ints) {
        // Store the largest integer
        int largest = ints.get(0);

        // Loop through all the numbers
        for(Integer i : ints)
            if(largest < i)
                largest = i;

        // Return the largest value
        return largest;
    }
}
