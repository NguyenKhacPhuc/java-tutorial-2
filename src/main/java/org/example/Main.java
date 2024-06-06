package org.example;

import java.util.Scanner;

import org.example.exercise1.*;
import org.example.exercise2.*;
import org.example.exercise3.*;
import org.example.exercise4.*;
import org.example.exercise5.*;
import org.example.exercise6.*;
import org.example.exercise7.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of your task y want show");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                excercice1();
                break;
            case 2:
                excercice2();
                break;
            case 3:
                excercice3();
                break;
            case 4:
                excercice4();
                break;
            case 5:
                excercice5();
                break;
            case 6:
                excercice6();
                break;
            case 7:
                excercice7();
                break;
            default:
                System.out.println("Dont have number of task");
                break;
        }
    }

    public static void excercice1() {

    }

    public static void excercice2() {

    }

    public static void excercice3() {

    }

    public static void excercice4() {

    }

    public static void excercice5() {

    }

    public static void excercice6() {

    }

    public static void excercice7() {

    }
}