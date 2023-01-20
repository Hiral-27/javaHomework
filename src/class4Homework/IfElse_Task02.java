package class4Homework;

public class IfElse_Task02 {
    public static void main(String[] args) {
        /*
        Task 2:
        Create a Java program and store values of mortgage rate and mortgage price.
        First, program should check if rate is higher than 4.5 user will not buy a house,
        otherwise user will consider buying. Once user decides to buy a house,
        if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
         */

        double mortgageRate= 3.5;
        if(mortgageRate>4.5){
            System.out.println("Mortgage rate is "+mortgageRate+" it's too high not gonna buy a house");
        }else {
            System.out.println("Mortgage rate is "+mortgageRate+" it's moderate consider buying a house");

            int mortgagePrice= 250000;

            if(mortgagePrice>200000){
                System.out.println("Mortgage Price is "+mortgagePrice+" consider taking a loan");
            }else {
                System.out.println("Mortgage Price is "+mortgagePrice+" consider paying in cash");
            }
        }




    }
}
