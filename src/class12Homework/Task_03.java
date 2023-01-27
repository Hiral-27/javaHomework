package class12Homework;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        /*
        Task 3:
        Write a program that reads two people's first names and if they expecting boy or girl?
        Based on the input suggests a name for a baby:
            Example Output:                            Example Output:
            Mom’s first name? Mary                     Mom’s first name? Mary
            Dad’s first name? Daniel                   Dad’s first name? Daniel
            Boy or Girl? boy                           Boy or Girl? girl
            Suggested baby name: DANRY                 Suggested baby name: MAIEL
         */

        Scanner input= new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            System.out.println("Mom's first name? ");
            String momFirstName = input.next();

            System.out.println("Dad's first name? ");
            String dadFirstName = input.next();

            System.out.println("Boy or Girl? ");
            String babyName = input.next();

            String suggestedName;

            if (babyName.equalsIgnoreCase("Boy")) {
            //    suggestedName = dadFirstName.substring(0, 3) + momFirstName.substring(2);
                suggestedName = dadFirstName.substring(0, dadFirstName.length()/2) + momFirstName.substring(momFirstName.length()/2);
                System.out.println(suggestedName.toUpperCase());
            } else if (babyName.equalsIgnoreCase("Girl")) {
              //  suggestedName = momFirstName.substring(0, 2) + dadFirstName.substring(3);
                suggestedName = momFirstName.substring(0, momFirstName.length()/2) + dadFirstName.substring(dadFirstName.length()/2);
                System.out.println(suggestedName.toUpperCase());
            }
        }

    }
}
