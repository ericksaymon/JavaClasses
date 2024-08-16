package cloud.ericksaymon.maratonajava.javacore.Aclassintroduction.test;

import cloud.ericksaymon.maratonajava.javacore.Aclassintroduction.domain.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 12;
        person.name = "Theo";
        person.sex = 'M';
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.sex);
    }
}
