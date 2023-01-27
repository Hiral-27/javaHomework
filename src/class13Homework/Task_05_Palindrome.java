package class13Homework;

public class Task_05_Palindrome {
    public static void main(String[] args) {
        /*
        Task 5-
        How would you check if String is palindrome or not? aba=> true
        Abbc =>false
         */

        String str= "malayalam";
        String reverse= "";
        for (int i = str.length()-1; i>=0 ;i--) {
            reverse= reverse+str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println(str+ " is a Palindrome");
        }else{
            System.out.println(str+ " is not a Palindrome");
        }

    }
}
