package class17Homework;

public class J_06_BookTester {
    public static void main(String[] args) {
        System.out.println("Constructor- 1");
        J_06_Book book1= new J_06_Book("Alice's Adventure in Wonderland","Lewis Carroll");
        book1.printBookDetails();

        System.out.println("Constructor- 2");
        J_06_Book book2= new J_06_Book("Alice's Adventure in Wonderland","Fantasy",60,1865);
        book2.printBookDetails();
    }
}
