package class11Homework;

public class Task_02_Dog {
    /*
    Task 2-
     Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  with specific
     attributes and behaviors.
     */
    String name;
    String breed;
    String color;
    int age;
    double weight;

    void barks(){
        System.out.println("Woof Woof");
    }
    void sleep(){
        System.out.println("Dog is sleeping...zzzzzzzzzZZZZZZZZ");
    }
    void playFetch(){
        System.out.println("Dog is playing fetch");
    }
    void eat(){
        System.out.println("Dog is eating...");
    }

}
