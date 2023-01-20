package class5Homework;

import java.util.Scanner;

public class J_03_Task03_LogicalOperators {
    public static void main(String[] args) {
        /*
        Task 3-
        3) Write a program that will read three inputs of scores (quiz, mid term, and final scores) and
        determine the grade based on the following rules:
       if the average score >=90 → grade=A
       if the average score >= 70 and <90 → grade=B
     if the average score>=50 and <70 → grade=C
       if the average score<50 → grade=F
         */
        // Task 3-
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your quiz score: ");
        double quiz= input.nextDouble();
        System.out.print("Enter your mid- term score: ");
        double midTerm= input.nextDouble();
        System.out.print("Enter your Final score: ");
        double finalScore= input.nextDouble();

        double score= quiz+ midTerm+ finalScore;
        double averageScore= score/300 *100;
        System.out.println("The Average score is "+averageScore);

        if(averageScore>=90){
            System.out.println("Grade A");
        } else if (averageScore>=70 && averageScore<90) {
            System.out.println("Grade B");
        } else if (averageScore>=50 && averageScore<70) {
            System.out.println("Grade C");
        }else if(averageScore<50){
            System.out.println("Grade F");
        }

        input.close();
    }
}
