package class15Homework;

public class J05_PrimeNumber {
    /*
    Task 5:
    Write a method to return whether given number is prime or not?
     */

    boolean isPrime (int num1){
        if (num1 <= 1) {
            return false;
        }
        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) {
                return false;
            }
        }
        return true;
    }

    }

class J05PrimeNumberTester{
    public static void main(String[] args) {

        J05_PrimeNumber primeNumber= new J05_PrimeNumber();

        System.out.println("The number is prime number: "+primeNumber.isPrime(20));

    }
}