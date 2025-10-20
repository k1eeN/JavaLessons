package lesson_10_intro_to_methods;

public class Dog {
    String nameDog;
    String breed;
    int speed;

    void run() {
        String result = "";
        for (int i = 0; i < speed; i++) {
            result += "бегу";
            if (i == speed - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }
    String info() {
        return "Кличка: " + nameDog + "\nПорода: " + breed + "\nСкорость: " + speed;
    }
}
