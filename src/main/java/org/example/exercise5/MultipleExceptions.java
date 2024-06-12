package org.example.exercise5;

public class MultipleExceptions {
    public static void processInput(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Processed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format - " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Input is null - " + e.getMessage());
        }
    }
}
