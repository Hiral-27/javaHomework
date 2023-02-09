package class22Homework;

import class19Homework.A;

/*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */
public class CreditCard {

    int balance;
    double interest;

    double calculateInterest(int balance, double interest){
        balance= 50000;
        interest= 11.50;
        return (interest*balance/100);
    }
}

class Visa extends CreditCard{

}

class AX extends CreditCard{
    @Override
    double calculateInterest(int balance, double interest) {
        balance= 30000;
        interest= 10.50;
        return (interest*balance/100);
    }
}

class Tester{
    public static void main(String[] args) {
        CreditCard creditCard= new CreditCard();
        System.out.println("The interest on Credit Card: "+creditCard.calculateInterest(30000, 10.5));

        Visa visa= new Visa();
        System.out.println("The interest on Visa: "+visa.calculateInterest(50000, 4.50));

        AX ax= new AX();
        System.out.println("The interest on AX: "+ax.calculateInterest(32000, 6));

    }
}