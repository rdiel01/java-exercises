package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args)  {
        double pi = 3.14159;
        double radius;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Lets find the area of your circle.");
        System.out.println("What is the radius of your circle?");
        radius = in.nextDouble();

        do {
            System.out.println("Your circle has a radius of " + radius + " units! That is impossible or you are a witch.");
            System.out.println("Let's try this again. What is the radius of your circle?");
            radius = in.nextDouble();
        }   while (radius < 0);

        System.out.println("Your circle with a "+ radius +
                " unit radius has an area of "+ (pi * (radius * radius)) +" square units.");

    }
}
