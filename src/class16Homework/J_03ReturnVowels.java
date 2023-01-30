package class16Homework;
import java.util.Scanner;
public class J_03ReturnVowels {
    /*
    Task 3:
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
     */

    private String vowels(String str) {
        String newStr= str.replaceAll("[^aeiouAEIOU]", "");
        return newStr;
    }

    public static void main(String[] args) {
        J_03ReturnVowels method= new J_03ReturnVowels();
        System.out.println(method.vowels("AlphaNumeric"));

    }

}
