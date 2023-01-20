package class5Homework;

import java.util.Scanner;

public class J_06_Task06_NestedIf {
    public static void main(String[] args) {
        /*
        Task 6-
        Write a program to find largest number among three numbers using nested if provided by a
        user (numbers must be distinct)
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter First Value: ");
        int firstNumber= input.nextInt();
        System.out.println("Enter Second Value: ");
        int secondNumber= input.nextInt();
        System.out.println("Enter Third Value: ");
        int thirdNumber= input.nextInt();

        if(firstNumber>secondNumber){
            if(firstNumber>thirdNumber){
                System.out.println(firstNumber+" is the Largest Number");
            }
        }else if (secondNumber>thirdNumber) {
            System.out.println(secondNumber+" is the Largest Number");
        }else {
            System.out.println(thirdNumber+" is the Largest Number");
        }

        input.close();

    }
}
