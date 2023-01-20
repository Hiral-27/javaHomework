package class9Homework;

public class J_05_Arrays_Sum {
    public static void main(String[] args) {
        /*
        Create an array of size 5 on integers and calculate the sum of all elements in an array.
         */

        int[] number= new int[5];
        number[0]= 10;
        number[1]= 2;
        number[2]= 3;
        number[3]= 4;
        number[4]= 5;
        int sum= 0;
        for(int i=0; i< number.length; i++){
            sum= sum + number[i];
        }
        System.out.println("The sum of all the elements is array: "+sum);
    }
}
