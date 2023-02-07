package class20Homework;

public class J_03_Employee {
    /*
    Task 3:
    Create an Employee class that will have variables and methods. Constructor that should initialize
    instance variables Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    Test your code!
     */

    String name;
    String employeeID;


    J_03_Employee(String name, String EmployeeID){
        this.name= name;
        this.employeeID= EmployeeID;

    }

    void employeeInfo(){
        System.out.println("Name: "+name+"\n"+"Employee ID: "+employeeID);
    }
}

class FullTime extends J_03_Employee {
    int bonus;
    FullTime(String name, String employeeID, int bonus){
        super(name, employeeID);
        this.bonus= bonus;
    }

    void displayInfo() {
        System.out.println("Bonus: "+bonus);
    }
}

class PartTime extends J_03_Employee {
    int numberOfHours;
    PartTime(String name, String employeeID, int numberOfHours){
        super(name, employeeID);
        this.numberOfHours= numberOfHours;
    }

    void partTimeInfo(){
        System.out.println("Number of Hours: "+numberOfHours);
    }
}
