package cloud.ericksaymon.maratonajava.javacore.Aclassintroduction.test;

import cloud.ericksaymon.maratonajava.javacore.Aclassintroduction.domain.Student;

public class Student01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 14;
        student.name = "Erick";
        student.sex = 'M';
        student.grade = 9;
        System.out.println(student.sex);
        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.grade);
    }
}
