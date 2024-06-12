package org.example.Exception.Ex5;

public class ex5 {
    public static void processInput(String input) {
        try {
            int result = Integer.parseInt(input);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input");
        } catch (NullPointerException e) {
            System.err.println("Input is null");
        }

    }

    public static void main(String[] args) {
        processInput("1234");
        processInput("1234adf");
    }
}