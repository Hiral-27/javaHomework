package class8Homework;

import java.util.Scanner;

public class J_04_Shopping {
    public static void main(String[] args) {
        /*
        4) Write a program to ask a user to enter item they want to buy and the price of that item. User will be
       entering 5 items. Every time user enters money accumulate the price and tell the user how much total they should pay.
        If user give more money program should return a change. Whenever a user done with payments program
        should say "Thank you for shopping!"
         */
        /*
        Steps to solve the above question
         */
        Scanner input= new Scanner(System.in);
        double totalPrice=0;
        for(int i=0; i<3; i++) {
            System.out.println("Please enter the item and it's price");
            String itemName= input.next();
            double itemPrice = input.nextDouble();
            totalPrice= totalPrice+ itemPrice;
            System.out.println("This is the total amount that you have to pay "+totalPrice);
        }
        System.out.println("Please pay for the items");
        double amountPaid= input.nextDouble();

        if(amountPaid>totalPrice){
            double change= amountPaid - totalPrice;
            System.out.println("Hey here is your change "+change);
        } else if (amountPaid<totalPrice) {
            System.out.println("You can't buy all the items");
        }else{
            System.out.println("Thank you for shopping!");
        }
    }
}
