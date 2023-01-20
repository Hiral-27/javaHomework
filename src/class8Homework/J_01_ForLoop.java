package class8Homework;

public class J_01_ForLoop {
    public static void main(String[] args) {
        /*
        Task 1: Print numbers from 1 to 50 except those that are divisible by 3
         */
        // Method 1: Without "continue"
        System.out.println("Method 1: Without 'continue' keyword");
        for(int i= 1; i<=50; i++){
            if(i%3!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        // Method 2: With "continue"
        System.out.println("Method 2: With 'continue' keyword");
        for(int i=1; i<=50; i++){
            if(i%3==0){
                continue;
            }
            System.out.print(i+" ");
        }


    }
}
