package class17Homework;

public class J_03_ConstructorTask {
    /*
    Task 3:
    Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
    2 - from outside the class; 3 - from different class inside different package  and observe result.
     */

    String name;
    int age;
    String emailId;
    String password;
    String dateOfBirth;
    int salary;

   public J_03_ConstructorTask(String employeeName, int employeeAge, String birthDate){
        name= employeeName;
        age=employeeAge;
        dateOfBirth= birthDate;
    }
    J_03_ConstructorTask(String employeeName, int employeeAge, String birthDate, String email){
        name= employeeName;
        age=employeeAge;
        dateOfBirth= birthDate;
        emailId= email;
    }

    protected J_03_ConstructorTask(String employeeName, int employeeAge,String email, int paycheck){
        name= employeeName;
        age=employeeAge;
        emailId= email;
        salary= paycheck;
    }

    private J_03_ConstructorTask(String employeeName, String email, String passwords, int paycheck){
        name= employeeName;
        emailId= email;
        password= passwords;
        salary= paycheck;
    }

    void printInfo(){
        System.out.println("Employee Name: "+name+", Age: "+age+", Birth Date: "+dateOfBirth+", Email Id: "+emailId+", Password: "+password+", Salary "+salary);
    }
    public static void main(String[] args) {
        J_03_ConstructorTask task1= new J_03_ConstructorTask("Tom", 28, "1st January");
        task1.printInfo();
        J_03_ConstructorTask task2= new J_03_ConstructorTask("Jerry", 24, "2nd February","jerry123@gmail.com");
        task2.printInfo();
        J_03_ConstructorTask task3= new J_03_ConstructorTask("Noddy", 30, "noddy123@gmail.com",80000);
        task3.printInfo();
        J_03_ConstructorTask task4= new J_03_ConstructorTask("Bob", "bob123@gmail.com","BOB12345",95000);
        task4.printInfo();
   }
}
