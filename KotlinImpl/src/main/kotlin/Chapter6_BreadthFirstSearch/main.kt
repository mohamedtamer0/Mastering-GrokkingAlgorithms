package Chapter6_BreadthFirstSearch

import java.util.ArrayDeque

fun main() {
    // إنشاء الـ Graph كـ Map
    val graph = mutableMapOf(
        "Alice" to listOf("Bob", "Claire", "Frank"),
        "Bob" to listOf("Alice", "Peggy"),
        "Claire" to listOf("Alice", "Thom", "Jonny"),
        "Frank" to listOf("Alice"),
        "Peggy" to listOf("Bob"),
        "Thom" to listOf("Claire"),
        "Jonny" to listOf("Claire")
    )

    // استدعاء دالة البحث
    println(bfsSearch(graph, "Alice", "Jonny"))
}

fun bfsSearch(graph: Map<String, List<String>>, start: String, target: String): Boolean {
    val searchQueue = ArrayDeque(graph[start]) // إنشاء الـ Queue
    val searched = mutableSetOf<String>() // علشان نتجنب زيارة نفس العقدة مرتين

    while (searchQueue.isNotEmpty()) {
        val person = searchQueue.removeFirst() // شيل العنصر من بداية الـ Queue
        if (person !in searched) { // لو العقدة دي متزارتش قبل كده
            if (person == target) { // لو لقينا الشخص المطلوب
                return true
            } else {
                searchQueue.addAll(graph[person].orEmpty()) // ضيف أصدقاؤه للـ Queue
                searched.add(person) // علم إن العقدة دي اتزارت
            }
        }
    }
    return false
}
