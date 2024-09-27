package Chapter10_KNearestNeighbors

fun main() {
    val dataPoints = arrayOf(
        doubleArrayOf(1.0, 2.0, 0.0), // Class 0
        doubleArrayOf(2.0, 3.0, 0.0), // Class 0
        doubleArrayOf(3.0, 1.0, 1.0), // Class 1
        doubleArrayOf(6.0, 5.0, 1.0)  // Class 1
    )

    val newPoint = doubleArrayOf(4.0, 4.0) // النقطة الجديدة
    val k = 3 // عدد الجيران
    val predictedClass = classify(dataPoints, newPoint, k)
    println("Predicted Class: $predictedClass")
}

fun classify(dataPoints: Array<DoubleArray>, newPoint: DoubleArray, k: Int): Int {
    dataPoints.sortBy { distance(it, newPoint) }
    val classVotes = IntArray(2) // Assuming 2 classes

    for (i in 0 until k) {
        val label = dataPoints[i][2].toInt() // Class label
        classVotes[label]++
    }

    return if (classVotes[0] > classVotes[1]) 0 else 1
}

fun distance(point1: DoubleArray, point2: DoubleArray): Double {
    return Math.sqrt(Math.pow(point1[0] - point2[0], 2.0) + Math.pow(point1[1] - point2[1], 2.0))
}
