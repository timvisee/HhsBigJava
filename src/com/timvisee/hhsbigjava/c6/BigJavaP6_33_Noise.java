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
    private Random rand_;

    /**
     * Amount of roughness.
     */
    double roughness_;

    /**
     * Plasma fractal grid.
     */
    private double[][] grid_;

    /**
     * Generate a noise source based upon the midpoint displacement fractal.
     *
     * @param rand The random number generator
     * @param roughness a roughness parameter
     * @param width the width of the grid
     * @param height the height of the grid
     */
    public BigJavaP6_33_Noise(Random rand, double roughness, int width, int height) {
        roughness_ = roughness / width;
        grid_ = new double[width][height];
        rand_ = (rand == null) ? new Random() : rand;
    }

    /**
     * Initialise.
     */
    public void initialise() {
        int xh = grid_.length - 1;
        int yh = grid_[0].length - 1;

        // set the corner points
        grid_[0][0] = rand_.nextDouble() - 0.5;
        grid_[0][yh] = rand_.nextDouble() - 0.5;
        grid_[xh][0] = rand_.nextDouble() - 0.5;
        grid_[xh][yh] = rand_.nextDouble() - 0.5;

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
        return v + roughness_ * (double) (rand_.nextGaussian() * (h - l));
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

        grid_[xm][yl] = 0.5 * (grid_[xl][yl] + grid_[xh][yl]);
        grid_[xm][yh] = 0.5 * (grid_[xl][yh] + grid_[xh][yh]);
        grid_[xl][ym] = 0.5 * (grid_[xl][yl] + grid_[xl][yh]);
        grid_[xh][ym] = 0.5 * (grid_[xh][yl] + grid_[xh][yh]);

        double v = roughen(0.5 * (grid_[xm][yl] + grid_[xm][yh]), xl + yl, yh
                + xh);
        grid_[xm][ym] = v;
        grid_[xm][yl] = roughen(grid_[xm][yl], xl, xh);
        grid_[xm][yh] = roughen(grid_[xm][yh], xl, xh);
        grid_[xl][ym] = roughen(grid_[xl][ym], yl, yh);
        grid_[xh][ym] = roughen(grid_[xh][ym], yl, yh);

        generate(xl, yl, xm, ym);
        generate(xm, yl, xh, ym);
        generate(xl, ym, xm, yh);
        generate(xm, ym, xh, yh);
    }
}
