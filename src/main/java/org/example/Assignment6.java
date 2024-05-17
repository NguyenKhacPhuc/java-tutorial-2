package org.example;

import java.util.Scanner;

public class Assignment6 {
    public static void task6(String[] args) {
        int dem = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap day ky tu: ");
        String a = scanner.nextLine();
        for (int i = (a.length() - 1); i >= 0; i--) {
            if (a.charAt(i) == ' ') {
                if (dem > 0)
                    break;
            } else
                dem = dem + 1;
        }
        System.out.println("so ky tu trong chu cai cuoi cung la " + dem);
    }
}
