package org.launchcode.java.exercises;

/*
    ArrayList:
    Write a static method to find the sum of all the even numbers in a list.
    Within main, create a list with at least 10 integers and call your method on the list.
 */

public class Even_sum {

    public static void main(String [] args) {
        int[] numList = {2,1,3};
        int sum = 0;

        for(int i : numList) {
            if ( i%2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
