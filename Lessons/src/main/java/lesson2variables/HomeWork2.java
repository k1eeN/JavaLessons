package lesson2variables;

public class HomeWork2 {
    public static void main(String[] args) {
        int seconds = 10000;
        int secinmin = 60;
        int secinhours = secinmin * 60;
        int secindays = secinhours * 24;
        int days = seconds / secindays;
        int hours = (seconds % secindays) / secinhours;
        int minutes = ((seconds % secindays) % secinhours) / secinmin;
        int LefSeconds = seconds - days * secindays - hours * secinhours - minutes * secinmin;
        System.out.println("Всего секунд: " + seconds);
        System.out.println("Секунд: " + LefSeconds);
        System.out.println("Минут: " + minutes);
        System.out.println("Часов: " + hours);
        System.out.println("Дней: " + days);
    }
}
