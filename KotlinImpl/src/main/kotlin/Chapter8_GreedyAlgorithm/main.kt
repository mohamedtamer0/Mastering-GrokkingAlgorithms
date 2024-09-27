package Chapter8_GreedyAlgorithm

fun main() {
    // إنشاء مجموعة المحطات وكل محطة بتغطي مدن معينة
    val stations = mapOf(
        "station1" to setOf("city1", "city2", "city3"),
        "station2" to setOf("city2", "city4"),
        "station3" to setOf("city4", "city5"),
        "station4" to setOf("city1", "city5")
    )

    // المدن اللي لازم تتغطى
    val cities = mutableSetOf("city1", "city2", "city3", "city4", "city5")

    // استدعاء دالة الحل
    val result = getMinimumStations(stations, cities)

    // طباعة النتيجة
    println("أقل مجموعة محطات تغطي كل المدن: $result")
}

fun getMinimumStations(stations: Map<String, Set<String>>, cities: MutableSet<String>): Set<String> {
    val finalStations = mutableSetOf<String>()
    
    // طول ما لسه فيه مدن متغطتش
    while (cities.isNotEmpty()) {
        var bestStation: String? = null
        var citiesCovered = emptySet<String>()

        for ((station, coverage) in stations) {
            val covered = cities.intersect(coverage)
            if (covered.size > citiesCovered.size) {
                bestStation = station
                citiesCovered = covered
            }
        }

        // ضيف المحطة الأفضل وامسح المدن اللي اتغطت
        if (bestStation != null) {
            cities.removeAll(citiesCovered)
            finalStations.add(bestStation)
        }
    }

    return finalStations
}
