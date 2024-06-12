package org.example.Exception.Ex4;

public class ex4 {
    public static int method1() {
        return 50 / 0;
    }

    public static void method2() {
        method1();
    }

    public static void method3() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Can devide for 0");
        }
    }

    public static void main(String[] args) {
        method3();
    }

}
