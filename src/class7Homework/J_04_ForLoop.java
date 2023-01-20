package class7Homework;

public class J_04_ForLoop {
    public static void main(String[] args) {
        // Question 4: Print odd numbers between 20 and 50 (2 ways)
        // Method 1
        System.out.println("Method 1");
        for(int i= 21; i<=50; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();


        // Method 2
        System.out.println("Method 2");
        for(int j= 20; j<=50; j++){
            if(j%2!=0){
                System.out.print(j+" ");
            }
        }



    }
}
