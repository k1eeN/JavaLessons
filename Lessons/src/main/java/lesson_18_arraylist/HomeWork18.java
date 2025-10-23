package lesson_18_arraylist;

import java.util.ArrayList;

public class HomeWork18 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        ArrayList<String> names = new ArrayList<>();
        names.add("Дима");
        names.add("Леся");
        names.add("Саша");
        names.add("Марк");
        names.add("Настя");
        names.add("Кирилл");
        names.add("Влад");
        names.add("Денис");
        names.add("Даша");
        names.add("Кира");
        ArrayList<String> data = new ArrayList<>();
        for (int i = 0, j = 0; i < numbers.size(); i++, j++) {
          String d = numbers.get(i) + " - " + names.get(j);
          data.add(d);
        }
        for (String a : data) {
            System.out.println(a);
        }
    }
}
