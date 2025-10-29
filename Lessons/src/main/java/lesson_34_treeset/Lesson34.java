package lesson_34_treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Lesson34 {
    public static void main(String[] args) {
        Set<Integer> number = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        for (int i = 0; i < 100; i++) {
            number.add(((int) (Math.random() * 10)));
        }
        for (int numbers : number) ;
        {
            System.out.println(number);
        }
    }

}
