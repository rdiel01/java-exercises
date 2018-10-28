package org.launchcode.java.exercises;

/*
ArrayList and Strings:
Write a static method to print out each word in a list that has exactly 5 letters.
 */

import java.util.ArrayList;

public class fivechar {
    public static void main(String [] args) {
        String[] words = {"candy","andy","blandy","shandy","randy","five","seven","doggy"};
        ArrayList<String> fivers = new ArrayList<String>();
        int count = 0;

        for (String i : words) {
            if (i.length() == 5) {
                count ++;
                fivers.add(i);
            }
        }
        System.out.println("There are "+count+" words that have 5 characters. They are"+fivers+".");
    }
}
