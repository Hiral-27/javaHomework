package class5Homework;

import java.util.Scanner;

public class J_05_Task05_LogicalOperators {
    public static void main(String[] args) {
        /*
        Task 5-
        Write a program to find largest of three double values
        using if-else..if and logical operators provided by a user (numbers must be distinct)
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter First Value: ");
        double firstNumber= input.nextDouble();
        System.out.println("Enter Second Value: ");
        double secondNumber= input.nextDouble();
        System.out.println("Enter Third Value: ");
        double thirdNumber= input.nextDouble();

        if(firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println(firstNumber+" is the Largest Number.");
        } else if (secondNumber>thirdNumber) {
            System.out.println(secondNumber+" is the Largest Number");
        } else  {
            System.out.println(thirdNumber+" is the Largest Number");
        }
    }
}
