package class13Homework;

public class Task_06_StringSwapping {
    public static void main(String[] args) {
        /*
        Task 6-
        How would you swap  2 strings without a temporary variable?
         */
        String str1= "Java";
        String str2= "Python";

       str1= str1+str2;
        System.out.println(str1.length()); // JavaPython= 10
        System.out.println(str2.length()); // Python= 6
       str2= str1.substring(0,str1.length()- str2.length());  // str2 10-6 = 4
       str1= str1.substring(str2.length()); // str1 6

        System.out.println("String str1= "+str1);
        System.out.println("String str2= "+str2);

    }
}
