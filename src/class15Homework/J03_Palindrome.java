package class15Homework;

public class J03_Palindrome {
    /*
    Task 3:
    Create a method that will print whether given String is palindrome or not.
     */

    // You can use Boolean & Void both Method are correct

    // Method 1: Boolean
    boolean palindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        if(word.equals(stringBuilder.reverse().toString())){
            return true;
        }else{
            return  false;
        }
    }

//--------------------------------------------------------------------------------------------

    // Method 2:  Void
    void isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversed= sb.toString();
        if (str.equals(reversed)) {
            System.out.println(str+" is Palindrome");
         } else{
            System.out.println(str+" is Not Palindrome");
        }

    }
}

class J03PalindromeTester{
    public static void main(String[] args) {
        J03_Palindrome palindrome= new J03_Palindrome();

        // Method 1: Boolean
        boolean isPalindrome= palindrome.palindrome("malayalam");
        System.out.println("Is the word Palindrome: "+isPalindrome);


//-----------------------------------------------------------------------------------

        // Method 2: Void
        palindrome.isPalindrome("radar");

    }
}