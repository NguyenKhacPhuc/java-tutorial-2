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
        float D = a * e - d * b;
        float Dx = c * e - f * b;
        float Dy = a * f - d * c;

        System.out.println("Result of D = a*e - b*d = " + D);
        if (D == 0) {
            if (Dx == 0)
                System.out.println("Countless solutions");
            else
                System.out.println("No solution");
        } else {
            double x = (double) Dx / (double) D;
            double y = (double) Dy / (double) D;
            System.out.printf("%.2f %.2f", x, y);
        }

    }
}
