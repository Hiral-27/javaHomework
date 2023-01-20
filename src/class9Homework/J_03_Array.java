package class9Homework;

public class J_03_Array {
    public static void main(String[] args) {
        /*
        Task 3-
         Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements
         of array: “Saturday is Java coding Day”.
         */
        String [] day= {"Java","Saturday", "day", "coding", "is"};

        day[0]= "Saturday";
        day[1]= "is";
        day[2]= "Java";
        day[3]= "coding";
        day[4]= "day";
        for(int i=0; i< 5; i++){
            System.out.print(day[i]+" ");
        }
       // System.out.println();
      //  System.out.print(day[1]+" "+day[4]+ " "+day[0]+" "+day[3]+" "+day[2]);

    }
}
