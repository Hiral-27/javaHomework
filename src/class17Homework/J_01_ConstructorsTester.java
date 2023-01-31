package class17Homework;

public class J_01_ConstructorsTester {
    public static void main(String[] args) {

        J_01_Constructors student1= new J_01_Constructors();
        student1.printInfo();
        J_01_Constructors student2= new J_01_Constructors("Nelson", 20);
        student2.printInfo();
    }
}
