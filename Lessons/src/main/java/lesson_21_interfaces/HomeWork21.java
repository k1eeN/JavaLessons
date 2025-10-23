package lesson_21_interfaces;

import java.util.ArrayList;

public class HomeWork21 {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Дима");
        Programmer programmer2 = new Programmer("Ваня");
        Programmer programmer3 = new Programmer("Саша");
        Cooker cook1 = new Cooker("Антон");
        Cooker cook2 = new Cooker("Андрей");
        Cooker cook3 = new Cooker("Артем");
        Driver driver1 = new Driver("Святослав");
        Driver driver2 = new Driver("Изяслав");
        Driver driver3 = new Driver("Ярослав");

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(programmer1);
        workers.add(programmer2);
        workers.add(programmer3);
        workers.add(cook1);
        workers.add(cook2);
        workers.add(cook3);
        workers.add(driver1);
        workers.add(driver2);
        workers.add(driver3);
        for (Worker work : workers) {
            work.showInfo();
        }

        ArrayList<CanProgramming> canProgrammings = new ArrayList<>();
        canProgrammings.add(programmer1);
        canProgrammings.add(programmer2);
        canProgrammings.add(programmer3);
        for (CanProgramming programmer : canProgrammings) {
            programmer.writingCode();
        }

        ArrayList<CanCooking> canCookings = new ArrayList<>();
        canCookings.add(cook1);
        canCookings.add(cook2);
        canCookings.add(cook3);
        for (CanCooking cooking : canCookings) {
            cooking.toCook();
        }

        ArrayList<CanDriveCar> canDriveCar = new ArrayList<>();
        canDriveCar.add(driver1);
        canDriveCar.add(driver2);
        canDriveCar.add(driver3);
        for (CanDriveCar drive : canDriveCar) {
            drive.toDrive();
        }
    }
}
