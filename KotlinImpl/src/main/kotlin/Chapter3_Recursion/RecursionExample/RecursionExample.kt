package org.example.Chapter3_Recursion.RecursionExample

fun sum(arr: IntArray, n: Int): Int {
    // Base case: لو المصفوفة فاضية
    if (n <= 0) {
        return 0
    }
    // Recursive case: جمع العنصر الأخير مع استدعاء الدالة مرة تانية للمصفوفة بدون العنصر الأخير
    return arr[n - 1] + sum(arr, n - 1)
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    println(sum(arr, arr.size)) // هتطبع 15
}
