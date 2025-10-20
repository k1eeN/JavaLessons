package lesson_6_loop;

public class Lesson6Loop3 {
    public static void main(String[] args) {
        int i = 0;
        int c = 1;
        while (c <= 100) {
            i += c;
            c++;
        }
        float b = i / (float) c;
        System.out.println(b);
    }
}