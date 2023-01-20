package class11Homework;

public class Task_05_Grocery {
    public static void main(String[] args) {
        /*
        Task 5-
         Using 2D array create a grocery list.
         Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that
         array using 2 different loops
         */

        String[][] groceryList= {{"Spinach","Broccoli","Apples","Oranges"},
                                  {"Milk","Butter","Almonds","M&M","Ferrero Rocher"}
        };

        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.print(groceryList[i][j]+" , "+" ");
            }
            System.out.println();
        }
        System.out.println();
//---------------------------------------------------------------------------------------------------------------

        System.out.println("Method 2: For Each Loop");
        for (String[] grocery:groceryList) {
            for (String grocery2:grocery) {
                System.out.print(grocery2+" ");
            }
            System.out.println();
        }

    }
}
