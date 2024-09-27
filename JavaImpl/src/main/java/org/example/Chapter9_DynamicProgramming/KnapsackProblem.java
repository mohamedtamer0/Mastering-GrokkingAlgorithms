package org.example.Chapter9_DynamicProgramming;

public class KnapsackProblem {
    public static void main(String[] args) {
        int[] values = {60, 100, 120};  // القيم
        int[] weights = {10, 20, 30};   // الأوزان
        int capacity = 50;              // الوزن الأقصى للشنطة

        int maxValue = knapsack(values, weights, capacity);
        System.out.println("أعلى قيمة ممكنة: " + maxValue);
    }

    public static int knapsack(int[] values, int[] weights, int capacity) {
        int n = values.length;
        int[][] dp = new int[n + 1][capacity + 1];

        // بناء الجدول
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    // المقارنة بين أخذ العنصر الحالي أو تخطيه
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }
}
