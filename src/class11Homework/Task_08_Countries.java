package class11Homework;

public class Task_08_Countries {
    public static void main(String[] args) {
        /*
        Task 8-
        Create 2D array of countries: north america countries, south america countries, europe countries,
         asian countries, african countries. Then print all values from that array using 2 different loops
         and calculate how many total countries been stored
         */

        String[][] countries= {{"USA","Canada","Mexico","Cuba"},
                               {"Brazil","Argentina","Peru","Chile"},
                               {"UK","France","Greece","Portugal"},
                               {"India","Russia","Japan","Maldives"},
                               {"Egypt","Nigeria","Kenya","Morocco"}
        };

        int totalCountries=0;

        // Method 1: For Loop
        System.out.println("Method 1: For Loop");
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" , "+" ");
            }
            totalCountries= totalCountries + countries[i].length;
            System.out.println();
        }
        System.out.println("The total number of countries are "+ totalCountries);

//-----------------------------------------------------------------------------------------------------------------
        System.out.println("*************************************");
        //Method 2: For Each Loop
        System.out.println("For Each Loop");
        for (String [] country : countries) {
            for (String countries1: country){
                System.out.print(countries1+"  ");
            }
            System.out.println();
        }
        System.out.println("Total countries- "+totalCountries);


    }
}
