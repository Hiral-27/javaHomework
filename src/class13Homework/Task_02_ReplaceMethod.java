package class13Homework;

public class Task_02_ReplaceMethod {
    /*
    Task 2:
     Create a String that should be combination of letters, numbers and special characters.
     Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
     */

    public static void main(String[] args) {

        String alpaNum= "ASDFGHJKZXC23456789284qwertyuinhg*^&%";
        System.out.println(alpaNum.replaceAll("[^A-Za-z0-9]","").length());
    }
}
