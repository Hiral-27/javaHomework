package class28Homework;


/*
Task 06-
Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and
cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet
has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public abstract class Insurance {
    String insuranceName;

    public Insurance(String insuranceName){
        this.insuranceName= insuranceName;
    }
    abstract void getQuote();
    abstract void cancelInsurance();

    String getInsuranceName(){
        return insuranceName;
    }
}

class Car extends Insurance{
String carModel;
    public Car(String insuranceName, String carModel){
        super(insuranceName);
        this.carModel= carModel;
    }

    public String getCarModel(){
        return carModel;
    }

    @Override
    void getQuote() {
        System.out.println("This insurance quote is from "+getInsuranceName()+" for "+carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Canceling the insurance from "+getInsuranceName()+" for "+carModel);
    }
}

class Pet extends Insurance{
String petType;
    public Pet(String insuranceName, String petType){
        super(insuranceName);
        this.petType= petType;
    }
    public String getPetType(){
        return petType;
    }

    @Override
    void getQuote() {
        System.out.println("This insurance quote is from "+getInsuranceName()+" for "+petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Canceling the insurance from "+getInsuranceName()+" for "+petType);
    }
}
class Health extends Insurance{
    public Health(String insuranceName){
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("This is Health insurance quote from "+getInsuranceName());
    }

    @Override
    void cancelInsurance() {
        System.out.println("Canceling the Health insurance from "+getInsuranceName());
    }
}
