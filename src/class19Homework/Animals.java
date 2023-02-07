package class19Homework;

public class Animals {
    /*
    Task 1:
    Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A
     */

    String species;

    boolean mammals;

    void animalsInfo(){
        System.out.println("Species: "+species);
        System.out.println("Animal is a Mammal: "+mammals);
    }

}

class Herbivorous extends Animals{

    String type;

    void eatPlants(){
        System.out.println("Herbivorous Animal eats plants");
    }

}

class Elephant extends Herbivorous{
    String name;
    int age;

    void elephantInfo(){
        System.out.println("Name of an Elephant: "+name);
        System.out.println("Elephant's Age: "+age);
    }
}

