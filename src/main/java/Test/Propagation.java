package Test;

public class Propagation {
    static void method1() throws Exception {
        throw new Exception("method1");
    }

    static void method2() {
        try {
            method1();
        }catch(Exception e) {
            System.out.println("Exception 2: " + e.getMessage());
        }
    }

    static void method3() throws Exception{
        method2();
    }
}
