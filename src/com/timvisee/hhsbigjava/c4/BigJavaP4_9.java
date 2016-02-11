/**
 * BigJava P4.9 challenge:
 * Write a program that reads a word and prints the word in reverse. For example, if the user provides the input
 * "Harry", the program prints yrraH
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c4;

import java.util.Scanner;

/**
 * Main class.
 */
public class BigJavaP4_9 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner in = new Scanner(System.in);

        // Ask the user for a word
        System.out.print("Please enter a world: ");
        String str = in.nextLine();

        // Use a string buffer to rverse the string
        StringBuilder buff = new StringBuilder(str);
        str = buff.reverse().toString();

        // Print the resulting string
        System.out.println("Reversed string: " + str);
    }
}
