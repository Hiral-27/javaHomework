package class15Homework;

public class J06_Student {
    /*
    Task 6:
    Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
    score > 90 - A,  score >80 - B,  score >70 - C,   score > 50 - D,   anything else - F
     */

    char getGrade(int score) {

        if (score >= 90 && score < 100) {
            return 'A';
        } else if (score >= 80 && score < 90) {
            return 'B';
        } else if (score >= 70 && score < 80) {
            return 'C';
        } else if (score >= 50 && score < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

class J06_StudentTester{
    public static void main(String[] args) {
        J06_Student grades= new J06_Student();
        char grade= grades.getGrade(98);
        System.out.println(grade);
    }
}
