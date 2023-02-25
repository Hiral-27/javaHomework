package class28Homework;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    /*
Task 06-
Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and
cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet
has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.
*/
    public static void main(String[] args) {
        ArrayList <Insurance> insurance= new ArrayList<>();
        insurance.add(new Car("Car Insurance Policy","BMW"));
        insurance.add(new Pet("Pet Insurance Policy","Dog"));
        insurance.add(new Health("Health Insurance Policy"));

        // For Loop
        for (int i = 0; i < insurance.size(); i++) {
            Insurance policies= insurance.get(i);
            System.out.println(policies.insuranceName);
            policies.getQuote();
            policies.cancelInsurance();
        }
        System.out.println();

        // Enhanced For Loop
        for (Insurance policy: insurance){
            System.out.println(policy.insuranceName);
            policy.getQuote();
            policy.cancelInsurance();
        }
        System.out.println();

        // Iterator
        Iterator <Insurance> iterator= insurance.iterator();
        while (iterator.hasNext()){
            Insurance insurance1= iterator.next();
            System.out.println(insurance1.insuranceName);
            insurance1.getQuote();
            insurance1.cancelInsurance();
        }
    }
}
