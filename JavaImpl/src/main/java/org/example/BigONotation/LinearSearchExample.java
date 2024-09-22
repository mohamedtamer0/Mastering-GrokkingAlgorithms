package org.example.BigONotation;

public class LinearSearchExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        boolean found = contains(array, 3);
        System.out.println("Found: " + found); // O(n)
    }

    public static boolean contains(int[] array, int target) {
        for (int num : array) {
            if (num == target) return true;
        }
        return false; // العنصر مش موجود
    }
}
