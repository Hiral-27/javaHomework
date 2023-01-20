package class11Homework;

public class Task_06_Sum {
    public static void main(String[] args) {
        /*
        Task 6-
        Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
         */

        int[][] number= {{1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}
        };

        //Method 1: ForLoop
        System.out.println("ForLoop");
        int sum=0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                sum = sum + number[i][j];
            }
        }
        System.out.println("The sum of all numbers in Array= "+sum);


    }
}
