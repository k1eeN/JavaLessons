package lesson_24_random;

public class HomeWork24 {
    public static void main(String[] args) {
        int numbers = (int) (Math.random() * 90 + 10);
        String result = String.format("Случайное число %s Попробуйте еще раз", numbers);
        System.out.println(result);
    }
}
