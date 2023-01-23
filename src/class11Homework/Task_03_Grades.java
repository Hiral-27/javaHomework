package class11Homework;

public class Task_03_Grades {
    public static void main(String[] args) {
        /*
        Task 3-
       Create a 2D array(shorter way) in which first array will consist of 4 names and
       second array will contain grades. Then your program should print name of the students that has A and B grade
         */              //       00        01       02      03
        String[][] students = {{"Johnson", "Jeff", "Elon", "Mark"}, // 0 Row 1i = 4j individual
                                {"A",       "B",     "D",     "C"}  // 1Row 2i = 4j individual
        };//                     10         11        12      13

        for (int i = 0; i < students.length; i++) { // students.length tells us how many total rows are present
            for (int j = 0; j < students[i].length; j++) { // students[i].length will give the size
                if (j<=1){
                    System.out.println(students[i][j]);
                }
        }



    }



}}

