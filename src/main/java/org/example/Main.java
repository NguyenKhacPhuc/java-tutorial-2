package org.example;

import org.example.exercise1.*;
import org.example.exercise2.*;
import org.example.exercise3.*;
import org.example.exercise4.*;
import org.example.exercise5.*;
import org.example.exercise6.*;

import java.util.Scanner;

import static org.example.exercise3.InvalidAgeException.validateAge;
import static org.example.exercise4.ExceptionPropagation.method3;
import static org.example.exercise5.MultipleExceptions.processInput;
import static org.example.exercise6.NestedTryCatch.nestedExceptionHandling;

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
//            case 7:
//                excercice7();
//                break;
            default:
                System.out.println("Dont have number of task");
                break;
        }
    }

    public static void excercice1() {
        Employee epl1 = new Developer(1, "Anh", "Anh", "Java", "Java");
        Employee epl2 = new Tester(1, "Quan", "Quan", "Testing", "high level");
        Employee epl3 = new Manager(1, "Duong", "Duong", "IT", "high level");

        Employee[] employees = {epl1, epl2, epl3};
        for (Employee employee : employees) {
            if (employee instanceof Developer) {
                Developer newDev = (Developer) epl1;
                newDev.joinDailyMeeting();
                newDev.code(false);
                newDev.takeARest();
                newDev.goHome();
            } else if (employee instanceof Tester) {
                Tester newTester = (Tester) epl2;
                newTester.joinDailyMeeting();
                newTester.test();
                newTester.writeDocument();
                newTester.takeARest();
                newTester.goHome();
            } else if (employee instanceof Manager) {
                Manager newManager = (Manager) epl3;
                newManager.joinDailyMeeting();
                newManager.manager();
                newManager.holdMeeting();
                newManager.takeARest();
                newManager.goHome();
            }
        }

        for (Employee employee : employees) {
            employee.joinDailyMeeting();
            employee.takeARest();
            employee.goHome();
        }
    }

    public static void excercice2() {
        BasicExceptionHanding divne = new BasicExceptionHanding();
        System.out.println(divne.devide(10, 2));
        System.out.println(divne.devide(10, 0));

        BasicExceptionHanding convertStringToInt = new BasicExceptionHanding();
        convertStringToInt.convertStringToInt("asd");
        convertStringToInt.convertStringToInt("123");
    }

    public static void excercice3() {
        try {
            validateAge(3);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void excercice4() {
        try {
            method3();
        } catch (Exception e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }

    public static void excercice5() {
        String[] testInputs = {"123", "abc", null, "456", "78.9"};

        for (String input : testInputs) {
            System.out.println("Testing input: " + input);
            processInput(input);
        }
    }

    public static void excercice6() {
        nestedExceptionHandling();
    }
}

