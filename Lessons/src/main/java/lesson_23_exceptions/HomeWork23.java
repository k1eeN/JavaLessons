package lesson_23_exceptions;

public class HomeWork23 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            for (int i = 0; i < numbers.length; i++) {
                numbers[10] = 11;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
    }
}
