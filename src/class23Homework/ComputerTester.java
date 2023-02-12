package class23Homework;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers= {new Apple(), new Dell(), new Lenovo(), new HP()};
        for (Computer computer: computers){
            computer.starts();
            computer.operatingSystem();
            computer.playMusic();
            computer.restart();
            System.out.println();
        }
    }
}
