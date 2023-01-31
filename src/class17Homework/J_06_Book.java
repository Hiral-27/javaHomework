package class17Homework;

public class J_06_Book {
    /*
    Task 6:
     Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */

    String bookName;
    String bookgenre;
    String authorName;
    int bookpages;
    int bookyear;

    J_06_Book(String name, String author){
        bookName= name;
        authorName= author;
    }

    J_06_Book(String name, String genre, int pages, int year){
        bookName= name;
        bookgenre=genre;
        bookpages=pages;
        bookyear=year;
    }

    void printBookDetails(){
        System.out.println("Book Name: "+bookName+", Author Name: "+authorName+", Genre: "+bookgenre+", Number of Page: "+bookpages+", Year of Published: "+bookyear);
    }
}
