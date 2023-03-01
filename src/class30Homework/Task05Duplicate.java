package class30Homework;

import java.util.LinkedList;
import java.util.List;

/*
Task 5-
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
public class Task05Duplicate {
    public static void main(String[] args) {
        List<Integer> intList= new LinkedList<>();
        intList.add(10);
        intList.add(40);
        intList.add(20);
        intList.add(40);
        intList.add(80);
        intList.add(20);

        int sum= 0;
        for (Integer number: intList){
            sum+= number;
        }
        System.out.println("Sum of all integers: "+sum);
    }
}
