package class33Homework;

import java.lang.annotation.ElementType;
import java.util.*;

/*
Task 02-
Create a static method that will return a List of Exceptions.
Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
Call your method inside main and print name and details of all Exception objects.
 */
public class Task02 {
    public static List<Exception> exceptionsList(){
        List<Exception> exceptions= new ArrayList<>();

        // NullPointerException:
        String string= null;
        try{
            System.out.println(string.length());
        }catch (NullPointerException ne){
            exceptions.add(ne);
        }

        // ArithmeticException
        int a= 10;
        int b=0;
        try{
            int divide= a/b;
            System.out.println(divide);
        } catch (ArithmeticException ae){
            exceptions.add(ae);
        }

       // IndexOutOfBoundsException
        int[] numbers= new int[4];
        try{
            numbers[5]= 10;
        } catch (ArrayIndexOutOfBoundsException aibe){
            exceptions.add(aibe);
        }

        String str= "exceptions";
        try{
            System.out.println(str.charAt(10));
        }catch (StringIndexOutOfBoundsException sibe){
            exceptions.add(sibe);
        }

        return exceptions;

    }

    public static void main(String[] args) {
        List<Exception> list= exceptionsList();
        for (Exception e: list){
            System.out.println(e);
        }

    }
}
