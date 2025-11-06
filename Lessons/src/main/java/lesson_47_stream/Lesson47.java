package lesson_47_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson47 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 1000));
        }
        List<String> list = numbers.stream()
                .filter((n) -> n % 2 == 0)
                .map((integer -> "Namber: " + integer))
                .filter((string) -> string.endsWith("0"))
                .map((string) -> string + "!")
                .collect(Collectors.toList());

        for (String s : list) {
            System.out.println(s);
        }
    }
}
