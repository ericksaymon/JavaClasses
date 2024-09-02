package cloud.ericksaymon.maratonajava.javacore.Bmethodsintroduction.test;

import cloud.ericksaymon.maratonajava.javacore.Bmethodsintroduction.domain.PrintStudentData;
import cloud.ericksaymon.maratonajava.javacore.Bmethodsintroduction.domain.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();
        PrintStudentData printer = new PrintStudentData();

        student.setName("Mickey");
        student.setAge(26);
        student.setGender('M');

        student2.setName("Alya");
        student2.setAge(23);
        student2.setGender('F');

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println("---------");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getGender());
    }
}
