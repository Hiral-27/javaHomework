package class28Homework;

import java.util.ArrayList;

public class Task05 {
    /*
    Task 05:
    Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
     */
    public static void main(String[] args) {
        ArrayList <Integer> evenNumbers= new ArrayList<>();
        for (int i = 1; i <=500; i++) {
            if(i%2==0){
                evenNumbers.add(i);
            }
        }
        System.out.println("Even Numbers 1 to 500: "+evenNumbers);

        // use removeIf() method

        System.out.println("Numbers that are not divisible by 5: ");
        for (int i= 0; i<=evenNumbers.size(); i++){
            if (evenNumbers.get(i)%5==0){
                evenNumbers.remove(i);
            }
        }
        System.out.println(evenNumbers);


    }
}
