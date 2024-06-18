package org.example.Generic_Collections.Generic.EX3;

import java.util.*;
import java.io.*;

public class ArrayUtils {

    public static <T extends Comparable<T>> T max(T[] array) {
        T maximum = array[0];
        for (T element : array) {
            if (element.compareTo(maximum) > 0) {
                maximum = element;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        Integer[] arr1 = { 1, 2, 3, 4, 5 };
        System.out.println("Max in integer array: " + max(arr1));
        String[] arr2 = { "apple", "orange", "banana", "pear" };
        System.out.println("Max in string array: " + max(arr2));

    }
}