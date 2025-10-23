package lesson_16_collections;

public class Lesson16 {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Дима");
        employees.add("Вася");
        employees.add("Егор");
        employees.add("Андрей");
        employees.add("Артем");
        employees.add("Антон");
        employees.add("Ваня");
        employees.remove("Егор");
        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }
}
