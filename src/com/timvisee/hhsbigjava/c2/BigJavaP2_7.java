/**
 * BigJava P2.7 challenge:
 * Write a program that prompts the user for a radius and then prints:
 * A. The area and circumference of a circle with that radius.
 * B. The volume and surface area of a sphere with that radius.
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c2;

import java.util.Scanner;

/**
 * Main class.
 */
public class BigJavaP2_7 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner instance
        Scanner in = new Scanner(System.in);

        // Ask the user for a radius value
        System.out.println("Enter a radius value:");
        double radius = in.nextDouble();

        // Calculate the area, circumference and volume
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = Math.PI  * 2 * radius;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double surface = 4.0 * Math.PI * Math.pow(radius, 2);

        // Print the results
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
        System.out.println("Volume: " + volume);
        System.out.println("Surface: " + surface);
    }
}
