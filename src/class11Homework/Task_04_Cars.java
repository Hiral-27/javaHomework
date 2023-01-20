package class11Homework;

public class Task_04_Cars {
    public static void main(String[] args) {
        /*
        Task 4-
        Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that
        array using 2 different loops
         */
        String[][] cars={{"American","German","Korean","Italian"},
                         {"Tesla","Mercedes","Hyundai","Ferrari"}
        };

        // ForLoop
        System.out.println("Method 1: For Loop");
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" , "+" ");
            }
            System.out.println();
        }
        System.out.println();

//--------------------------------------------------------------------------------------------------------------
        System.out.println("Method 2: For Each Method");
        //For Each Loop
        for (String[] car: cars) {
            for (String car2: car) {
                System.out.print(car2+" , "+" ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
