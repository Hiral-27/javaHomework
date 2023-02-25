package class28Homework;

import java.util.ArrayList;

public class Task04 {
    /*
    Task 04:
    Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
     */
    public static void main(String[] args) {
        ArrayList<String> drinks= new ArrayList<>();
        drinks.add("Beer");
        drinks.add("Mojito");
        drinks.add("Juice");
        drinks.add("Milk");
        drinks.add("Latte");
        drinks.add("Thums Up");


        for (int i=0; i< drinks.size();i++){
            String drink= drinks.get(i);
            if (drink.contains("e")|| drink.contains("a")) {
                drinks.set(i,"WATER");
            }
        }
        System.out.println(drinks);


    }
}
