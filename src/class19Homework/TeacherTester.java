package class19Homework;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher1= new Teacher();
        teacher1.name= "Mr. John";
        teacher1.age= 35;
        teacher1.teacherID = "John1234";
        teacher1.teacherInfo();
        teacher1.info();
        teacher1.nameAndAgeList();

        System.out.println("---------------------------------------------");

        MathTeacher mathTeacher1= new MathTeacher();
        mathTeacher1.name= "Ms. Jane";
        mathTeacher1.age= 32;
        mathTeacher1.teacherID = "Jane234";
        MathTeacher.subject= "Math";
        mathTeacher1.experience= 5;
        mathTeacher1.teacherInfo();
        System.out.println("Subject: "+MathTeacher.subject);
        mathTeacher1.teachMath();
        System.out.println("Years of Experience: "+mathTeacher1.experience);

        System.out.println("-----------------------------------------------");

        ChemistryTeacher chemistryTeacher1= new ChemistryTeacher();
        chemistryTeacher1.name= "Mr. Jones";
        chemistryTeacher1.teacherID = "Jones345";
        chemistryTeacher1.age= 40;
        ChemistryTeacher.subject= "Chemistry";
        chemistryTeacher1.numberOfExperiments= 11;
        chemistryTeacher1.teacherInfo();
        System.out.println("Subject: "+ChemistryTeacher.subject);
        chemistryTeacher1.experiments();
        System.out.println("Total Experiments: "+chemistryTeacher1.numberOfExperiments);

        System.out.println("-----------------------------------------------");

        PianoTeacher pianoTeacher1= new PianoTeacher();
        pianoTeacher1.name= "Mr. James";
        pianoTeacher1.age= 35;
        pianoTeacher1.teacherID = "James654";
        PianoTeacher.subject= "Music- Piano";
        pianoTeacher1.teacherInfo();
        System.out.println("Subject: "+PianoTeacher.subject);
        pianoTeacher1.pianoInfo();
    }
}
