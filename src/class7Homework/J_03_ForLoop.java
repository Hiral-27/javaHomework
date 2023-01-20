package class7Homework;

public class J_03_ForLoop {
    public static void main(String[] args) {
        //Question 3- Print even numbers from 20 to 1 (2 ways)
        // Method 1
        System.out.println("Method 1");
        for(int i=20; i>=1; i-=2){
            System.out.print(i+" ");
        }
        System.out.println();

        // Method 2
        System.out.println("Method 2");
        for(int j=20; j>=1; j--){
            if(j%2==0){
                System.out.print(j+" ");
            }
        }

    }
}
