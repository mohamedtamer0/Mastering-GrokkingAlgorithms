package org.example;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;  // نحسب مكان النص
            if (arr[mid] == target)  // العنصر موجود في النص 🎯
                return mid;
            if (arr[mid] < target)  // العنصر أكبر، يبقى في النص التاني
                left = mid + 1;
            else  // العنصر أصغر، يبقى في النص الأول
                right = mid - 1;
        }
        return -1;  // العنصر مش موجود ❌
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        System.out.println(binarySearch(arr, 7));  // النتيجة: 3 (العنصر موجود في الفهرس 3)
    }

}
