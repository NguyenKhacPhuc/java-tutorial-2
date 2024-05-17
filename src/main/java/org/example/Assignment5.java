package org.example;

import java.util.Scanner;

public class Assignment5 {
    public static void tim() {
        System.out.println("Nhập a,b,c,d,e,f");
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
            if (Dx == 0)
                System.out.println("VOSONGHIEM");
            else
                System.out.println("VONGHIEM");
        } else {
            double x = (double) Dx / (double) D;
            double y = (double) Dy / (double) D;
            System.out.printf("%.2f %.2f", x, y);
        }
    }

    public static void run(String[] args) {
        tim();

    }
}
