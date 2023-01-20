package class4Homework;

import java.util.Scanner;

public class ScannerTask_03 {
    public static void main(String[] args) {
        /*
        Task 3:
         You are a loan specialist and you need to ask user what is the amount of loan is needed.
         If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
        */

        Scanner loanInput= new Scanner(System.in);
        System.out.println("Loan Eligibility Check");
        System.out.println("Enter your required loan amount: ");

        int loanAmount= loanInput.nextInt();
        if(loanAmount<=200000){
            System.out.println("Your required loan amount is: "+loanAmount+". You are eligible for the loan.");
        }else {
            System.out.println("Your required loan amount is: "+loanAmount+". You are Not eligible for the loan.");
        }

        loanInput.close();
    }
}
