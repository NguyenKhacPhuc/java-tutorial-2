package org.example.exercise6;

public class NestedTryCatch {
    public static void nestedExceptionHandling() {
        try {
            int[] array = {1, 2, 3};

            try {
                int result = array[1] / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: " + e.getMessage());
            }
            array[5] = 4;
            System.out.println("Result: " + array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
