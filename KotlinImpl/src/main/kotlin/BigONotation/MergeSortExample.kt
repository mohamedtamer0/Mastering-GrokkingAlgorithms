package org.example.BigONotation

fun main() {
    val array = intArrayOf(5, 3, 8, 1, 2)
    mergeSort(array)
    println("Sorted: ${array.joinToString(", ")}") // O(n log n)
}

fun mergeSort(array: IntArray) {
    if (array.size < 2) return

    val mid = array.size / 2
    val left = array.copyOfRange(0, mid)
    val right = array.copyOfRange(mid, array.size)

    mergeSort(left)
    mergeSort(right)
    merge(array, left, right)
}

fun merge(array: IntArray, left: IntArray, right: IntArray) {
    var i = 0
    var j = 0
    var k = 0
    while (i < left.size && j < right.size) {
        if (left[i] <= right[j]) {
            array[k++] = left[i++]
        } else {
            array[k++] = right[j++]
        }
    }
    while (i < left.size) array[k++] = left[i++]
    while (j < right.size) array[k++] = right[j++]
}
