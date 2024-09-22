package org.example.BigONotation;

public class BigOExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(getFirstElement(array)); // O(1)
    }

    public static int getFirstElement(int[] array) {
        return array[0];
    }
}
