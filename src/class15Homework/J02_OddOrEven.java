package class15Homework;

public class J02_OddOrEven {
    /*
    Task 2:
    Create a method that will take a number and prints whether the number is even or odd.
     */

    boolean isOddOrEven(int num1) {
        if (num1 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
class J02_OddOrEvenTester{
    public static void main(String[] args) {

        J02_OddOrEven oddEven= new J02_OddOrEven();
        boolean number= oddEven.isOddOrEven(21);
        System.out.println("Is the number Even: "+number);
    }
}

