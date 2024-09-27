package Chapter9_DynamicProgramming

fun main() {
    val values = intArrayOf(60, 100, 120)  // القيم
    val weights = intArrayOf(10, 20, 30)   // الأوزان
    val capacity = 50                      // الوزن الأقصى للشنطة

    val maxValue = knapsack(values, weights, capacity)
    println("أعلى قيمة ممكنة: $maxValue")
}

fun knapsack(values: IntArray, weights: IntArray, capacity: Int): Int {
    val n = values.size
    val dp = Array(n + 1) { IntArray(capacity + 1) }

    // بناء الجدول
    for (i in 1..n) {
        for (w in 0..capacity) {
            if (weights[i - 1] <= w) {
                // المقارنة بين أخذ العنصر الحالي أو تخطيه
                dp[i][w] = maxOf(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1])
            } else {
                dp[i][w] = dp[i - 1][w]
            }
        }
    }

    return dp[n][capacity]
}
