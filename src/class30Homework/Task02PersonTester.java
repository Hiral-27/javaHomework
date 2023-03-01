package class30Homework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Task02PersonTester {
    /*
Task 2-
Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object.
Print each object details.
 */
    public static void main(String[] args) {
        Map<Integer,Task02Person> person= new TreeMap<>();
        person.put(12345, new Task02Person("Joe","Snow", 45, 120000));
        person.put(11233, new Task02Person("Jack","Smith",38, 135000));
        person.put(15067, new Task02Person("Olivia","Johnson", 36, 110000));
        person.put(14378, new Task02Person("Julie","Jones",37, 1250000));
        person.put(13389, new Task02Person("Emma","Williams",42, 145000));


        Set<Entry<Integer,Task02Person>> entrySet= person.entrySet();
        for (Entry<Integer,Task02Person> entry: entrySet){
            entry.getValue().printUserDetails();
        }

    }
}
