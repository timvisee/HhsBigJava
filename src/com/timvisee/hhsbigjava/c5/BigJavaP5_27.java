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
        String romanNumeral = romanNumber.toUpperCase();

        // Loop through all the characters in the string
        for(int x = romanNumeral.length() - 1; x >= 0 ; x--) {
            // Get the character
            char convertToDecimal = romanNumeral.charAt(x);

            // Get the decimal value for this character
            switch (convertToDecimal) {
                case 'M':
                    decimal = processDecimal(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = processDecimal(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = processDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = processDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = processDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
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
