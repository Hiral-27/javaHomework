package class33Homework;
/*
Task 04-
Create a method checkUserName that will throw a runtime exception. Method should throw an exception when
entered username is less than 5 characters.
 */
public class Task04 {
    public static void checkUserName(String username){
        if(username.length()<5){
            throw new RuntimeException("Invalid Username, the username cannot be less than 5 characters");
        }else{
            System.out.println("Valid Username");
        }
    }

    public static void main(String[] args) {
        checkUserName("Ruby");
    }
}
