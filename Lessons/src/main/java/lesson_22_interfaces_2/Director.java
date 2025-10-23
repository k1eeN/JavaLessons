package lesson_22_interfaces_2;

public class Director {
    void force(Counter counter, int i) {
        String report = counter.givesReport(i);
        System.out.println(report);

    }
}
