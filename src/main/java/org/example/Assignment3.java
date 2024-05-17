package org.example;

public class Assignment3 {
    public static void task3() {
        String inputstring = "The quick brown fox jums over the lazy dog";
        String[] words;
        words = inputstring.split(" ");
        for (int i = (words.length - 1); i >= 0; i--) {
            System.out.print(words[i]+ " ");
        }
    }
    public static void run() {
        task3();
    }
}
