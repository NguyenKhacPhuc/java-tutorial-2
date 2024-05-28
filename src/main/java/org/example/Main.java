package org.example;

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
            case 8:
                excercice4();
                break;
            case 9:
                excercice4();
                break;
            case 10:
                excercice4();
                break;
            default:
                System.out.println("Dont have number of task");
                break;
        }
    }

    public static void excercice1() {
        Person person1 = new Person();
        person1.setName("Anh");
        person1.setAge(21);

        person1.displayPersonDetail();
    }

    public static void excercice2() {
        Person person2 = new Person("Anh", 21, "da9x260@gmail.com");
        person2.displayPersonDetail();
        System.out.println(person2.getEmail());
    }

    public static void excercice3() {
        Car car1 = new Car("Run","Toyota",4);
        car1.displayVehicleDetails();
    }

    public static void excercice4() {
        Shape shape1 = new Shape();
        shape1.draw();

        Shape shape2 = new Circle();
        shape2.draw();

        Shape shape3 = new Rectangle();
        shape3.draw();
    }

    public static void excercice5() {
        Student student = new Student("Anh",21,123456);
        student.displayPersonDetail();
    }

    public static void excercice6() {
        SavingsAccount savingsAccount = new SavingsAccount("7891011", 2000, 3.5);
        savingsAccount.depositMoney(500);
        savingsAccount.withdrawMoney(300);
        savingsAccount.applyInterest();
    }

    public static void excercice7() {
        EBook ebook = new EBook("Java OPP","Cong",100);
        ebook.displayEBookDetails();
    }



}