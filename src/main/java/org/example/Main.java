package org.example;

import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void task1() {
        Book Book1 = new Book("Hello", "Lisa", 125000);
        Book Book2 = new Book("My class", "Anh", 37900);
        Book1.displayDetail();
        Book2.displayDetail();
    }

    public static void task2() {
        Book Book3 = new Book();
        Book3.setInf("My bag", "Nga", 37900);
        System.out.println(Book3.gettitle());
        System.out.println(Book3.getauthor());
        Book3.applyDiscount(6);
    }

    public static void task3() {
        Book Book3 = new Book("Hello", "Alex");
        Book3.displayDetail();
    }

    public static void task4() {
        Book Book4 = new Book("My world", "Andy");
        Book Book5 = new Book("My name", "Hanbin");
        System.out.println(Book.getBookCount());
    }

    public static void main(String[] args) {
        task4();
    }
}