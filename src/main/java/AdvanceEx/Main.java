package AdvanceEx;

import org.example.Person;

import java.util.Scanner;

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
        System.out.println("Cant Do");
    }

    public static void excercice2() {
        Address address = new Address("406 HTM", "Hanoi", "12345");
        address.displayAdressDetail();
    }

    public static void excercice3() {
        Device device = new Device("Apple", "SCSDCSD");
        Computer computer = new Computer("Dell", "HP", "Intel i5");
        Laptop laptop = new Laptop("Apple", "MacBook Air", "M1", 18);

        System.out.println("Device information:");
        device.displayDetail();
        System.out.println("Computer information:");
        computer.displayDetail();
        System.out.println("Laptop information:");
        laptop.displayDetail();
    }

    public static void excercice4() {
        Engine engine = new Engine(1000, "VF8");
        Car car = new Car("VF", "Vin", engine);

        car.displayDetail();

        System.out.println("Car after set engine: ");
        car.setEngineHorsepower(2000);
        car.setEngineType("VF6");

        car.displayDetail();
    }

    public static void excercice5() {
        System.out.println("Cant Do");

    }

    public static void excercice6() {
        System.out.println("Cant Do");

    }

    public static void excercice7() {
        System.out.println("Cant Do");

    }
}
