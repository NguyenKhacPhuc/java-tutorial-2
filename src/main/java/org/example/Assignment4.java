package org.example;

public class Assignment4 {
    public static void task4() {
        int[] array = new int[]{10, 11, 12, 13, 14,15, 7, 8, 9, 1, 2, 3};
        int dem = 1;
        int max = 0;
        int tb = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] == array[i + 1] - 1) {
                dem = dem + 1;
                tb = dem;
                if (max < tb)
                    max = tb;
            } else dem = 1;
        }
        System.out.println(max);
    }
}
