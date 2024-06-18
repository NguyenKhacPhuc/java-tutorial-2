package multipleExceptions;

public class MultipleExceptions {
    public static void processInput(String input) {
        try {
            int number = Integer.parseInt(input);

            System.out.println("Input number: " + number);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Input is not a valid integer.");

        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Input is null.");
        }
    }
}
