package org.example.BigONotation

fun main() {
    val array = intArrayOf(5, 3, 8, 1, 2)
    bubbleSort(array)
    println("Sorted: ${array.joinToString(", ")}") // O(n²)
}

fun bubbleSort(array: IntArray) {
    val n = array.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (array[j] > array[j + 1]) {
                // Swap
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}
