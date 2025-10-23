package lesson_21_interfaces;

public class Programmer extends Worker implements CanProgramming {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void writingCode() {
        System.out.println("Пишу код");
    }
}
