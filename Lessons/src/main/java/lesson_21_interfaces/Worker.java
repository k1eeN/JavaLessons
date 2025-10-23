package lesson_21_interfaces;

public abstract class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println(name);
    }
}
