package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment1 {
        public static void find(int[] array, int k) {
            Arrays.sort(array);
            for (int i = (array.length - 1); i > (array.length - k - 1); i--) {
                System.out.println(array[i]);
            }
        }

        public static void run() {
            int[] array = new int[]{1, 4, 17, 7, 25, 3, 100};
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap k: ");
            int k = scanner.nextInt();
            System.out.println("k: " + k);
            find(array, k);
        }
    }
}
