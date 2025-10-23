package lesson_22_interfaces_2;

public class HomeWork22 {
    public static void main(String[] args) {
        Director director = new Director();
        Accountant accountant = new Accountant();
        director.force(new Counter() {
            @Override
            public String givesReport(int i) {
                return "Отчет за " + i + " месяцев";
            }
        }, 12);

        //director.force(accountant,12);
    }
}
