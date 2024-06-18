package basicExceptionHandling;

public class ExceptionHanding {
    public static double divide(int a, int b) {
        try {
            return (double) a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error");
            return 0;
        }
    }

    public static int convertStringToInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println();
            return 0;
        }
    }
}
