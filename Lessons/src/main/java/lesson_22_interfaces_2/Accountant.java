package lesson_22_interfaces_2;

public class Accountant implements Counter {
    @Override
    public String givesReport(int i) {
        return "Отчет за " + i + " месяцев";
    }
}
