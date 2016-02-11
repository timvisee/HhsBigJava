/**
 * BigJava P5.16 challenge:
 * Write a recursive method
 * public static boolean isPalindrome(String str)
 * that returns true if str is a palindrome, that is, a word that is the same when reversed.
 * Examples of palin drome are “deed”, “rotor”, or “aibohphobia”. Hint: A word is a palindrome if the first and last
 * letters match and the remainder is also a palindrome.
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c5;

import java.util.Scanner;

/**
 * Main class.
 */
public class BigJavaP5_16 {

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
        System.out.println("Is palindrome: " + (isPalindrome(str) ? "true" : "false"));
    }

    /**
     * Check whether a string is a palindrome. Surrounding whitespaces are taken into consideration too.
     * Note: This method works recursively.
     *
     * @param str The string to check.
     *
     * @return True if the string is a palindrome, false if not.
     */
    public static boolean isPalindrome(String str) {
        // Compare the first and the last value
        if(str.charAt(0) != str.charAt(str.length() - 1))
            return false;

        // Compare the remaining part if the string is at least 3 characters long, otherwise return true
        return str.length() < 3 || isPalindrome(str.substring(1, str.length() - 1));
    }
}
