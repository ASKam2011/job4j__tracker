package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("В Москву");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("Максимум пассажиров: " + passenger);
    }

    @Override
    public double refuel(double fuel) {
        return fuel * 37.8;
    }
}
