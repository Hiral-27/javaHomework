package class4Homework;

import java.util.Scanner;

public class ScannerTask_05 {
    public static void main(String[] args) {
        /*
        Task 5:
        Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
         */
        Scanner input= new Scanner(System.in);

        System.out.println("Temperature Check");
        System.out.println("Enter your City name: ");
        String cityName= input.nextLine();

        System.out.println("Enter your City's temperature(in fahrenheit): ");
        float temperature= input.nextFloat();
        // Converting Fahrenheit to Celsius
        float tempCelsius= (temperature-32)*5/9;
        System.out.println("The temperature in "+cityName+" is "+tempCelsius+" degree Celsius.");

        input.close();


    }
}
