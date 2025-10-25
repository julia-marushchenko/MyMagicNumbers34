/*
 *Java program to find numbers can be divided by 3
 */

package com.numbers;
/*
 * Main class
 */
public class Main {

    /*
     * Main method to run java program
     */
    public static void main(String[] args) {

        // Creating an array with numbers
        int arr [] = {21, 34, 18, 56, 98, 31, 26, 68, 99, 23, 101, 19, 22};

        // Iterating through array
        for (int index = 0; index < arr.length; index++) {

            // Saving number value
            int number = arr[index];

            // Checking if numbers are dividable by 3
            if (number % 3 == 0) {

                // Printing the result to console
                System.out.println(number + " is dividable by 3.");

            } else {

                // Printing the result to console
                System.out.println(number + " is not  dividable by 3.");

            }
        }
    }
}