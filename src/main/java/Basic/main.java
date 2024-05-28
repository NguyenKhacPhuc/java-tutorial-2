package Basic;

import Basic.Task10.House;
import Basic.Task1_2.Person;
import Basic.Task3.Car;
import Basic.Task4.Circle;
import Basic.Task4.Rectangle;
import Basic.Task4.Shape;
import Basic.Task5.Student;
import Basic.Task6.SavingsAccount;
import Basic.Task7.EBook;
import Basic.Task9.Developer;
import Basic.Task9.Manager;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chose: ");
        int chose = sc.nextInt();
        switch (chose) {
            case 1, 2 -> task1_2();
            case 3 -> task3();
            case 4 -> task4();
            case 5 -> task5();
            case 6 -> task6();
            case 7 -> task7();
//            case 8 -> task8();
            case 9 -> task9();
            case 10 -> task10();
            default -> System.out.println("Invalid");
        }

    }

    public static void task1_2() {
        Person anhQuan = new Person("Anh Quan", 20, "quandha07@gmail.com");
        anhQuan.personDetail();
    }

    public static void task3() {
        Car myCar = new Car("plastic", "modern", 4);
        System.out.println(myCar);
    }

    public static void task4() {
        Shape myShape = new Shape();
        System.out.println(myShape.draw());

        Circle myCircle = new Circle();
        System.out.println(myCircle.draw());

        Rectangle myRectangle = new Rectangle();
        System.out.println(myRectangle.draw());
    }

    public static void task5() {
        Student student1 = new Student("Anh Quan", 20, 1);
        System.out.println(student1);
    }

    public static void task6() {
        SavingsAccount acc1 = new SavingsAccount("001725568", 100000000, 1, 156);
        System.out.println(acc1.savingsInterestRate());
    }

    public static void task7() {
        EBook myEBook = new EBook("Ha Noi va Em", "Vu Thi Huong", 10.5F);
        System.out.println(myEBook);
    }

    public static void task9() {
        Developer d1 = new Developer("Anh Quan", 20, "Java");
        System.out.println(d1.work());

        Manager m1 = new Manager("Nguyen Phuc", 25, "Java");
        System.out.println(m1.work());
    }

    public static void task10() {
        House myHouse = new House("wood", 3, "modern", "white and blue");
        System.out.println(myHouse);
    }
}
