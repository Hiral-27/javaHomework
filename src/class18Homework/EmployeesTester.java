package class18Homework;

import java.nio.file.Watchable;

public class EmployeesTester {
    public static void main(String[] args) {
        Employees employee1= new Employees();
        Employees.name= "John";
        Employees.employeeID= "John1234";
        employee1.salary= 50000;
        Employees.employeeInfo();

        System.out.println("---------------------------------------------");

        Manager manger1= new Manager();
        Manager.name= "David";
        Manager.employeeID= "David234";
        manger1.department= "Human Resource";
        manger1.designation= "HR Manager";
        manger1.salary= 70000;
        Manager.employeeInfo();
        manger1.managerInfo();

    }
}
