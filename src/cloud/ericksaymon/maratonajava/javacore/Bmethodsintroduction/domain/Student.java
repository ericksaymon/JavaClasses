package cloud.ericksaymon.maratonajava.javacore.Bmethodsintroduction.domain;

public class Student {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        if (age <= 0) {
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }

    public void setGender (char gender) {
        if (gender != 'M' && gender != 'F') {
            System.out.println("Invalid gender");
            return;
        }
        this.gender = gender;
    }
}
