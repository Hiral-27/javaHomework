package class16Homework;

public class J_01Array {
    /*
    Task 1:
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class
     */

   int sumArray(int[] arr){
        int sum=0;
        for (int num: arr){
            sum+=num;
        }
        return sum;
    }
}

class J_01ArrayTester {
    public static void main(String[] args) {

        J_01Array array= new J_01Array();

       /* int[] number= {10,20,30};
        int sum= array.sumArray(arr);
        System.out.println(sum);*/

        System.out.println(array.sumArray(new int[]{10,20,30}));


    }
}