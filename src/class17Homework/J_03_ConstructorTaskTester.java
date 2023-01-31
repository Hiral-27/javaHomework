package class17Homework;

public class J_03_ConstructorTaskTester {
    public static void main(String[] args) {
        System.out.println("Access Modifier: Public");
        J_03_ConstructorTask task1= new J_03_ConstructorTask("Tom", 28, "1st January");
        task1.printInfo();
        System.out.println("------------------------------------------------------------------------------------------------");

        System.out.println("Access Modifier: Default");
        J_03_ConstructorTask task2= new J_03_ConstructorTask("Jerry", 24, "2nd February","jerry123@gmail.com");
        task2.printInfo();
        System.out.println("------------------------------------------------------------------------------------------------");

        System.out.println("Access Modifier: Protected");
        J_03_ConstructorTask task3= new J_03_ConstructorTask("Noddy", 30, "noddy123@gmail.com",80000);
        task3.printInfo();
        System.out.println("------------------------------------------------------------------------------------------------");

//        System.out.println("Access Modifier: Private");
//        J_03_ConstructorTask task4= new J_03_ConstructorTask("Bob", "bob123@gmail.com","BOB12345",95000);
//        task4.printInfo();

    }
}
