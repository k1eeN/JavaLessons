package lesson_13_overload;

public class HomeWork13 {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        Monster monster2 = new Monster(1,1,1);
        Monster monster3 = new Monster(5,6);
        monster1.voice();
        monster2.voice(7);
        monster3.voice(8, "AAAAAA");
    }
}
