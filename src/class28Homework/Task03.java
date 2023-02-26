package class28Homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Task03 {
    /*
    Task 03:
    Create an arrayList of words. Remove every word that ends with “e”.
     */
    public static void main(String[] args) {
        ArrayList <String> words= new ArrayList<>();
        words.add("aglie");
        words.add("java");
        words.add("adobe");
        words.add("selenium");

        // 1st Method--> Iterator
        Iterator<String> iterator=words.iterator();
        while (iterator.hasNext()){
            String str= iterator.next();
            if (str.endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);

        // OR

        // 2nd Method Lambda Expression
        words.removeIf(word-> word.endsWith("e"));
        System.out.println(words);

    }
}
