package class5Homework;

import java.util.Scanner;

public class J_04_Task04_LogicalOperators {
    public static void main(String[] args) {
        /*
        Task 4-
        Write a program for user to enter his/hers birth month. Based on the month define the season.
        Example: if user is born in June, July or August → season =”Summer”.
        At the end of the program we should see output as “You were born __”
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your birth month: ");
        String month= input.next();
        if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")){
            System.out.println("You were born in Winter Season");
        }else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")){
            System.out.println("You were born in Spring Season");
        } else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
            System.out.println("You were born in Summer Season");
        }else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")){
            System.out.println("You were born in Autumn son");
        }else {
            System.out.println("Invalid Month");
        }

        input.close();

    }
}
