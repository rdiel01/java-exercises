package excercises;

/*
Numeric types:
    Write a program that asks a user for the number of miles they have driven and the amount of gas
    they've consumed (in gallons), and print their miles-per-gallon.
 */
import java.util.Scanner;

public class mpg {
    public static void main(String[] args) {
        Double gas;
        Double miles;
        Double mpg;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Let's figure out your gas mileage!");
        System.out.println("How many miles did you drive today?");

        miles = in.nextDouble();

        in = new Scanner(System.in);
        System.out.println("How much gas did you consume in the last " + miles + " miles?");

        gas = in.nextDouble();

        mpg = miles/gas;

        System.out.println("Your current miles per gallon is " + mpg + ".");
    }
}
