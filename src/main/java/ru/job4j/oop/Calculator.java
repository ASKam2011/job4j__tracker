package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int k) {
        return x - k;
    }

    public int divide(int z) {
        return z / x;
    }

    public int sumAllOperation(int s) {
        return sum(s) + minus(s) + multiply(s) + divide(s);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        result = Calculator.minus(13);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        rsl = calculator.divide(15);
        System.out.println(rsl);
        rsl = calculator.sumAllOperation(20);
        System.out.println(rsl);
    }
}
