package class11Homework;

public class Task_01_PhoneTester {
    public static void main(String[] args) {
        /*
        Task 1-
        Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.
         */
        Task_01_Phone iPhone = new Task_01_Phone();
        iPhone.brand= "iPhone";
        iPhone.color= "Grey";
        iPhone.model= "IPhone 14 Pro Max";
        iPhone.storage= "256GB";
        iPhone.call();
        iPhone.message();
        iPhone.playingMusic();
        System.out.println();

        Task_01_Phone pixel = new Task_01_Phone();
        pixel.brand= "Pixel";
        pixel.color= "Black";
        pixel.model= "Pixel003";
        pixel.call();
        pixel.message();
        pixel.playingMusic();
        System.out.println();

        Task_01_Phone samsung = new Task_01_Phone();
        samsung.brand= "Samsung";
        samsung.color= "Gold";
        samsung.model= "S22 Ultra";
        samsung.storage= "256GB";
        samsung.call();
        samsung.message();
        samsung.playingMusic();
        System.out.println();


    }
}
