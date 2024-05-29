package Advanced;

import Advanced.Task1.Person;
import Advanced.Task2.Address;
import Advanced.Task3.Laptop;
import Advanced.Task4.Car;
import Advanced.Task5.Employee;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chose: ");
        int chose = sc.nextInt();
        switch (chose) {
            case 1 -> task1();
            case 2 -> task2();
            case 3 -> task3();
            case 4 -> task4();
            case 5 -> task5();
            default -> System.out.println("Invalid");
        }

    }

    public static void task1() {
        Person original = new Person("Anh Quan", 20);
        Person copy = new Person(original);

        System.out.println("Original: " + original);
        System.out.println("Copy: " + copy);

        copy.setName("Dam Huy Quan");
        System.out.println("after fixing copy: " + copy);
        System.out.println("Original: " + original);
    }
    public static void task2() {
        Address address = new Address("312 Lac Long Quan", "Ha Noi", "100000");
        System.out.println(address);
    }
    public static void task3() {
        Laptop laptop = new Laptop("Dell", "XPS 13", "Intel i7", 10);
        System.out.println(laptop);
    }

    public static void task4() {
        Car car = new Car("Toyota", "Camry", 200, "V6");
        System.out.println(car);

        car.setHorsepower(250);
        car.setEngineType("V8");

        System.out.println("Updated Car Details:");
        System.out.println(car);
    }

    public static void task5() {
        Employee employee = new Employee("Nguyen Van A", 30, "E12345");
        System.out.println(employee.getDetails());
    }
}
