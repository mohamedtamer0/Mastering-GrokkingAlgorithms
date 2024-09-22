package org.example.BigONotation;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2};
        bubbleSort(array);
        System.out.println("Sorted: " + Arrays.toString(array)); // O(n²)
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
