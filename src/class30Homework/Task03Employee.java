package class30Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/*
Task 3-
Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000
 */
public class Task03Employee {
    public static void main(String[] args) {
        Map<String, Integer> map= new HashMap<>();
        map.put("Jack Snow",70000);
        map.put("John Smith", 100000);
        map.put("Emma Williams", 185000);
        map.put("Olivia Johnson", 95000);


        Set<Entry<String, Integer>> entrySet= map.entrySet();
        String name=" ";
        int highest=0;
        for (Entry<String, Integer> entry: entrySet){
            if(entry.getValue()> highest){
                name= entry.getKey();
                highest= entry.getValue();

            }
        }
        System.out.println(name+"=$"+ highest);

    }
}
