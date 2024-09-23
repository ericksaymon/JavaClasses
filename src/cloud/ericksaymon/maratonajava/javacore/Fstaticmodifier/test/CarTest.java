package cloud.ericksaymon.maratonajava.javacore.Fstaticmodifier.test;

import cloud.ericksaymon.maratonajava.javacore.Fstaticmodifier.domain.Car;

public class  CarTest {
    public static void main(String[] args) {
        System.out.println(Car.getMaxAllowedSpeed());
        Car.setMaxAllowedSpeed(290);
        System.out.println(Car.getMaxAllowedSpeed());
    }
}
