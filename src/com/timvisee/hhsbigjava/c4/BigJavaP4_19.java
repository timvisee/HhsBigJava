/**
 * BigJava P4.19 challenge:
 * Write a program that prints a multiplication table, like this:
 *  1  2  3  4  5 ..
 *  2  4  6  8 10 ..
 *  3  6  9 ..
 *  4  8 12 ..
 *  5 10 15 ..
 * .. .. ..
 */

package com.timvisee.hhsbigjava.c4;

/**
 * Main class.
 */
public class BigJavaP4_19 {

    /**
     * The number of positions on the X coordinate.
     */
    public static final int X_SIZE = 10;

    /**
     * The number of positions on the Y coordinate.
     */
    public static final int Y_SIZE = 10;

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a for loop to loop through the positions of the matrix
        for(int x = 1; x <= 10; x++)
            for(int y = 1; y <= 10; y++)
                System.out.print(String.format("%3s" , (y * x)) + (y == Y_SIZE ? "\n" : " "));
    }
}
