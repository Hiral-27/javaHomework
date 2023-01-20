package class3Homework;

public class TemperatureCheck_2 {
    public static void main(String[] args) {
        /*
        Task 2:
        Create a Java program and name it Temperature Check. Create variable to store temperature.
        Your program should check if temperature is below 32 then it should print “Water will freeze with temperature”
        otherwise “Water will NOT freeze with temperature ”.
         */

        int temperature= 35;
        if(temperature<32){
            System.out.println("Temperature is "+temperature+" water will freeze with temperature");
        }else{
            System.out.println("Temperature is "+temperature+" water will NOT freeze with temperature");
        }
    }
}
