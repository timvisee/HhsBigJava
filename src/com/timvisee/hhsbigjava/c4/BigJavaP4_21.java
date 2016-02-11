/**
 * BigJava P4.21 challenge:
 * Write a program that reads an integer and displays, using asterisks, a filled diamond
 * of the given side length. For example, if the side length is 4, the program should dis­
 * play
 *     *
 *    ***
 *   *****
 *  *******
 *   *****
 *    ***
 *     *
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c4;

import java.util.Scanner;

/**
 * Main class.
 */
public class BigJavaP4_21 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner in = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter the size for the diamond: ");
        int size = in.nextInt();

        // Define an index and inverted variable
        int i = 0;
        boolean invert = false;

        // Start a loop, to print the star
        while(i >= 0 || !invert) {
            // Prefix the asterisks with the proper amount of spaces
            for(int j = size - i - 1; j > 0; j--)
                System.out.print(" ");

            // Print the asterisks
            for(int j = 0; j < i * 2 + 1; j++)
                System.out.print("*" + (j == i * 2 ? "\n" : ""));

            // Increase or decrease the index counter
            if(!invert) {
                i++;

                // Once the loop is finished counting up, invert the loop
                invert = i == size - 1;
            } else
                i--;
        }
    }
}
