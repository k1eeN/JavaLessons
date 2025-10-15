package lesson3conditions;

public class HomeWork3 {
    public static void main(String[] args) {
        int money = 10;
        if (money > 500) {
            System.out.println("Покупаю пиццу");
        } else if (money > 300) {
            System.out.println("Покупаю шаурму");
        } else if (money < 100) {
            System.out.println("Покупаю дошик");
        }
    }
}
