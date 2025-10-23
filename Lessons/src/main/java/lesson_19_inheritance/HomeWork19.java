package lesson_19_inheritance;

public class HomeWork19 {
    public static void main(String[] args) {
        Box box1 = new Box(10,10,10);
        BoxWeight box2 = new BoxWeight(10,10,10,10);
        box1.showInfo();
        box2.showInfo();
    }
}
