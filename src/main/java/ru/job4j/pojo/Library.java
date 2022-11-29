package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 300);
        Book auditor = new Book("Ревизор", 128);
        Book littlePrince = new Book("Маленький принц", 86);
        Book alphabet = new Book("Азбука", 33);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = auditor;
        books[2] = littlePrince;
        books[3] = alphabet;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - количество страниц - " + book.getPageCount());
        }
        System.out.println("Переставим книги:");
        books[0] = alphabet;
        books[3] = cleanCode;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - количество страниц - " + book.getPageCount());
        }
        System.out.println("Книга с определенным именем:");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - количество страниц - " + book.getPageCount());
            }
        }
    }
}
