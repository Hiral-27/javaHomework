package class4Homework;

import java.util.Scanner;

public class ScannerTask_04 {
    public static void main(String[] args) {
        /*
        Task 4:
        You are DMV representative and you need to ask customer their age. If they are 18 and older you will issue
        a driver licence to them, otherwise you will offer them to get a learners permit.
         */
        Scanner ageInput= new Scanner(System.in);
        System.out.println("Eligible Age for Driver Licence");
        System.out.println("Enter you age: ");
        int age= ageInput.nextInt();
        if(age>=18){
            System.out.println("Your age is "+age+". You are eligible for Driver License.");
        }else {
            System.out.println("Your age is "+age+". You get a Learners permit.");
        }

        ageInput.close();


    }
}
