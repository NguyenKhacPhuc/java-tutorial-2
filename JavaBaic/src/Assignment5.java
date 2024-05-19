import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        System.out.println("Enter a,b,c,d,e,f: ");
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        float f = sc.nextFloat();

        float D = a * e - d * b;
        float Dx = c * e - f * b;
        float Dy = a * f - d * c;

        if (D == 0) {
            if (Dy == 0) {
                System.out.println("VO NGHIEM");
            }else {
                System.out.println("VO NGHIEM");
            }
        }else {
            double x = (double) Dx / (double)D;
            double y = (double) Dy / (double)D;
            System.out.printf("%.3f %.3f", x ,y);
        }

    }
}
