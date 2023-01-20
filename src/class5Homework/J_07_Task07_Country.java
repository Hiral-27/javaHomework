package class5Homework;

import java.util.Scanner;

public class J_07_Task07_Country {
    public static void main(String[] args) {
/*
      Task 7-
      Ask user to enter their country and capture it. Once values are captured print which language user speaks.

 */
      Scanner input= new Scanner(System.in);
        System.out.println("Enter the country: ");
        String country= input.next();

       switch (country){
           case "India":
           case "india":
               System.out.println("You are from "+country+" and you have selected Hindi as the Language");
               break;

           case "USA":
           case "usa":
               System.out.println("You are from "+country+" and you have selected English as the Language");
               break;

           case "Portugal":
           case "portugal":
               System.out.println("You are from "+country+" and you have selected Portuguese as the Language");
               break;

           case "Afghanistan":
           case "afghanistan":
               System.out.println("You are from "+country+" and you have selected Pashto as the Language");
               break;

           case "Turkey":
           case "turkey":
               System.out.println("You are from "+country+" and you have selected Turkish as the Language");
               break;

           default:
               System.out.println("Invalid");
       }



    }
}
