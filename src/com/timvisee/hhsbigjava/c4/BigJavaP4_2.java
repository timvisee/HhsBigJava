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

        // Print the smallest and largest values
        System.out.println("Smallest: " + getSmallest(ints));
        System.out.println("Largest: " + getLargest(ints));

        // Print the number of even and odd numbers
        System.out.println("Even numbers: " + countEven(ints));
        System.out.println("Odd numbers: " + countOdd(ints));

        // Print the cumulative and adjacent integers
        printCumulative(ints);
        printAdjacent(ints);
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

    /**
     * Count the number of even integers in a list of integers.
     *
     * @param ints List of integers.
     *
     * @return Number of even values.
     */
    public static int countEven(List<Integer> ints) {
        // Define a counter
        int counter = 0;

        // Loop through all the numbers and check whether it's even
        for(int i : ints)
            if(isEven(i))
                counter++;

        // Return the number of even values
        return counter;
    }

    /**
     * Count the number of odd integers in a list of integers.
     *
     * @param ints List of integers.
     *
     * @return Number of odd values.
     */
    public static int countOdd(List<Integer> ints) {
        return ints.size() - countEven(ints);
    }

    /**
     * Print all the cumulative numbers of a list of integers.
     *
     * @param ints The list of integers.
     */
    public static void printCumulative(List<Integer> ints) {
        // Print the cumulative totals
        System.out.print("Cumulative values: ");
        int total = 0;
        for(int i : ints)
            System.out.print((total += i) + " ");

        // Append a new line to the end
        System.out.println("");
    }

    /**
     * Print all adjacent numbers in a list of integers.
     *
     * @param ints The list of integers.
     */
    public static void printAdjacent(List<Integer> ints) {
        // Print all adjacent values
        System.out.print("Adjacent values: ");

        // Define a variable for the last number, and create a printed flag
        int last = ints.get(0);
        boolean printed = false;

        // Loop through all the numbers
        for(int i = 1; i < ints.size(); i++) {
            // Get the current value
            int val = ints.get(i);

            // Check whether this number equals to the last one
            if(val == last) {
                // Print the value if it's the second occurrence, and set the proper flags
                if(!printed) {
                    System.out.print(val + " ");
                    printed = true;
                }

            } else {
                // Set the last value
                last = val;

                // Reset the printed flag
                printed = false;
            }
        }

        // Append a new line to the end
        System.out.println("");
    }

    /**
     * Check whether a number is even. Zero is even.
     *
     * @param i The number to check for.
     *
     * @return True if the number is even, false if not.
     */
    public static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
