package excercises;

/*
Numeric types:
    Write a program to calculate the area of a rectangle and print the answer to the console. You
    should prompt the user for the dimensions. (What data types should the dimensions be?)
 */

public class Rect_area {
    public static void main(String[] args) {

        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Let's find the area of your rectangle!");
        System.out.println("Please enter the length of the first side.");
        Integer side_1 = in.nextInt();
        System.out.println("Please enter the length of the second side.");
        Integer side_2 = in.nextInt();
        System.out.println("Your rectangle is " + side_1 + " by " + side_2 + " and has an area of " +
                side_1*side_2 + " square units.");
    }
}