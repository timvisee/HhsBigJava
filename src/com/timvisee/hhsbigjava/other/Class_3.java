/**
 * Class 3.
 *
 * Challenge:
 * Create an array with some names.
 * Put all names with a length of less than 4 or greater than 6 in a new array.
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class.
 */
public class Class_3 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create an array with some names
        String[] names = {"FirstName", "SecondName", "ThirdName", "FourthName"};
        List<String> niceNames = new ArrayList<>();

        // Loop through all names, and put the nice names in the list
        for(String n : names)
            if(n.length() < 4 || n.length() > 6)
                niceNames.add(n);

        // Convert the list of nice names into an array (because that's what the challenge asks)
        String[] niceNamesArr = niceNames.toArray(new String[niceNames.size()]);
    }
}
