package ru.job4j.oop;

public class Jukebox {
    public static void main(String[] args) {
        Jukebox avtomat = new Jukebox();
        avtomat.music(1);
        avtomat.music(2);
        avtomat.music(0);
    }

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят.");
        } else {
            System.out.println("Песня не найдена");
        }
    }
}
