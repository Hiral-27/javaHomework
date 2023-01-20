package class2Homework;

public class VariableStudentInfo {
    public static void main(String[] args) {
        /*
        TASK 3
    a)   Create a Java program and name it Variables
         In your program create different type of variables to store student’s information and
         then print value of those variables:
         name
         lastName
         grade
         city
         state
         phoneNumber
         */
        String name= "Selena";
        String lastName= "Gomez";
        char grade= 'A';
        String city= "Grand Prairie";
        String state= "Texas";
        String phoneNumber= "+1(210)404-2389";
        System.out.println("First name= "+name);
        System.out.println("Last name= "+lastName);
        System.out.println("Grade= "+grade);
        System.out.println("City= "+city);
        System.out.println("State= "+state);
        System.out.println("Phone Number= "+phoneNumber);
     // b) Change student’s city, state, phone number and grade. And print those updated values.
        city= "Los Angeles";
        state= "California";
        phoneNumber= "+1(310)123-4567";
        grade= 'B';
        System.out.println("Re-assign City= "+ city);
        System.out.println("Re-assign State= "+ state);
        System.out.println("Re-assign Phone Number= "+ phoneNumber);
        System.out.println("Re-assign Grade= "+ grade);




    }
}
