package lesson_5_primitive;

public class Lesson5WhatToDo {
    public static void main(String[] args) {
        int time = 20;
        boolean goodWeather = true;
        boolean timeLate = time >= 23 || time <= 6;
        if (timeLate) {
            System.out.println("Спать");
        }
        if (!timeLate && goodWeather) {
            System.out.println("Гулять");
        }
        if (!timeLate && !goodWeather) {
            System.out.println("Читать книгу");
        }
    }
}
