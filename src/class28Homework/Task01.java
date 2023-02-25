package class28Homework;

import java.util.ArrayList;

public class Task01 {
    /*
    Task 01:
     Create an ArrayList that will store 5 names into it.
     Find out whether the given ArrayList is empty or not?
     Check whether the specific name is present in an ArrayList or not?
     Find the size of your arrayList and print all values from that
     */
    public static void main(String[] args) {

        String name1= "Hiral";
        ArrayList <String> names= new ArrayList<>(5);
        names.add("Daria");
        names.add("Natallia");
        names.add("Asli");
        names.add("Abeera");
        names.add("Dena");

        System.out.println("Is ArrayList empty? "+names.isEmpty());

        System.out.println("Is the name Hiral present in the ArrayList? "+names.contains(name1));

        System.out.println("The size of the ArrayList is "+names.size());

        System.out.println(names);

    }
}
