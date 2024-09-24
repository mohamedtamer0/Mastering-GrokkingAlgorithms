package org.example.Chapter4_QuickSort

fun quickSort(arr: IntArray, low: Int, high: Int) {
    if (low < high) {
        // نحصل على موقع التقسيم (Pivot)
        val pi = partition(arr, low, high)

        // تطبيق Quick Sort على الجزء اللي على الشمال من الـ Pivot
        quickSort(arr, low, pi - 1)

        // تطبيق Quick Sort على الجزء اللي على اليمين من الـ Pivot
        quickSort(arr, pi + 1, high)
    }
}

fun partition(arr: IntArray, low: Int, high: Int): Int {
    val pivot = arr[high] // اخترنا آخر عنصر كـ Pivot
    var i = low - 1

    for (j in low until high) {
        if (arr[j] < pivot) {
            i++
            // نبدل العنصر الحالي مع العنصر عند i
            arr[i] = arr[j].also { arr[j] = arr[i] }
        }
    }

    // نبدل العنصر اللي بعد العنصر الأكبر مع الـ Pivot
    arr[i + 1] = arr[high].also { arr[high] = arr[i + 1] }
    return i + 1
}

fun main() {
    val arr = intArrayOf(10, 7, 8, 9, 1, 5)
    quickSort(arr, 0, arr.size - 1)

    println("المصفوفة بعد الترتيب:")
    arr.forEach { print("$it ") }
}
