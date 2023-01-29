package class15Homework;

public class J04_HelloLanguages {
    /*
    Task 4:
    Create a method that will say Hello in different language based on the country that will passed
    when method is executed
     */
        String hello (String country){
            String language="";
            if (country.equalsIgnoreCase("Spain")){
               return "Ola";
            } else if (country.equalsIgnoreCase("India")) {
                return "Namaste";
            } else if (country.equalsIgnoreCase("France")) {
                return "Salut";
            } else{
                return "Invalid Input";
            }
        }
}

class J04HelloLanguagesTester{
    public static void main(String[] args) {

        J04_HelloLanguages lang= new J04_HelloLanguages();
        System.out.println(lang.hello("India"));
    }
}