package class13Homework;

public class Task_03_ReplaceMethod {
    public static void main(String[] args) {
        /*
        Task 3:
        You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out
         how many sentences are in that String?
         */

        String a= "Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] arr= a.split("[?]");
        System.out.println("There are total "+arr.length+" sentences in that String");

        // Method 2:
        System.out.println("There are total "+a.split("[?]").length+" sentences present in                                                                          side the String");
    }
}
