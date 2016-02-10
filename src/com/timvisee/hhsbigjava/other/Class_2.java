/**
 * Class one.
 *
 * Challenge:
 * Print all numbers from a number array that are smaller than 5.
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.other;

/**
 * Main class.
 */
public class Class_2 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Define an array of numbers that define the number of stars on a row
        int[] stars = {3, 3, 4, 6, 1, 0, 2, 28};

        // Loop through the stars on each line, print them afterwards. Finish the last star with a new line
        for(int i = 0; i < stars.length; i++)
            for(int j = 0; j < stars[i]; j++)
                System.out.print("* " + (j == stars[i] - 1 ? "\n" : ""));
    }
}
