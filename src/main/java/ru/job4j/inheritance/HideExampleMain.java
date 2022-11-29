package ru.job4j.inheritance;
/**
 * создаем объект типа Animal
 * создаем объект Cat типа Animal
 * вызов переопределенного метода класса Animal
 * вызов переопределенного метода класса Cat
 * вызов статического метода класса Animal
 * вызов статического метода класса Cat
  */

public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        animal.instanceInvoke();
        cat.instanceInvoke();
        Animal.staticInvoke();
        Cat.staticInvoke();
    }
}
