package class17Homework;

public class J_05_StudentAddress {
    /*
    Task 5:
     Write a Student class that have instance variables name and address. Create a constructor
     that will initialize those variables. Print name & address of given  student using displayInfo method.
     */

    String name;
    String address;

    J_05_StudentAddress(String studentName, String studentAddress){
        name= studentName;
        address= studentAddress;
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
    }
}
