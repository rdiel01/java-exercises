package org.launchcode.java.exercises;

/*
 HashMap: Make a program similar to GradebookHashMap, but which takes in students names and ID numbers (as integers) instead of names
 and grades. In this case, however, the keys should be integers (the IDs) and the values should be strings (the names). Modify the roster printing code accordingly.

 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class StudentRoster {

    public static void main( String [] args) {

        HashMap<Integer, String> roster = new HashMap();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish)");

        do {

            System.out.println("Student name:");
            newStudent = in.nextLine();

            if ( !newStudent.equals("")) {
                System.out.println(newStudent+" ID:");
                Integer id = in.nextInt();
                roster.put(id,newStudent);

                in.nextLine();
        }

    } while(!newStudent.equals(""));

        System.out.println("Class Roster:");

        for (Map.Entry<Integer,String> student : roster.entrySet()) {
            System.out.println(student.getKey() + "__" + student.getValue());
        }
        }

}
