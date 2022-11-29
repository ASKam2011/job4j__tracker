package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error empty = new Error();
        Error comp = new Error(false, 1, "No problem");
        Error error = new Error(true, 450, "Ошибка");
        empty.printInfo();
        comp.printInfo();
        error.printInfo();
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println("Код: " + status);
        System.out.println("Текст: " + message);
    }
}
