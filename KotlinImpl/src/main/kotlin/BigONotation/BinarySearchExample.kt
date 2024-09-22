package org.example.BigONotation

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val index = binarySearch(array, 6)
    println("Index: $index") // O(log n)
}

fun binarySearch(array: IntArray, target: Int): Int {
    var left = 0
    var right = array.size - 1
    while (left <= right) {
        val mid = left + (right - left) / 2
        if (array[mid] == target) return mid
        if (array[mid] < target) left = mid + 1
        else right = mid - 1
    }
    return -1 // العنصر مش موجود
}
