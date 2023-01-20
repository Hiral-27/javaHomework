package class4Homework;

import java.util.Scanner;

public class ScannerTask_07 {
    public static void main(String[] args) {
        /*
        Task 7:
        Write a program to ask user to enter numbers of worked years and annual salary.
        If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not.
        Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Number of worked years: ");
        int yearsWorked= input.nextInt();
        if(yearsWorked>=5){
            System.out.println("You are eligible for the Bonus.");
            System.out.println("What is your current salary?");
            int salary= input.nextInt();
            if(salary>50000){
                System.out.println("Your Bonus= 5000");
            }else{
                System.out.println("Your Bonus= 3000");
            }
        } else{
            System.out.println("You are Not eligible for the Bonus.");
        }

        input.close();





    }
}
