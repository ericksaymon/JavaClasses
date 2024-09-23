package cloud.ericksaymon.maratonajava.javacore.Bmethodsintroduction.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salary;
    private double averageSalary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double[] getSalary() {
        return this.salary;
    }

    public void printData() {
        System.out.println(this.name);
        System.out.println(this.age);
        for (double salary : this.salary) {
            System.out.println("Salary: "+ salary);
        }
    }

    public void getAverageSalary() {
        for (double temp: this.salary) {
            averageSalary += temp;
        }
        averageSalary /= this.salary.length;
        System.out.println("Average Salary: " + averageSalary);
    }
}
