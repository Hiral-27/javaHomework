package class8Homework;

import java.util.Scanner;

public class J_03_SumOfEvenOdd {
    public static void main(String[] args) {
        /*
        Task 3:
        Write a program that reads a range of integers (start and end point), provided by a user and then from
        that range prints the sum of the even and odd integers.
         */

        Scanner input=new Scanner(System.in);

            System.out.println("Enter start number: ");
            int start = input.nextInt();
            System.out.println("Enter end number: ");
            int end = input.nextInt();

            int evenSum= 0;
            int oddSum= 0;
        int evenSum1= 0;
        int oddSum1= 0;
            if(start>=end){
                for(int j=end; j>=start; j--){
                    System.out.println(j);
                   if(j%2==0){
                       evenSum1+= j;   // add all even numbers present in range
                   } else {
                       //  System.out.println(i+" is an Odd number");
                       oddSum1= oddSum+j;   // add all odd numbers present in range
                   }
                }
                System.out.println(evenSum1);
                System.out.println(oddSum1);
            }else {
                for (int i = start; i <= end; i++) {
                    if (i % 2 == 0) {
                        //   System.out.println(i+" is an Even number");
                        evenSum += i;   // add all even numbers present in range
                    } else {
                        //  System.out.println(i+" is an Odd number");
                        oddSum = oddSum + i;   // add all odd numbers present in range
                    }
                }
            }
        System.out.println("Sum of all Even numbers "+evenSum);
        System.out.println("Sum of all Odd numbers "+oddSum);
    }
}
