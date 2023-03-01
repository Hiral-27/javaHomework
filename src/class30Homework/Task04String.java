package class30Homework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Task 4-
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
 */
public class Task04String {
    public static void main(String[] args) {

        Set<String> str= new LinkedHashSet<>();
        str.add("I");
        str.add("love");
        str.add("Java");

        for (String s : str) {
            System.out.print(s + " ");
        }
    }

}
