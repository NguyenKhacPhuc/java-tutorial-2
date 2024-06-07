package org.example.Exception.Ex3;

public class InvalidAgeException extends Exception {
     
    public InvalidAgeException()
    {

    }
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be higher than 18");
        } else {
            System.out.println("Age : " + age);
        }
    }
       
}
