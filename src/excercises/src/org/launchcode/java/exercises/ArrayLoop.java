package org.launchcode.java.exercises;

/*
 Arrays: Create and initialize an array with the following values in a single line:
 1, 1, 2, 3, 5, 8. Then loop through the array and print out each value.
 */

import java.util.ArrayList;

public class ArrayLoop {
    public static void main(String [] args){

        int maxArray = 6;
        Integer[] numbers = new Integer[maxArray];

        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 5;
        numbers[5] = 8;

        for ( int num : numbers) {
            System.out.println(num);
        }

    }
}
