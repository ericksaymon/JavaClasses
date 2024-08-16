package cloud.ericksaymon.maratonajava.javacore.Aclassintroduction.test;

import cloud.ericksaymon.maratonajava.javacore.Aclassintroduction.domain.Teacher;

public class Teacher01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.age = 34;
        teacher.name = "Claudinei";
        teacher.sex = 'M';
        teacher.subjectTaught = "Computer Support";
        System.out.println(teacher.sex);
        System.out.println(teacher.subjectTaught);
        System.out.println(teacher.age);
        System.out.println(teacher.name);
    }
}
