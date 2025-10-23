package lesson_19_inheritance;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight(double width, double height, double length, double weight) {
        super(width, height, length);
        this.weight = weight;
    }

    public BoxWeight(double size) {
        super(size);
        weight = size;
    }

    public BoxWeight() {
        super();
        weight = 0;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Вес: " + weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

