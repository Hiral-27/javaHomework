package class28Homework;

import java.util.ArrayList;

public class Task02 {
    /*
    Task 02:
    Create an arraylist of cars and retrieve all the values using 3 different ways.
     */
    public static void main(String[] args) {
        ArrayList <String> cars= new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Ferrari");
        cars.add("Maserati");
        cars.add("BMW");
        // 1
        System.out.println(cars);
        System.out.println("------------------------");

        //2 Enhanced For Loop
        for (String car: cars){
            System.out.println(car);
        }
        System.out.println("------------------------");

        //3 Normal for loop
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}
