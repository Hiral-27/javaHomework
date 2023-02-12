package class23Homework;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */

    public void starts(){
        System.out.println("Turning On the Computer");
    }
    public void playMusic (){
        System.out.println("Playing Music...");
    }

    public void operatingSystem(){
        System.out.println("Operating System");
    }
    public void restart(){
        System.out.println("Restarting...");
    }

}

class Apple extends Computer{
    @Override
    public void starts() {
        System.out.println("Turning on Apple Computer");
    }

    @Override
    public void playMusic() {

        System.out.println("Playing Music on iTunes");
    }

    @Override
    public void operatingSystem() {
        System.out.println("Mac OS");
    }

    @Override
    public void restart() {

        super.restart();
    }

    public void appleTV()
    {
        System.out.println("Watching movie on Apple TV");
    }
}

class Lenovo extends Computer{
    @Override
    public void starts() {
        System.out.println("Turning on Lenovo Computer");
    }
    @Override
    public void playMusic() {
        super.playMusic();
    }

    @Override
    public void operatingSystem() {
        System.out.println("Linux");
    }

    @Override
    public void restart() {
        super.restart();
    }
}

class HP extends Computer{
    @Override
    public void starts() {
        System.out.println("Turning on HP Computer");
    }

    @Override
    public void operatingSystem() {
        System.out.println("Windows 10");
    }

    @Override
    public void restart() {
        System.out.println("Windows 10 Restarting");
    }
}

class Dell extends Computer{
    @Override
    public void starts() {
        System.out.println("Turning on Dell Computer");
    }

    @Override
    public void playMusic() {

        super.playMusic();
    }

    @Override
    public void operatingSystem() {
        System.out.println("Windows 11");
    }

    @Override
    public void restart() {
        System.out.println("Windows 11 Restarting....");
    }
}