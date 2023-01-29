package class15Homework;

public class J01_LargerNumber {
    /*
    Task 1:
    Create a method that will take 2 parameters as a numbers and prints which number is larger.
     */

    int largeNumber (int num1, int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }
}

class J01_LargeNumberTester{
    public static void main(String[] args) {

        J01_LargerNumber largeNumber= new J01_LargerNumber();
        int larger= largeNumber.largeNumber(20,80);
        System.out.println("The Larger Number is: "+larger);
    }

}