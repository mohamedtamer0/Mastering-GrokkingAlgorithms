package org.example.Chapter2_Selection_Sort;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Creating an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Reading elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Inserting an element at the end (in case of dynamic array)
        Integer[] integerArray = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(integerArray));
        list.add(6); // Adding an element at the end
        System.out.println("Elements after addition: " + list);
    }
}
