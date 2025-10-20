package lesson_2_variables;

public class HomeWork2 {
    public static void main(String[] args) {
        int seconds = 10000;
        int secInMin = 60;
        int secInHours = secInMin * 60;
        int secInDays = secInHours * 24;
        int days = seconds / secInDays;
        int hours = (seconds % secInDays) / secInHours;
        int minutes = ((seconds % secInDays) % secInHours) / secInMin;
        int lefSeconds = seconds - days * secInDays - hours * secInHours - minutes * secInMin;
        System.out.println("Всего секунд: " + seconds);
        System.out.println("Секунд: " + lefSeconds);
        System.out.println("Минут: " + minutes);
        System.out.println("Часов: " + hours);
        System.out.println("Дней: " + days);
    }
}
