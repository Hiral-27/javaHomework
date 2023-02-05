package class18Homework;

public class Employees {
    /*
    Task 2:
    Write program to inherit class A that has method printF which is static and call or reuse that method into class B
     */

    static String name;
    static String employeeID;

    int salary;

    static void employeeInfo(){
        System.out.println("Name: "+name+" Employee ID: "+employeeID);
    }
}

class Manager extends Employees{
    String department;
    String designation;

    void managerInfo(){
        System.out.println("Department: "+department+" Designation: "+designation+" Salary: "+salary);
    }
}
