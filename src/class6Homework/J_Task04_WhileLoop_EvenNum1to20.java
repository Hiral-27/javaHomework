package class6Homework;

public class J_Task04_WhileLoop_EvenNum1to20 {
    public static void main(String[] args) {
        // Question 4: Print even numbers from 20 to 1 (2 ways)
        System.out.println("Method 1: ");
        int num= 2;
        while(num<=20){
            System.out.println(num);
            num+=2;
        }

        System.out.println("Method: 2");
        int num1= 20;
        while(num1>=1) {
            if (num1 % 2 == 0) {
                System.out.println(num1);
            }
            num1--;
        }
    }
}
