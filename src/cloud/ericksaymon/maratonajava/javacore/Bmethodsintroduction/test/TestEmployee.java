package cloud.ericksaymon.maratonajava.javacore.Bmethodsintroduction.test;

import cloud.ericksaymon.maratonajava.javacore.Bmethodsintroduction.domain.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Theo";
        employee.age = 22;
        employee.salary = new double[] {2000D, 1900D, 2000D};

        employee.printData();
        employee.averageSalary();
    }
}
