package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " - Передвигается по рельсам");
    }

    @Override
    public void type() {
        System.out.println(getClass().getSimpleName() + " - Наземный транспорт");
    }
}
