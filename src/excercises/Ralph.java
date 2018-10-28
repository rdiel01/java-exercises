package excercises;
/*
Input/output:
    Modify your "Hello, World" program to prompt the user for their name, and greet them by name.
 */

public class Ralph {
    public static void main(String[] args) {

        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Please enter your name.");
        String name = in.next();
        System.out.println("Hello, " + name);
    }
}