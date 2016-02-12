/**
 * BigJava P6.27 challenge:
 * Write a method
 * public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
 * that merges two array lists, alternating elements from both array lists. If one array list is shorter than the other, then alternate as long as you can and then append the
 * remaining elements from the longer array list. For example, if a is
 * 1 4 9 16
 * and b is
 * 9 7 4 9 11
 * then merge returns the array list
 * 1 9 4 7 9 4 16 9 11
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.c6;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class.
 */
public class BigJavaP6_27 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {

    }

    /**
     * Merge two lists, one by one
     *
     * @param a The first list.
     * @param b The second list.
     *
     * @return The new, merged list
     */
    public static List<Integer> merge(List<Integer> a, List<Integer> b) {
        // Determine the size of the biggest list
        int size = Math.max(a.size(), b.size());

        // Create a new array list
        List<Integer> merged = new ArrayList<>();

        // Loop through both the lists
        for(int i = 0; i < size; i++) {
            // Add the value of the first list to the merged list if it's available
            if(i <= a.size() - 1)
                merged.add(a.get(i));

            // Add the value of the second list to the merged list if it's available
            if(i <= b.size() - 1)
                merged.add(b.get(i));
        }

        // Return the merged list
        return merged;
    }
}
