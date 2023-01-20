package class4Homework;

public class IfElse_Task01 {
    public static void main(String[] args) {
        /*
         Task 1:
         Write a program to store a boolean value of whether user has diploma or not. If user has a diploma,
         you should say congratulations, otherwise program should suggest to get a degree.
         Then if user has a degree program should check a gpa score. If gpa score is higher or equals to 3.5 →
         output should say “You are eligible for scholarship”, otherwise → “You should have studied harder” .
         */

        boolean diploma= true;
        double gpa= 2.5;
        if(diploma){
            System.out.println("Congratulations for Diploma");
            if(gpa>=3.5){
                System.out.println("Your gpa is "+gpa+" You are eligible for scholarship");
            } else {
                System.out.println("Your gpa is low it's "+gpa+" Study Harder");
            }
        }else{
            System.out.println("Get a Degree");
        }




    }
}
