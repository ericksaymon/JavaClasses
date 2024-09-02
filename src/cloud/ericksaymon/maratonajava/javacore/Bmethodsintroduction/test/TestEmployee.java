package cloud.ericksaymon.maratonajava.javacore.Bmethodsintroduction.test;

import cloud.ericksaymon.maratonajava.javacore.Bmethodsintroduction.domain.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Theo");
        employee.setAge(22);
        employee.setSalary(new double[] {2000D, 1900D, 2000D});

        employee.printData();
        employee.averageSalary();
    }
}
