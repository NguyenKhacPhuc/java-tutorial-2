import basicExceptionHandling.ExceptionHanding;
import customException.InvalidAgeException;

import static customException.AgeValidator.validateAge;
import static customException.AgeValidator.validateAge;
import static exceptionPropagation.ExceptionPropagation.method3;
import static multipleExceptions.MultipleExceptions.processInput;

public class Main {
    public static void main(String[] args) {
//        System.out.println(ExceptionHanding.divide(10, 0));
//        System.out.println(ExceptionHanding.convertStringToInt("25"));

//        customException();
        exceptionPropagation();
//        multipleExceptions();

    }

    public static void customException() {
        int[] t = {20, 15, 18, 17, 22};

        for (int age : t) {
            try {
                System.out.println("Validating age: " + age);
                validateAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }
        }
    }

    public static void exceptionPropagation() {
        try {
            method3();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }

    public static void multipleExceptions() {
        String input1 = "123";
        processInput(input1);

        String input2 = "abc";
        processInput(input2);

        String input3 = null;
        processInput(input3);
    }
}
