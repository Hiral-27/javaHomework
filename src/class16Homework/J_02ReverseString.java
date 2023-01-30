package class16Homework;

public class J_02ReverseString {
    /*
    Task 2:
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */

    public static String reverseString(String word) {
        boolean str;
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        String reverse = stringBuilder.toString();
        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("Original String: " + word);
            System.out.println("Reversed String: " + reverse);
        } else {
            System.out.println("Invalid");
        }
        return reverse;
    }

}
    class J_02ReversedStringTester{
        public static void main(String[] args) {

            J_02ReverseString.reverseString("Malayalam");


        }
    }

