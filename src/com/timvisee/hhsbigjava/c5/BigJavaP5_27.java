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
 *
 * NOTE: This challenge has been solved with a more robust method, the challenge itself is ignored.
 *
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c5;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Main class.
 */
public class BigJavaP5_27 {

    /**
     * A hashmap with the value for each roman character.
     */
    public static final HashMap<Character, Integer> ROMAN_VALUES = new HashMap<Character, Integer>(){{
        put('M', 1000);
        put('D', 500);
        put('C', 100);
        put('L', 50);
        put('X', 10);
        put('V', 5);
        put('I', 1);
    }};

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner in = new Scanner(System.in);

        // Gather a roman number
        System.out.print("Please enter a roman number: ");
        String roman = in.nextLine();

        // Convert the roman number into a decimal, and print it to the console
        System.out.println("Decimal value: " + romanToDecimal(roman));
    }

    /**
     * Convert a roman number representation to a decimal.
     *
     * @param romanNumber The roman number as a string.
     *
     * @return The decimal number
     */
    public static int romanToDecimal(String romanNumber) {
        // Create a variable for the decimal, and the last number
        int decimal = 0;
        int lastNumber = 0;

        // Uppercase the string
        romanNumber = romanNumber.toUpperCase();

        // Loop through all the characters in the string
        for(int i = romanNumber.length() - 1; i >= 0 ; i--) {
            // Get the character
            char c = romanNumber.charAt(i);

            // Make sure the value exists in the list
            if(!ROMAN_VALUES.containsKey(c)) {
                System.out.println("The " + c + " character is illegal!");
                System.exit(0);
            }

            // Get the value for this character
            final int charVal = ROMAN_VALUES.get(c);

            // Process the value
            decimal = processDecimal(charVal, lastNumber, decimal);
            lastNumber = charVal;
        }

        // Return the decimal number
        return decimal;
    }

    /**
     * Process a decimal number.
     *
     * @param decimal The decimal number.
     * @param lastNumber The last number.
     * @param lastDecimal  The last decimal number.
     *
     * @return The result.
     */
    public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal)
            return lastDecimal - decimal;
        else
            return lastDecimal + decimal;
    }
}
