package class9Homework;

public class J_01_Array_Grades {
    public static void main(String[] args) {
        /*
     Task 1:
     Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
         */
        // Method 1:
        System.out.println("Method 1: Creating an empty array");
        char[] grade= new char[6];
        grade[0]= 'A';
        grade[1]= 'B';
        grade[2]= 'C';
        grade[3]= 'D';
        grade[4]= 'E';
        grade[5]= 'F';
            System.out.println("Grade: "+grade[1]);

        System.out.println("*************");

        // Method 2:
        System.out.println("Method 2: ");
        char [] grades={'A','B','C','D','E','F'};
        System.out.println("Grade: "+grades[1]);


    }
}
