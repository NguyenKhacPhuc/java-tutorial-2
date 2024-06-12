package org.example.Exception.Ex6;

public class ex6 {

    public static void nestedExceptionHandling() {
        try {
            try {
                int arr[] = { 1, 2, 3, 4 };
                System.out.println(arr[6]);

            } catch (ArithmeticException e) {
                System.out.println("Arithmethic exception");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }

    public static void main(String[] args) {
        nestedExceptionHandling();
    }
}
