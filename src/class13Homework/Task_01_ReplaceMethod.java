package class13Homework;

public class Task_01_ReplaceMethod {
    public static void main(String[] args) {
        /*
        Task 1:
        Create a String that will hold a sentence. Write a program to get a new String without any spaces.
         */

        String str= "Java is love";
        String newStr= str.replaceAll(" ","");
        System.out.println(newStr);

    }
}
