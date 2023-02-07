package class20Homework;

public class J_03_EmployeeTester extends  FullTime {
    int incentives;
    J_03_EmployeeTester(String name, String employeeID, int bonus, int incentives){
        super(name, employeeID, bonus);
        this.incentives= incentives;
    }
    void  incentivesInfo(){
        System.out.println("Incentives receivable: "+incentives);
    }
    public static void main(String[] args) {
        FullTime employee1= new FullTime("John","John123", 80);
        employee1.employeeInfo();
        employee1.displayInfo();

        System.out.println("----------------------------------------");

        PartTime employee2= new PartTime("Jane", "Jane987", 2);
        employee2.employeeInfo();
        employee2.partTimeInfo();

        System.out.println("----------------------------------------");

        J_03_EmployeeTester tester3= new J_03_EmployeeTester("Jack","Jack345", 2000, 1200);
        tester3.employeeInfo();
        tester3.displayInfo();
        tester3.incentivesInfo();


    }
}
