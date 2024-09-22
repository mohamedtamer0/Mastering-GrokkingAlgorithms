package org.example.Chapter2;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Loop through the array
        for (int i = 0; i < n - 1; i++) {
            // Assume the first element is the smallest
            int minIndex = i;

            // Find the smallest element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update the index of the smallest element
                }
            }

            // Swap the smallest element with the first element in the unsorted part
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};
        System.out.println("Array before sorting:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        selectionSort(numbers); // Execute the sorting algorithm

        System.out.println("\nArray after sorting:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
