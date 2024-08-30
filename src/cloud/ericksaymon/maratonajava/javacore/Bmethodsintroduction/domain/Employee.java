package cloud.ericksaymon.maratonajava.javacore.Bmethodsintroduction.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salary;

    public void printData() {
        System.out.println(this.name);
        System.out.println(this.age);
        for (double salary : this.salary) {
            System.out.println("Salary: "+ salary);
        }
    }

    public void averageSalary() {
        double sum = 0;
        for (double temp: this.salary) {
            sum += temp;
        }
        sum /= this.salary.length;
        System.out.println("Average Salary: " + sum);
    }
}
