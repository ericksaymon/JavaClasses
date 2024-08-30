package cloud.ericksaymon.maratonajava.javacore.Bmethodsintroduction.test;

import cloud.ericksaymon.maratonajava.javacore.Bmethodsintroduction.domain.PrintStudentData;
import cloud.ericksaymon.maratonajava.javacore.Bmethodsintroduction.domain.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();
        PrintStudentData printer = new PrintStudentData();

        student.name = "Mickey";
        student.age = 26;
        student.sex = 'M';

        student2.name = "Alya";
        student2.age = 23;
        student2.sex = 'F';

        student.printName();
        student.printAge();
        student.printSex();
        System.out.println("---------");
        student2.printName();
        student2.printAge();
        student2.printSex();
    }
}
