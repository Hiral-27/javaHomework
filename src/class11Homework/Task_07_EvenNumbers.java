package class11Homework;

public class Task_07_EvenNumbers {
    public static void main(String[] args) {
        /*
        Task 7-
        Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        Develop a program which will identify/print the even numbers only.
         */

        int[][] numbers= {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12}
        };
        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    System.out.println("Even Numbers: "+numbers[i][j]);
                    sumEven= sumEven+ numbers[i][j];
                }else{
                    System.out.println("Odd Numbers: "+numbers[i][j]);
                    sumOdd= sumOdd+numbers[i][j];
                }
            }

        }
        System.out.println("Sum of Even numbers= "+sumEven);
        System.out.println("Sum of Odd numbers= "+sumOdd);
    }
}
