package lesson_9_intro_oop;

public class Lesson9 {
    public static void main(String[] args) {
        Human firstMan = new Human();
        firstMan.name = "Mark";
        firstMan.age = 20;
        firstMan.weight = 95;
        Human secondMan = new Human();
        secondMan.name = "Vasya";
        secondMan.age = 21;
        secondMan.weight = 85;
        Human thirdMan = new Human();
        thirdMan.name = "Dima";
        thirdMan.age = 23;
        thirdMan.weight = 82;
        Human fourthMan = new Human();
        fourthMan.name = "Ivan";
        fourthMan.age = 45;
        fourthMan.weight = 150;
        Human fifthMan = new Human();
        fifthMan.name = "Zahar";
        fifthMan.age = 34;
        fifthMan.weight = 112.2;

        double a = (firstMan.age + secondMan.age + thirdMan.age + fourthMan.age + fifthMan.age) / 5;
        System.out.println(a);
    }
}
