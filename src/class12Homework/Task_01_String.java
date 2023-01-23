package class12Homework;

import java.sql.SQLOutput;

public class Task_01_String {
    /*
    Task 1:
    Create a String and if the String is not empty perform the following:
    if the String has an odd number of characters and has 3 or more characters, print the character in the middle
    of the String.
    For Example String str=hello =>l
     */
    public static void main(String[] args) {
        /*
        Task 1:
        Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters, print the character in the middle
        of the String.
        For Example String str=hello =>l
         */

        String string = "Hiral";

        // Method 1
        if (!string.isEmpty()) {
            System.out.println(string.charAt(2));
        }

        // Method 2
        int l = string.length();
        if (!string.isEmpty()){
            if (l % 2 != 0) {
                int charMiddle = (l / 2);
                System.out.println(string.charAt(charMiddle));
            }
         }

    }
}
