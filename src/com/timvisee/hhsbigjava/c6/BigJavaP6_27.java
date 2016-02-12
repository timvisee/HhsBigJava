/**
 * BigJava P6.27 challenge:
 * Write a method
 * public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
 * that merges two array lists, alternating elements from both array lists. If one array list is shorter than the other,
 * then alternate as long as you can and then append the remaining elements from the longer array list.
 * For example, if a is
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
        // Create two lists to put the predefined values in
        List<Integer> a = new ArrayList<Integer>(){{
            add(1);
            add(4);
            add(9);
            add(16);
        }};
        List<Integer> b = new ArrayList<Integer>(){{
            add(9);
            add(7);
            add(4);
            add(9);
            add(11);
        }};

        // Merge both lists
        List<Integer> merged = merge(a, b);
    }

    /**
     * Merge two lists, alternating one by one between the a and b list.
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

        // Loop through both lists to add items one by one
        for(int i = 0; i < size; i++) {
            // Add the corresponding integer from a to the merged list if it exists
            if(i <= a.size() - 1)
                merged.add(a.get(i));

            // Add the corresponding integer from a to the merged list if it exists
            if(i <= b.size() - 1)
                merged.add(b.get(i));
        }

        // Return the merged list
        return merged;
    }
}
