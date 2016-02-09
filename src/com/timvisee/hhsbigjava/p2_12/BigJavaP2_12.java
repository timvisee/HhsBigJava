/**
 * BigJava P2.12 challenge:
 * File names and extensions. Write a program that prompts the user for the drive letter (C),
 * the path (\Windows\System), the file name (Readme), and the extension (txt). Then print the complete file name
 * C:\Windows\System\Readme.txt. (If you use UNIX or a Macintosh, skip the drive name and use / instead of \ to separate
 * directories.)
 *
 * @author Tim Visee
 * @website www.timvisee.com
 */

package com.timvisee.hhsbigjava.p2_12;

import java.io.File;
import java.util.Scanner;

/**
 * Main class.
 */
public class BigJavaP2_12 {

    /**
     * Main method, called on start.
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {
        // Create a scanner instance for user input
        Scanner in = new Scanner(System.in);

        // Get the separator character
        char separator = File.separatorChar;

        // Prompt the user for the drive letter
        System.out.println("Enter a drive letter:");
        String driveLetter = in.next().toUpperCase() + ":" + separator;

        // Prompt the user for the path
        System.out.println("Enter a path");
        String path = in.next().replace('/', separator).replace('\\', separator);

        // Prompt the user for a file name
        System.out.println("Enter a file name:");
        String fileName = in.next();

        // Prompt the user for a file extension
        System.out.println("Enter a file extension:");
        String fileExt = "." + in.next();

        // Print the file path
        System.out.println("Absolute path: " + driveLetter + path + fileName + fileExt);
    }
}
