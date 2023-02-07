package class19Homework;

public class AnimalsTester {
    public static void main(String[] args) {
        Animals animal1 = new Animals();
        animal1.species= "Deer";
        animal1.mammals= true;
        animal1.animalsInfo();

        System.out.println("--------------------------");

        Herbivorous herbAnimal= new Herbivorous();
        herbAnimal.species= "Deer";
        herbAnimal.mammals= true;
        herbAnimal.type= "Herbivorous";
        herbAnimal.animalsInfo();
        herbAnimal.eatPlants();

        System.out.println("--------------------------");

        Elephant elephant1= new Elephant();
        elephant1.species= "Elephant";
        elephant1.mammals= true;
        elephant1.type= "Herbivorous";
        elephant1.name= "Dumbo";
        elephant1.age= 10;
        elephant1.animalsInfo();
        elephant1.eatPlants();
        elephant1.elephantInfo();

    }
}
