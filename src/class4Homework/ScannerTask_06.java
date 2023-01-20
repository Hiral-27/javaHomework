package class4Homework;

import java.util.Scanner;

public class ScannerTask_06 {
    public static void main(String[] args) {
        /*
        Task 6:
        Create a Java program that will ask if user has a credit card or not.
        If you user does not have a credit card then offer them.
        If they do have one ask what is balance on the card?
        If balance of the card is larger than 1000, tell them to pay off immediately,
        otherwise you can tell them that they can spend more.
         */
        Scanner cardInput= new Scanner(System.in);

        System.out.println("Do you have a Credit card? ");
        String card= cardInput.nextLine();

        if(card.equals("no")){
            System.out.println("Would like to have a credit card?");
        } else {
            if(card.equals("yes")) {
                System.out.println("What is the balance of your credit card? ");
                int balance= cardInput.nextInt();
            if(balance>1000){
                System.out.println("Kindly pay off your credit card debt immediately.");
            }else{
                System.out.println("Kindly Shop more");
            }
            }
        }

        cardInput.close();
    }
}
