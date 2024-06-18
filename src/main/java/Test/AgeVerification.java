package Test;

public class AgeVerification {
     public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 an oder");
        }else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(14);
        } catch (InvalidAgeException e) {
            System.out.println("Caught an Exception: " + e.getMessage());
        }
    }
}


