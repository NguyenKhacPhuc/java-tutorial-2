import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ax+by=c");
        System.out.println("dx+ey=f");

        System.out.println("Input a: ");
        float a = sc.nextFloat();
        System.out.println("Input b: ");
        float b = sc.nextFloat();
        System.out.println("Input c: ");
        float c = sc.nextFloat();
        System.out.println("Input d: ");
        float d = sc.nextFloat();
        System.out.println("Input e: ");
        float e = sc.nextFloat();
        System.out.println("Input f: ");
        float f = sc.nextFloat();

        float D = a * e - b * d;
        System.out.println("Result of D = a*e - b*d = " + D);
        if (D != 0) {
            System.out.println("The system has a unique solution, which can be computed as ");
            float x = (c * e - b * f) / (a * e - b * d);
            float y = (a * f - c * d) / (a * e - b * d);
            System.out.println("The x and y results of the ");
            System.out.println(a + "x+" + b + "y=" + c);
            System.out.println(d + "x+" + e + "y=" + f);
            System.out.printf("x = " + "%.2f", x);
            System.out.println();
            System.out.printf("y = " + "%.2f", y);
        } else {
            System.out.println("The system may either have no solution or infinitely many solutions");
        }

    }
}
