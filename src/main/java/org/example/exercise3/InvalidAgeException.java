package org.example.exercise3;

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
}


