package class19Homework;

public class A {
    /*
   Task 2:
    Write program to inherit class A that has method printF which is static and call or reuse that method into class B
     */

    static void printF(){
        System.out.println("Java");
    }
}

class B extends A{

}

class Main {
    public static void main(String[] args) {
        B b= new B();
        B.printF();
    }

}