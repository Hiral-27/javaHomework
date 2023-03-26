package class33Homework;

import java.util.Scanner;

/*
Task 03-
Create a method to check age eligibility that will throw a runtime exception. Method should throw
an exception age is less than 16.
 */
public class Task03 {
    public void eligibility(int age){
        if(age<16){
            throw new RuntimeException ("Your age is "+age+" years. You are NOT Eligible");
        } else{
            System.out.println("Your age is "+age+" years. You are Eligible");
        }
    }
    public static void main(String[] args) {
        Task03 obj= new Task03();

        obj.eligibility(11);
    }

}
