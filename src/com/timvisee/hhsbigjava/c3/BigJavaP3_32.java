/**
 * BigJava P3.32 challenge:
 * When you use an automated teller machine (ATM) with your bank card, you need to use a personal identification number
 * (PIN) to access your account. If a user fails more than three times when entering the PIN, the machine will block the
 * card. Assume that the user’s PIN is “1234” and write a program that asks the user for the PIN no more than three times,
 * and does the following:
 * - If the user enters the right number, print a message saying, “Your PIN is correct”, and end the program.
 * - If the user enters a wrong number, print a message saying, “Your PIN is incorrect” and, if you have asked for the PIN
 *   less than three times, ask for it again.
 * - If the user enters a wrong number three times, print a message saying “Your bank card is blocked” and end the program.
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c3;

import java.util.Scanner;

/**
 * Main class.
 */
public class BigJavaP3_32 {

    /**
     * Pin number.
     */
    public static final int PIN = 1234;

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner in = new Scanner(System.in);

        // Define some variables
        int tries = 0;

        // Start a while loop and ask for the pin
        while(true) {
            // Ask the user for a PIN number
            System.out.println("Enter your PIN number:");
            int pin = in.nextInt();

            // Compare the PIN
            if(pin == PIN) {
                System.out.println("Your PIN is correct!");
                System.exit(0);
            }

            // Show an error message
            System.out.println("Your PIN is incorrect!");

            // Increase the tries number
            tries++;

            // If the user has tried to much, show an error
            if(tries >= 3) {
                System.out.println("Your bank card is blocked!");
                System.exit(0);
            }
        }
    }
}
