package org.example.Exception.Ex3;

public class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }

    public static boolean validateAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Age must be higher 18");
        else
            return true;
    }

    public static void main(String[] args) {
        try {
            validateAge(3);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

}