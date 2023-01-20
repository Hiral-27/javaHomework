package class2Homework;

public class Operators {
    public static void main(String[] args) {
        /*
        TASK 4
        Write a Java program to add, subtract, multiply and divide 2 decimal values.
        Your program should say. “The __ of 2 numbers __ and  is equal to __”
        Expected Output:
        The Addition of 2 numbers 10.5 and 10.5 is equal to 21.0
        The Subtraction of 2 numbers 10.5 and 10.5 is equal to 0.0
        The Multiplication of 2 numbers 10.5 and 10.5 is equal to 110.25
        The Division of 2 numbers 10.5 and 10.5 is equal to 1.0
        Write a program to find the square of the number 3.9. You program should say
        “The square of the  is  “
        Expected output:
        The square of the 3.9 is 15.209999999999999
         */
        double num1= 10.50;
        double num2= 15.50;
        System.out.println("The Addition of 2 numbers "+num1+ " and " +num2+ " is equal to= "+ (num1+num2));
        System.out.println("The Subtraction of 2 numbers "+num1+ " and " +num2+ " is equal to= "+ (num1-num2));
        System.out.println("The Multiplication of 2 numbers "+num1+ " and " +num2+ " is equal to= "+ num1*num2);
        System.out.println("The Division of 2 numbers "+num1+ " and " +num2+ " is equal to= "+num1/num2);

        double square= 3.9;
        double squareOfNumber= square*square;
        System.out.println("The square of the 3.9 is "+ squareOfNumber); // Method-1
        System.out.println("The square of the 3.9 is "+ square*square); // Method-2

        /*
         TASK 5
         Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8.
         Your program should say.
        “The perimeter of a rectangle with width  and height __ is equal to __ and the area is __”
         */
        double rectangleWidth= 5;
        double rectangleHeight= 8;

        double areaOfRectangles= rectangleHeight*rectangleWidth;
        double perimeterOfRectangles= 2*(rectangleHeight+rectangleWidth);

        System.out.println("The perimeter of a rectangle with width "+rectangleWidth+ " and height "+rectangleHeight+ " is equal to "+perimeterOfRectangles+ " and the area is "+ areaOfRectangles);


    }
}
