package lesson_20_inheritance_2;

public class Lesson20 {
    public static void main(String[] args) {
        Rect rect = new Rect(10,15);
        Triangle triangle = new Triangle(10);
        System.out.println(rect.getArea());
        System.out.println(triangle.getArea());
    }
}
