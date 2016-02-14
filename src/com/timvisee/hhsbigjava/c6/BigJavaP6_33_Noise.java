/**
 * This class is part of the BigJava P6.33 challenge.
 *
 * This class can be used to generate noise.
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c6;

import java.util.Random;

/**
 * Noise class.
 */
public class BigJavaP6_33_Noise {

    /**
     * Source of entropy.
     */
    private Random rand;

    /**
     * Amount of roughness.
     */
    double roughness;

    /**
     * Plasma fractal grid.
     */
    private double[][] grid;

    /**
     * Generate a noise source based upon the midpoint displacement fractal.
     *
     * @param rand The random number generator
     * @param roughness a roughness parameter
     * @param width the width of the grid
     * @param height the height of the grid
     */
    public BigJavaP6_33_Noise(Random rand, double roughness, int width, int height) {
        this.roughness = roughness / width;
        grid = new double[width][height];
        this.rand = (rand == null) ? new Random() : rand;
    }

    /**
     * Initialise.
     */
    public void initialise() {
        int xh = grid.length - 1;
        int yh = grid[0].length - 1;

        // set the corner points
        grid[0][0] = rand.nextDouble() - 0.5;
        grid[0][yh] = rand.nextDouble() - 0.5;
        grid[xh][0] = rand.nextDouble() - 0.5;
        grid[xh][yh] = rand.nextDouble() - 0.5;

        // generate the fractal
        generate(0, 0, xh, yh);
    }

    /**
     * Add a suitable amount of random displacement to a point.
     *
     * @param v
     * @param l
     * @param h
     *
     * @return The roughness value.
     */
    private double roughen(double v, int l, int h) {
        return v + roughness * (double) (rand.nextGaussian() * (h - l));
    }

    /**
     * Generate the fractal map.
     *
     * @param xl
     * @param yl
     * @param xh
     * @param yh
     */
    private void generate(int xl, int yl, int xh, int yh) {
        int xm = (xl + xh) / 2;
        int ym = (yl + yh) / 2;
        if ((xl == xm) && (yl == ym)) return;

        grid[xm][yl] = 0.5 * (grid[xl][yl] + grid[xh][yl]);
        grid[xm][yh] = 0.5 * (grid[xl][yh] + grid[xh][yh]);
        grid[xl][ym] = 0.5 * (grid[xl][yl] + grid[xl][yh]);
        grid[xh][ym] = 0.5 * (grid[xh][yl] + grid[xh][yh]);

        double v = roughen(0.5 * (grid[xm][yl] + grid[xm][yh]), xl + yl, yh
                + xh);
        grid[xm][ym] = v;
        grid[xm][yl] = roughen(grid[xm][yl], xl, xh);
        grid[xm][yh] = roughen(grid[xm][yh], xl, xh);
        grid[xl][ym] = roughen(grid[xl][ym], yl, yh);
        grid[xh][ym] = roughen(grid[xh][ym], yl, yh);

        generate(xl, yl, xm, ym);
        generate(xm, yl, xh, ym);
        generate(xl, ym, xm, yh);
        generate(xm, ym, xh, yh);
    }

    /**
     * Get the grid.
     *
     * @return The grid.
     */
    public double[][] getGrid() {
        return this.grid;
    }
}
