package class9Homework;

public class J_04_Arrays_Cars {
    public static void main(String[] args) {
        /*
        Task 4:
        Create an array that can store names of cars and store 6 elements into it. Print all values from the array.
         */

        String[] cars= new String [6];
        cars[0]= "Tesla";
        cars[1]= "BMW";
        cars[2]= "Audi";
        cars[3]= "Mercedes";
        cars[4]= "Maserati";
        cars[5]= "Toyota";

        for(int i= 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

    }
}
