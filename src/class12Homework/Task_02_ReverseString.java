package class12Homework;

public class Task_02_ReverseString {
    public static void main(String[] args) {
        /*
        Task 2:
         Create a String and print it in reverse order (Sunday → yadnuS).
         */

        // Method 1:
        System.out.println("Method 1:");
        StringBuilder sb = new StringBuilder();
        String string= "Sunday";
        sb.append(string);
        sb.reverse();
        System.out.println(sb);

        System.out.println("****************************");

        // Method 2:
        System.out.println("Method2:");
        String day= "Sunday";
        String reverse= "";
        for (int i = 0; i < day.length(); i++) {
            reverse= day.charAt(i)+reverse;
        }
        System.out.println(reverse);

        //When length()-1 is used, it returns the last index of the string. In other words, it returns the number of
        // characters in the string minus 1.
        //Method 3:
        for (int i = day.length()-1; i > 0 ; i++) {
            System.out.println(day);
        }


    }
}
