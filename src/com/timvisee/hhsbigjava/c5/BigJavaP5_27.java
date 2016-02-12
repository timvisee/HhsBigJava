/**
 * BigJava P5.27 challenge:
 * Write a program that converts a Roman number such as MCMLXXVIII to its decimal number representation.
 * Hint: First write a method that yields the numeric value of each of the letters. Then use the following algorithm:
 *
 *     total = 0
 *     While the roman number string is not empty
 *      If value(first character) is at least value(second character), or the string has length 1
 *       Add value(first character) to total.
 *       Remove the character.
 *      Else
 *       Add the difference value(second character) - value(first character) to total.
 *       Remove both characters.
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c5;

/**
 * Main class.
 */
public class BigJavaP5_27 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {

    }
}
