package ru.job4j.poly;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " - Летает по воздуху");
    }

    @Override
    public void type() {
        System.out.println(getClass().getSimpleName() + " - Воздушный транспорт");
    }
}
