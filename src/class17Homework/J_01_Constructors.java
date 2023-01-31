package class17Homework;

public class J_01_Constructors {
    /*
    Task 1:
    Write a java class that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
    */

    String name;
    int age;

    J_01_Constructors(){

    }

    J_01_Constructors(String studentName, int studentAge){
        name= studentName;
        age= studentAge;
    }

    void printInfo(){
        System.out.println("Name: "+name+", Age: "+age);
    }
}
