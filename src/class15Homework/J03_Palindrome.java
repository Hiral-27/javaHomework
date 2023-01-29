package class15Homework;

public class J03_Palindrome {
    /*
    Task 3:
    Create a method that will print whether given String is palindrome or not.
     */

    boolean palindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        if(word.equals(stringBuilder.reverse().toString())){
            return true;
        }else{
            return  false;
        }
    }
}

class J03PalindromeTester{
    public static void main(String[] args) {
        J03_Palindrome palindrome= new J03_Palindrome();
        boolean isPalindrome= palindrome.palindrome("malayalam");
        System.out.println("Is the word Palindrome: "+isPalindrome);
    }
}