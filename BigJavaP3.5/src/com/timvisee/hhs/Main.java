/**
 * BigJava P3.5 challenge: Write a program that reads three numbers and prints “increasing” if they are in increasing
 * order, “decreasing” if they are in decreasing order, and “neither” otherwise. Here, “increasing” means “strictly
 * increasing”, with each value larger than its pre decessor. The sequence 3 4 4 would not be considered increasing.
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhs;

import java.util.Scanner;

/**
 * Main class.
 */
public class Main {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner instance, and an array for the three numbers
        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];

        // Ask the user for three number
        System.out.println("Please enter three numbers:");

        // Gather the input
        for(int i = 0; i < 3; i++)
            nums[i] = in.nextInt();

        // Compare the numbers
        if(nums[0] < nums[1] && nums[1] < nums[2])
            System.out.println("increasing");

        else if(nums[0] > nums[1] && nums[1] > nums[2])
            System.out.println("decreasing");

        else
            System.out.println("neither");
    }
}
