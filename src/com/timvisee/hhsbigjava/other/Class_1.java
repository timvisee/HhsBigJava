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
public class Class_1 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Define an array of numbers
        int[] nums = {
                8,
                2,
                -4,
                0,
                5,
                6,
                22,
                3,
        };

        // Loop through the numbers, and only porint the numbers smaller than 5
        for(int num : nums)
            if(num < 5)
                System.out.println(num);
    }
}
