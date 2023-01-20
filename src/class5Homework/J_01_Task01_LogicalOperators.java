package class5Homework;

import java.util.Scanner;

public class J_01_Task01_LogicalOperators {
    public static void main(String[] args) {
        /*
        Task 1:
        1) Prompt the user to enter person heights in inches. Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)
         */

         // Task 1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height: ");
        int height= input.nextInt();

        if(height<60){
            System.out.println("short");
        } else if (height>=60 && height<72) {
            System.out.println("Medium");
        }else if(height>=72){
            System.out.println("Tall");
        }else {
            System.out.println("Invalid input");
        }

        input.close();
    }
}
