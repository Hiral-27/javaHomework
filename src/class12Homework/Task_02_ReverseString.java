package class12Homework;

public class Task_02_ReverseString {
    public static void main(String[] args) {
        /*
        Task 2:
         Create a String and print it in reverse order (Sunday → yadnuS).
         */
        StringBuilder sb = new StringBuilder();
        String string= "Sunday";
        sb.append(string);
        sb.reverse();
        System.out.println(sb);

    }
}
