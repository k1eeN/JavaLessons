package lesson_21_interfaces;

public class Driver extends Worker implements CanDriveCar {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void toDrive() {
        System.out.println("Еду");
    }
}
