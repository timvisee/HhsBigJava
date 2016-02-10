/**
 * BigJava P4.1 challenge:
 * Write programs with loops that compute:
 * A. The sum of all even numbers between 2 and 100 (inclusive).
 * B. The sum of all squares between 1 and 100 (inclusive).
 * C. All powers of 2 from 20 up to 220.
 * D. The sum of all odd numbers between a and b (inclusive), where a and b are inputs.
 * E. The sum of all odd digits of an input. (For example, if the input is 32677, the sum would be 3 + 7 + 7 = 17.)
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c4;

import java.util.Scanner;

/**
 * Main class.
 */
public class BigJavaP4_1 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Make sure two arguments are entered
        if(args.length != 2) {
            System.out.println("You have entered invalid arguments!");
            System.out.println("Required arguments: <min> <max>");
            System.exit(0);
        }

        // Parse the minimum and maximum value
        int min = 0;
        int max = 0;
        try {
            int a = Integer.valueOf(args[0]);
            int b = Integer.valueOf(args[1]);

            // Put the two values in the proper variable
            min = Math.min(a, b);
            max = Math.max(a, b);

        } catch(Exception ex) {
            System.out.println("The parameters you've entered are invalid, make sure you enter integers!");
            System.exit(0);
        }

        // Define the sum variable
        double sum = 0;

        // Complete the sum of all even numbers from 2 to 100
        sum = 0;
        for(int i = min; i <= max; i += 2)
            sum += i;
        System.out.println("A: " + (int) sum);

        // Complete the sum of all even numbers from 2 to 100
        sum = 0;
        for(int i = min; i <= max; i++)
            sum += Math.sqrt((double) i);
        System.out.println("B: " + sum);

        // Complete the sum of all even numbers from 2 to 100
        sum = 0;
        for(int i = min; i <= max; i++)
            sum += Math.pow(i, 2);
        System.out.println("C: " + (int) sum);

        // Create a scanner instance to gather input
        Scanner in = new Scanner(System.in);

        // Loop through all numbers
        sum = 0;
        for(int i = min; i <= max; i++)
            // Make sure the number is odd
            if(!isEven(i))
                sum += i;
        System.out.println("D: " + (int) sum);

        // Ask the user for an input value, and convert it to a string afterwards
        int val = in.nextInt();
        String valStr = String.valueOf(val);

        // Handle each digit in the value separately
        sum = 0;
        for(int i = 0; i < valStr.length(); i++) {
            // Get the character at this position
            char c = valStr.charAt(i);

            // Skip the minus sign
            if(c == '-')
                continue;

            // Determine the number
            int n = Character.getNumericValue(c);

            // Determine whether the number is odd, if it is add it to the sum
            if(!isEven(n))
                sum += n;
        }
        System.out.println("E: " + (int) sum);
    }

    /**
     * Check whether a number is even.
     *
     * @param i The number to check.
     *
     * @return True if even, false if not.
     */
    public static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
