package com.timvisee.hhs;

import java.util.Scanner;

public class Main {

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
        if(nums[0] == nums[1] && nums[1] == nums[2])
            System.out.println("all the same");

        else if(nums[0] != nums[1] && nums[0] != nums[2] && nums[1] != nums[2])
            System.out.println("all different");

        else
            System.out.println("neither");
    }
}
