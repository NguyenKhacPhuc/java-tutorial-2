package org.example;

public class Task4 {
    static void demchu() {
        int dem = 0;
        String str = "The quick brown fox jumps over the lazy dog";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                dem = dem + 1;
        }
        System.out.println("Có" + dem + "ky tu");
    }
}
