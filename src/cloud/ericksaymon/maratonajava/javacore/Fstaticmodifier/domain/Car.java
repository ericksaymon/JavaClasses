package cloud.ericksaymon.maratonajava.javacore.Fstaticmodifier.domain;

public class Car {
    private String name;
    private static double maxAllowedSpeed = 250;
    private double actualMaxSpeed;

    public Car(String name, double actualMaxSpeed) {
        this.name = name;
        this.actualMaxSpeed = actualMaxSpeed;
    }

    public void printData() {
        System.out.println("------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Max Speed: " + this.actualMaxSpeed);
        System.out.println("Limit Speed: " + Car.maxAllowedSpeed);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getActualMaxSpeed() {
        return this.actualMaxSpeed;
    }

    public void setActualMaxSpeed(double actualMaxSpeed) {
        this.actualMaxSpeed = actualMaxSpeed;
    }

    public static double getMaxAllowedSpeed() {
        return Car.maxAllowedSpeed;
    }

    public static void setMaxAllowedSpeed(double maxAllowedSpeed) {
        Car.maxAllowedSpeed = maxAllowedSpeed;
    }
}
