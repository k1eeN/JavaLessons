package lesson_6_loop;

public class Lesson6Loop2 {
    public static void main(String[] args) {
        int i = 1000;
        while (i >= 0) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
