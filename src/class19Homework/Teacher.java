package class19Homework;

public class Teacher {
    /*
    Task 3:
    Write a Java program called Teacher.  Identify features and 4 behaviour of that Class. Create 3 subclasses
    MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    Test all 4 classes
     */
    String name;
    int age;
     String teacherID;

    String password;

    public static String subject;

    public void teacherInfo(){
        System.out.println("Name: "+name+", Age: "+age+", Teacher ID: "+ teacherID+", Password: "+password);

    }
    private void passwordInfo(){
        System.out.println("Password: "+password);
    }

    protected void info(){
        System.out.println("Teacher ID: "+teacherID+", Password: "+password);
    }

    void nameAndAgeList(){
        System.out.println("Name: "+name+", Age: "+age);
    }
}

class MathTeacher extends Teacher{
    int experience;

    void teachMath(){
        System.out.println("Teaching Math");
    }
}

class ChemistryTeacher extends Teacher{
    int numberOfExperiments;

    void experiments(){
        System.out.println("Performing Chemical Experiments");
    }
}

class PianoTeacher extends Teacher{
    void pianoInfo(){
        System.out.println("Playing Piano....");
    }
}