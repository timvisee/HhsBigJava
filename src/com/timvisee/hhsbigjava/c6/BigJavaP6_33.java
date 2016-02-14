/**
 * BigJava P6.33 challenge:
 * You are given a two-dimensional array of values that give the height of a terrain at different points in a square.
 * Write a method
 * public static void floodMap(double[][] heights, double waterLevel)
 * that prints out a flood map, showing which of the points in the terrain would be flooded if the water level was
 * the given value. In the flood map, print a * for each flooded point and a space for each point that is not flooded.
 * Here is a sample map:
 *   * * * *         * *
 *   * * * * *     * * *
 *   * * * *         * *
 *   * * *         * * *
 *   * * * *     * * * *
 *   * * * * * * * * * *
 *   * *     * * *
 *   *       * * * *   *
 *                   * *
 *                 * * *
 * Then write a program that reads one hundred terrain height values and shows how the terrain gets flooded when the
 * water level increases in ten steps from the lowest point in the terrain to the highest.
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c6;

/**
 * Main class.
 */
public class BigJavaP6_33 {

    /**
     * The default heightmap.
     */
    public static final double[][] BASE_MAP = {
            {1, 1, 1, 1, 0, 0, 0, 0, 1, 1},
            {1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
            {1, 1, 1, 1, 0, 0, 0, 0, 1, 1},
            {1, 1, 1, 0, 0, 0, 0, 1, 1, 1},
            {1, 1, 1, 1, 0, 0, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 0, 0, 1, 1, 1, 0, 0, 0},
            {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
    };

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {

    }

    /**
     * Flood a given map of heights with the specified water level. The result is printed in the console.
     *
     * @param heights A map of heights.
     * @param waterLevel The water level.
     */
    public static void floodMap(double[][] heights, double waterLevel) {
        // Loop through the map matrix
        for(int i = 0; i < heights.length; i++) {
            for(int j = 0; j < heights[0].length; j++) {

            }
        }
    }
}
