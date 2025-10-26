package lesson_27_junit_2;

public class HomeWork27 {
    public int add(int a, int b) {
        return a + b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double multiplication(String a, String b) {
        double numA = Double.parseDouble(a);
        double numB = Double.parseDouble(b);
        return numA * numB;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public double division(String a, String b) {
        double numA = Double.parseDouble(a);
        double numB = Double.parseDouble(b);
        return numA / numB;
    }

    public double square(double a) {
        return a * a;
    }

}
