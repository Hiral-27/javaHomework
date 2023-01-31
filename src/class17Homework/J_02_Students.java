package class17Homework;

public class J_02_Students {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables.
     */
    String name;
    int gradeScience;
    int gradeMath;
    int gradeHistory;

    int average;
     J_02_Students(String studentsName, int scoreScience, int scoreMath, int scoreHistory){

        name= studentsName;
        gradeScience = scoreScience;
        gradeMath= scoreMath;
        gradeHistory= scoreHistory;

        average= gradeScience +gradeMath+gradeHistory/300;
         }

    void printAverageGrade(){
        System.out.println("Name: "+name+"--> Science Grade: "+ gradeScience +", Math Grade: "+gradeMath+" History Grade: "+gradeHistory);
        System.out.println(name+"'s Average Marks: "+average);
    }
}
