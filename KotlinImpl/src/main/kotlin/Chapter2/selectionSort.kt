package org.example.Chapter2

fun selectionSort(arr: IntArray) {
    val n = arr.size

    // Loop through the array
    for (i in 0 until n - 1) {
        // Assume the first element is the smallest
        var minIndex = i

        // Find the smallest element in the unsorted part
        for (j in i + 1 until n) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j // Update the index of the smallest element
            }
        }

        // Swap the smallest element with the first element in the unsorted part
        if (minIndex != i) {
            val temp = arr[i]
            arr[i] = arr[minIndex]
            arr[minIndex] = temp
        }
    }
}

fun main() {
    val numbers = intArrayOf(64, 25, 12, 22, 11)
    println("Array before sorting:")
    numbers.forEach { print("$it ") }

    selectionSort(numbers) // Execute the sorting algorithm

    println("\nArray after sorting:")
    numbers.forEach { print("$it ") }
}
