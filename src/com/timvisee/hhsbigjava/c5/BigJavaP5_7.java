/**
 * BigJava P5.7 challenge:
 * Write a method public static int countWords(String str) that returns a count of all words in the string str.
 * Words are separated by spaces. For example, countWords("Mary had a little lamb") should return 5.
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c5;

import java.util.Scanner;

/**
 * Main class.
 */
public class BigJavaP5_7 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner in = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Please enter the string: ");
        String str = in.nextLine();

        // Return the results
        System.out.println("Number of words: " + countWords(str));
    }

    /**
     * Count the number of words in the given string. Spaces on both outsides of the string are omitted.
     *
     * @param str The string.
     *
     * @return The number of words in the string
     */
    public static int countWords(String str) {
        // Trim the string, and return the number of spaces plus one
        return str.trim().split(" ").length + 1;
    }
}
