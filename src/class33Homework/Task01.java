package class33Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Task 01-
1) How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value
then programmer expected.
 */
public class Task01 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        try{
            System.out.println("Enter a value: ");
            int number= input.nextInt();
                System.out.println(number+" is an Integer.");
        } catch (InputMismatchException ie){
            System.out.println("Enter valid Integer.");
        }
    }
}
