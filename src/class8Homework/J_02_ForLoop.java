package class8Homework;

import java.util.Scanner;

public class J_02_ForLoop {
    public static void main(String[] args) {
        /*
          Create a program that will be asking user to apply for a credit card 10 times.
          As soon you get an “yes” from a user program should stop asking.
         */
        Scanner input = new Scanner(System.in);
        String answer;

        System.out.println("Method 1: While Loop");
        // Method 1: While Loop
 /*       int i=1;
        while(i<=10){
            System.out.println("Do you want a credit card?"+(i));
            answer= input.next();
            if(answer.equalsIgnoreCase("yes")){
                break;
            }else if(!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")){
                System.out.println("Invalid Input");
            }else{
                System.out.println("Continue");
            }
            i++;
        }
        System.out.println(); */
//-------------------------------------------------------------------------------------------------------------------

        // Method 2: For Loop
        System.out.println("Method 2: For Loop");
        for(int j=1; j<=10; j++) {
            System.out.println("Do you want a credit card?" + (j));
            answer = input.next();
            if(answer.equalsIgnoreCase("yes")){
                break;
            }else if(!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")){
                System.out.println("Invalid input");
                break;
            } else {
                System.out.println("Continue");
            }
            System.out.println();
        }
    }
}
