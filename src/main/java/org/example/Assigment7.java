package org.example;

import java.util.Scanner;

public class Assigment7 {
    public static void task7() {
        int[] array = new int[]{7, 1, 5, 3, 6, 4};
        int min = array[0];
        int profit = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
            if (array[i] - min > profit)
                profit = array[i] - min;
        }
        System.out.println(min);
        System.out.println(profit);
    }
}

