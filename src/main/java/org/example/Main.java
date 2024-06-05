package org.example;

import java.util.Scanner;

import org.example.exercise1.*;
import org.example.exercise2.*;
import org.example.exercise3.*;
import org.example.exercise4.*;
import org.example.exercise5.*;

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
            default:
                System.out.println("Dont have number of task");
                break;
        }
    }

    public static void excercice1() {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        Animal[] animals = {dog, cat, cow};

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public static void excercice2() {

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 7)
        };

        for (Shape shape : shapes) {
            System.out.println("The area is: " + shape.calculateArea());
        }
    }

    public static void excercice3() {

        Employee[] employees = {
                new SalariedEmployee("Anh", "A1", 5000),
                new HourlyEmployee("Quan", "A2", 200, 20)
        };

//        Employee salariedEmployee = new SalariedEmployee("Anh","A1",5000);
//        Employee hourlyEmployee = new HourlyEmployee("Quan","A2",200,20);

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getEmployeeID() + " has salary: " + employee.calculateSalary());
        }
    }

    public static void excercice4() {
        Vehicle[] vehicles = {
                new Car("Toyota", "Camry", 50, "Sedan"),
                new Truck("Ford", "F-150", 80, 5),
                new Motorcycle("Harley-Davidson", "Sportster", 40, 1200)
        };

        int rentalDays = 7;
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " rental cost for " + rentalDays + " days: " + vehicle.calculateRentalCost(rentalDays));
        }
    }

    public static void excercice5() {
        PaymentMethod[] paymentMethods = {
                new CreditCard("12345678", "12/25", "123"),
                new PayPal("nda@example.com", "password123"),
                new BankTransfer("987654321", "0000000111")
        };

        double paymentAmount = 150.00;


        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.processPayment(paymentAmount);
        }
    }

}