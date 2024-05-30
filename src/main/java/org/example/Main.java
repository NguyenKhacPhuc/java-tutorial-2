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
                excercice8();
                break;
            case 9:
                excercice9();
                break;
            case 10:
                excercice10();
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

        Person person2 = new Person();
        person2.setName("Anh");
        person2.setAge(21);
        person2.setEmail("ndagmail.com");
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



    public static void excercice8() {
        Library library = new Library();
        Book book1 = new Book("Java OPP", "MrCong");
        Book book2 = new Book("Java Basic", "Mr.Phuc");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Books in the library:");
        for (Book book : library.listBooks()) {
            System.out.println(book);
        }

        library.removeBook(book1);

        System.out.println("\nBooks in the library after removal:");
        for (Book book : library.listBooks()) {
            System.out.println(book);
        }
    }

    public static void excercice9() {
        Employee manager = new Manager();
        Employee developer = new Developer();

        manager.work();
        developer.work();
    }

    public static void excercice10() {
        Building building1 = new Building();
        Building building2 = new Building(2,4);

        House house1 = new House();
        House house2 = new House(2, 3);

        System.out.println("Building :");
        building1.displayDetail();
        building2.displayDetail();

        System.out.println("House :");
        house1.displayDetail();
        house2.displayDetail();
    }



}