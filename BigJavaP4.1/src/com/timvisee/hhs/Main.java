/**
 * BigJava P4.1 challenge:
 * Write programs with loops that compute:
 * a. The sum of all even numbers between 2 and 100 (inclusive).
 * b. The sum of all squares between 1 and 100 (inclusive).
 * c. All powers of 2 from 20 up to 220.
 * d. The sum of all odd numbers between a and b (inclusive), where a and b are inputs.
 * e. The sum of all odd digits of an input. (For example, if the input is 32677, the sum would be 3 + 7 + 7 = 17.)
 */

package com.timvisee.hhs;

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
        // Define the sum variable
        double sum = 0;

        // Complete the sum of all even numbers from 2 to 100
        sum = 0;
        for(int i = 2; i <= 100; i += 2)
            sum += i;
        System.out.println("A: " + ((int) sum));

        // Complete the sum of all even numbers from 2 to 100
        sum = 0;
        for(int i = 1; i <= 100; i++)
            sum += Math.sqrt((double) i);
        System.out.println("B: " + sum);
    }
}
