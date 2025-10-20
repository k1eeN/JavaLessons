package lesson_12_constructors;

public class HomeWork12 {
    public static void main(String[] args) {
        Worker worker = new Worker("Дима", "Мастер",60000);
        String info = worker.getInfo(12);
        System.out.println(info);
    }
}
