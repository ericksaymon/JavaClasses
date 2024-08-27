package cloud.ericksaymon.maratonajava.javacore.Aclassintroduction.test;

import cloud.ericksaymon.maratonajava.javacore.Aclassintroduction.domain.Car;

public class Car01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.fabricationYear = "1999";
        car1.model = "Civic";
        car1.manufacturer = "Honda";
        Car car2 = new Car();
        car2.fabricationYear = "2024";
        car2.model = "Dolphin";
        car2.manufacturer = "BYD";
        System.out.println("Car 1: \n model: " + car1.model + "\n fabrication year: " + car1.fabricationYear + "\n manufacturer: " + car1.manufacturer + "\n");
        System.out.println("Car2: \n model: " + car2.model + "\n fabrication year: " + car2.fabricationYear + "\n manufacturer: " + car2.manufacturer + "\n");
        System.out.println("Car2: \n model: " + car2.model + "\n fabrication year: " + car2.fabricationYear + "\n manufacturer: " + car2.manufacturer + "\n");

    }
}
