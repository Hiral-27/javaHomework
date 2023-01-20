package class6Homework;

public class J_Task05_WhileLoop_OddNum20to50 {
    public static void main(String[] args) {
        // Question 5: Print odd numbers between 20 and 50 (2 ways)
        System.out.println("Method 1:");
        int num=20;
        while(num<=50){
            if(num%2!=0){
                System.out.println(num);
            }
            num++;
        }
        System.out.println("Method 2:");
        int num1= 21;
        while(num1<50){
            System.out.println(num1);
            num1+=2;
        }
    }
}
