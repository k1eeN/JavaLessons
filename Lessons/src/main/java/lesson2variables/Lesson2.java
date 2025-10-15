package lesson2variables;

public class Lesson2 {
    public static void main(String[] args) {
        int days = 5000;
        int years = days / 365;
        int moth = ( days % 365 ) / 31;
        int leftDays = days - years * 365 - moth * 31;
        System.out.println("Общее кол-во дней: " + days);
        System.out.println("Лет: " + years);
        System.out.println("Месяцев: " + moth);
        System.out.println("Дней: " + leftDays);
    }
}
