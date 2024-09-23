package org.example.Chapter3_Recursion;

public class RecursionExample {

    public static int sum(int[] arr, int n) {
        // Base case: لو المصفوفة فاضية
        if (n <= 0) {
            return 0;
        }
        // Recursive case: جمع العنصر الأخير مع استدعاء الدالة مرة تانية للمصفوفة بدون العنصر الأخير
        return arr[n - 1] + sum(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sum(arr, arr.length)); // هتطبع 15
    }
}
