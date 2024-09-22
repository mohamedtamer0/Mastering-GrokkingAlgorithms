package org.example.BigONotation

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    println(getFirstElement(array)) // O(1)
}

fun getFirstElement(array: IntArray): Int {
    return array[0]
}
