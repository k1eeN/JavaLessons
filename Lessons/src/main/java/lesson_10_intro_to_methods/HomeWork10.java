package lesson_10_intro_to_methods;

public class HomeWork10 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.nameDog = "Дэля";
        dog.breed = "Джек рассол";
        dog.speed = 25;
        dog.run();
        System.out.println(dog.getInfo());
    }
}
