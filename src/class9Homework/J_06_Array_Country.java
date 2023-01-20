package class9Homework;

public class J_06_Array_Country {
    public static void main(String[] args) {
        /*
        Task 6-
        Create an array of countries.
        While retrieving all values from an array print capital for each country choose any five countries.
         */

        String[] country = {"USA", "India", "UK", "Russia", "Morocco"};
        String[] capital = {"Washington DC", "New Delhi", "London", "Moscow", "Rabat"};
        for (int i = 0; i < country.length; i++) {
                System.out.println(capital[i] + " is the capital of " + country[i]);
        }
    }
}
