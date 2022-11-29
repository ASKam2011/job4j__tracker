package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item item = new Item();
        System.out.println(item);
        LocalDateTime timeDate = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy EEEE HH:mm:ss");
        String currentDateTimeFormat = timeDate.format(formatter);
        System.out.println(currentDateTimeFormat);

    }
}
