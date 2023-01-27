package class13Homework;

public class Task_04_ReverseString {
    public static void main(String[] args) {
        /*
        Task 4:
        How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
         */


        // Method 1: String Class using "forEach Loop"
        String str= "This is sentence i want to reverse";
        String[] arr= str.split(" ");
        System.out.println(arr);
        for (String word: arr) {
            for (int i = word.length()-1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        //    System.out.println(word.length());
         //   System.out.println(word.length()-1);
        }

        System.out.println();

//-----------------------------------------------------------------------------

        // Method 2: String Builder Class
        for(String word1:arr){
            StringBuilder st=new StringBuilder(word1);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");
        }
        System.out.println();

//-----------------------------------------------------------------------------

        // Method 3: Method Chaining- using 2/ 3 methods on the same line
        for (String word2: arr) {
            System.out.print(new StringBuilder(word2).reverse()+" ");
        }

    }
}
