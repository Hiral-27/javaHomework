package class29Homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*
Task 2-
Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order.
Each student object should have name and studentID. Display name of each student.
 */
public class Student {
    public static void main(String[] args) {

        HashMap<String, Integer> studentList=new HashMap<>();
        studentList.put("Asli", 10);
        studentList.put("Hiral",11);
        studentList.put("Abeera",12);
        studentList.put("Daria",13);
        studentList.put("Dena",14);
        studentList.put("Natalia",15);

        System.out.println(studentList.keySet());

       /* HashSet<String> students= new HashSet<>();
        students.add("Asli", 10);
        students.add("Hiral",11);
        students.add("Abeera",12);
        students.add("Daria",13);
        students.add("Dena",14);
        students.add("Natalia",15);
*/
    }
}
