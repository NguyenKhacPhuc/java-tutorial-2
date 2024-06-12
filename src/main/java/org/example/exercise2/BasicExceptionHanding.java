package org.example.exercise2;

public class BasicExceptionHanding {
    public int devide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Can't resolved for zero");
            return 0;
        }
    }

    public void convertStringToInt(String s) {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println("Can not parse integer");
        }
    }
}
