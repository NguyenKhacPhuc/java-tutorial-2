package org.example;

public class Assigment8 {
    public static void run() {
        int[] a = new int[]{10, 11, 12, 13, 14, 0, 7, 8, 9, 1, 2, 3};
        for (int i = 0; i < (a.length - 1); i++) {
            int n = i;
            while (a[i + 1] == (a[i] + 1)) {
                i++;
                if (i == a.length - 1)
                    break;
            }
            if (i != n)
                System.out.println(a[n] + "->" + a[i]);
            if (a[i - 1] != (a[i] - 1))
                System.out.println(a[i]);
        }
    }
}
