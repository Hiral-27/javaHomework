package class5Homework;

import java.util.Scanner;

public class J_08_Task08_Calculator {
    public static void main(String[] args) {
        /*
        Task 8-
        HomeWork: Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
        Based on operator provide the result to user.
         */

        Scanner input= new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1 = input.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = input.nextDouble();
        System.out.print("Enter the operator (+ - * /): ");
        char operator = input.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition value: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction value: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication value: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Division value: " + result);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

    }
}
