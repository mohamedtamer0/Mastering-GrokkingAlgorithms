package org.example.Chapter4_QuickSort;

public class QuickSort {

    // دالة لتنفيذ Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // نحصل على موقع التقسيم (Pivot)
            int pi = partition(arr, low, high);

            // تطبيق Quick Sort على الجزء اللي على الشمال من الـ Pivot
            quickSort(arr, low, pi - 1);

            // تطبيق Quick Sort على الجزء اللي على اليمين من الـ Pivot
            quickSort(arr, pi + 1, high);
        }
    }

    // دالة لتقسيم المصفوفة واختيار الـ Pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // هنا اخترنا آخر عنصر كـ Pivot
        int i = (low - 1); // مؤشر للتقسيم

        for (int j = low; j < high; j++) {
            // لو العنصر الحالي أصغر من الـ Pivot
            if (arr[j] < pivot) {
                i++;
                // نبدل العنصر الحالي مع العنصر عند i
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // نبدل العنصر اللي بعد العنصر الأكبر مع الـ Pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("المصفوفة بعد الترتيب : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
