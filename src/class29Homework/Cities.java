package class29Homework;

import java.util.Iterator;
import java.util.LinkedHashSet;
/*
Task 1:
Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with “A”;
 */
public class Cities {
    public static void main(String[] args) {
        LinkedHashSet<String> cities= new LinkedHashSet<>();
        cities.add("Mumbai");
        cities.add("New York");
        cities.add("Ahmedabad");
        cities.add("Boston");
        cities.add("Alexandria");
        cities.add("Chicago");
        cities.add("Boston");
        cities.add("New Delhi");

        // Method 1: Lambda expressions
        cities.removeIf(city-> city.startsWith("A"));
        System.out.println(cities);

    }
}
