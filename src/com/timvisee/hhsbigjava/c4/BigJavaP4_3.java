/**
 * BigJava P4.3 challenge:
 * Write programs that read a line of input as a string and print:
 * a. Only the uppercase letters in the string.
 * b. Every second letter of the string.
 * c. The string, with all vowels replaced by an underscore.
 * d. The number of vowels in the string.
 * e. The positions of all vowels in the string.
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Main class.
 */
public class BigJavaP4_3 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner in = new Scanner(System.in);

        // Ask the user for an input string
        System.out.print("Please enter some string: ");
        final String input = in.next();

        // Loop through all the characters, and output the capital characters
        System.out.print("Uppercase characters: ");
        for(char c : input.toCharArray())
            if(Character.isUpperCase(c))
                System.out.print(c);
        System.out.println("");

        // Make sure the string has at least two characters
        if(input.length() < 2)
            System.out.println("The string doesn't have a second character.");
        else
            System.out.println("Second character in string: " + input.charAt(1));

        // Copy the string and replace all the vowels with an underscore
        final String inputVowels = input.replaceAll("[aeiou]", "\\_");
        System.out.println("Without vowels: " + inputVowels);

        // The number of vowels in the string
        System.out.println("Number of vowels: " + countOccurrencesRegex(input, Pattern.compile("[aeiou]")));

        // Determine the position of all vowels in the string
        System.out.println("Vowel positions:");
        for(int i = 0; i < input.length(); i++)
            // Check whether this character is a vowel by comparing the original string to the vowel'd string
            if(input.charAt(i) != '_' && inputVowels.charAt(i) == '_')
                System.out.println(" - Vowel " + input.charAt(i) + " is at position " + (i + 1));
    }

    /**
     * Count the number of occurrences by regex in a string.
     *
     * @param input The input string.
     * @param pattern The regex pattern.
     *
     * @return The number of occurrences.
     */
    public static int countOccurrencesRegex(String input, Pattern pattern) {
        // Create a matcher
        Matcher matcher = pattern.matcher(input);

        // Count the number of occurrences
        int count = 0;
        while (matcher.find())
            count++;

        // Return the count
        return count;
    }
}
