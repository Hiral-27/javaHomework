package class5Homework;

import java.util.Scanner;

public class J_02_Task02_LogicalOperators {
    public static void main(String[] args) {
        /*
        Task 2-
        Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output
        “It is a weekday”, anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day from 1 - 5:");
        int day= input.nextInt();

 /*       if(day>=1 && day<=5){
            System.out.println("It is a Weekday");
        } else if (day==6 || day==7) {
            System.out.println("It is a Weekend");
        }else{
            System.out.println("Invalid input");
        }
        */

        // Task 2-
        switch(day){
            case 1:
                System.out.println("It is a Weekday");
                break;
            case 2:
                System.out.println("It is a Weekday");
                break;
            case 3:
                System.out.println("It is a Weekday");
                break;
            case 4:
                System.out.println("It is a Weekday");
                break;
            case 5:
                System.out.println("It is a Weekday");
                break;
            case 6:
                System.out.println("It is a Weekend");
                break;
            case 7:
                System.out.println("It is a Weekend");
                break;
            default:
                System.out.println("Invalid");
        }

        input.close();
    }
}
