package org.example.BigONotation

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    val found = contains(array, 3)
    println("Found: $found") // O(n)
}

fun contains(array: IntArray, target: Int): Boolean {
    for (num in array) {
        if (num == target) return true
    }
    return false // العنصر مش موجود
}
