package class5Homework;

import java.util.Scanner;

public class J_07B_Task_Grade {
    public static void main(String[] args) {
        /*
        Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
        any other grade --> Not Acceptable. At the end your program should print which grade was entered by
        a user with explanation.
         */

        Scanner input= new Scanner(System.in);
        System.out.println("What is your Grade: ");
        char grade= input.next().charAt(0);

        switch (grade){
            case 'A':
                System.out.println("Grade "+grade+" Excellent");
                break;
            case 'B':
                System.out.println("Grade "+grade+" Good");
                break;
            case 'C':
                System.out.println("Grade "+grade+" Average");
                break;
            case 'D':
                System.out.println("Grade "+grade+" Bad");
                break;
            default:
                System.out.println("Grade Not Acceptable");

        }

    }
}
