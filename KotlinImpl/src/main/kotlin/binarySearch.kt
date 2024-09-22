package org.example

fun binarySearch(arr: IntArray, target: Int): Int {
    var left = 0
    var right = arr.size - 1
    while (left <= right) {
        val mid = left + (right - left) / 2  // نحسب مكان النص
        when {
            arr[mid] == target -> return mid  // العنصر موجود في النص 🎯
            arr[mid] < target -> left = mid + 1  // العنصر أكبر، يبقى في النص التاني
            else -> right = mid - 1  // العنصر أصغر، يبقى في النص الأول
        }
    }
    return -1  // العنصر مش موجود ❌
}

fun main() {
    val arr = intArrayOf(1, 3, 5, 7, 9, 11, 13)
    println(binarySearch(arr, 7))  // النتيجة: 3 (العنصر موجود في الفهرس 3)
}
