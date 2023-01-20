package class3Homework;

public class DoubleComparison_1 {
    public static void main(String[] args) {
        /*
        Task 1:
        Create a Java program and name it Double Comparison. Declare 2 double values and if value of first variable
        is higher then the second, print “Double value____is larger than_____” Otherwise print...
         */

        double number1= 445.1234567;
        double number2= 368.875421234;
        System.out.println(number1>number2);
        if(number1>number2){
            System.out.println("Double value "+number1+" is higher than "+number2);
        }else{
            System.out.println("Double value "+number1+" is lower than "+number2);
        }

    }
}
