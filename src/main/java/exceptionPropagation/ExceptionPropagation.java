package exceptionPropagation;

public class ExceptionPropagation {
    public static void method1() throws Exception {
        throw new Exception("Exception thrown in method1");
    }

    public static void method2() {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Exception caught in method2: " + e.getMessage());
        }
    }

    public static void method3() throws Exception {
        method2();
    }
}
