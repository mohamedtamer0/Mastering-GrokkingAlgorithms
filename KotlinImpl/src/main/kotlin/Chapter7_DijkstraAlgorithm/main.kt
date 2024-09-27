package Chapter7_DijkstraAlgorithm

fun main() {
    // إنشاء الـ Graph كـ Map
    val graph = mutableMapOf(
        "start" to mutableMapOf("a" to 6, "b" to 2),
        "a" to mutableMapOf("fin" to 1),
        "b" to mutableMapOf("a" to 3, "fin" to 5),
        "fin" to mutableMapOf<String, Int>()
    )

    // استدعاء دالة Dijkstra
    val costs = dijkstra(graph, "start")

    // طباعة النتائج
    println("أقصر مسافة لكل عقدة: $costs")
}

fun dijkstra(graph: Map<String, Map<String, Int>>, start: String): Map<String, Int> {
    val costs = mutableMapOf<String, Int>().withDefault { Int.MAX_VALUE }
    val parents = mutableMapOf<String, String?>()
    val processed = mutableSetOf<String>()

    // تعيين المسافات الأولية
    costs[start] = 0

    var node = getLowestCostNode(costs, processed)
    while (node != null) {
        val cost = costs.getValue(node)
        val neighbors = graph.getValue(node)

        for ((neighbor, weight) in neighbors) {
            val newCost = cost + weight
            if (newCost < costs.getValue(neighbor)) {
                costs[neighbor] = newCost
                parents[neighbor] = node
            }
        }

        processed.add(node)
        node = getLowestCostNode(costs, processed)
    }

    return costs
}

fun getLowestCostNode(costs: Map<String, Int>, processed: Set<String>): String? {
    var lowestCost = Int.MAX_VALUE
    var lowestCostNode: String? = null

    for ((node, cost) in costs) {
        if (cost < lowestCost && node !in processed) {
            lowestCost = cost
            lowestCostNode = node
        }
    }

    return lowestCostNode
}
