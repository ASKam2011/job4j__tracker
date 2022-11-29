package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Smirnova Ivanna Petrovna");
        student.setGroup("345");
        student.setDateOfReceipt(new Date());
        System.out.println(student.getFio() + "\nгруппа №: " + student.getGroup() + "\nдата зачисления: " + student.getDateOfReceipt());
    }
}
