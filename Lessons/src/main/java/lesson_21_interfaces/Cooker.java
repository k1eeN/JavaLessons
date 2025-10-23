package lesson_21_interfaces;

public class Cooker extends Worker implements CanCooking {
    public Cooker(String name) {
        super(name);
    }

    @Override
    public void toCook() {
        System.out.println("Готовлю");
    }
}
