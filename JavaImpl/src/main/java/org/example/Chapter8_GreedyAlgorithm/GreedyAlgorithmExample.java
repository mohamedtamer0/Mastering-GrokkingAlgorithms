package org.example.Chapter8_GreedyAlgorithm;

import java.util.*;

public class GreedyAlgorithmExample {
    public static void main(String[] args) {
        // إنشاء مجموعة المحطات وكل محطة بتغطي مدن معينة
        Map<String, Set<String>> stations = new HashMap<>();
        stations.put("station1", new HashSet<>(Arrays.asList("city1", "city2", "city3")));
        stations.put("station2", new HashSet<>(Arrays.asList("city2", "city4")));
        stations.put("station3", new HashSet<>(Arrays.asList("city4", "city5")));
        stations.put("station4", new HashSet<>(Arrays.asList("city1", "city5")));

        // المدن اللي لازم تتغطى
        Set<String> cities = new HashSet<>(Arrays.asList("city1", "city2", "city3", "city4", "city5"));

        // استدعاء دالة الحل
        Set<String> result = getMinimumStations(stations, cities);

        // طباعة النتيجة
        System.out.println("أقل مجموعة محطات تغطي كل المدن: " + result);
    }

    public static Set<String> getMinimumStations(Map<String, Set<String>> stations, Set<String> cities) {
        Set<String> finalStations = new HashSet<>();
        
        // طول ما لسه فيه مدن متغطتش
        while (!cities.isEmpty()) {
            String bestStation = null;
            Set<String> citiesCovered = new HashSet<>();

            for (Map.Entry<String, Set<String>> station : stations.entrySet()) {
                Set<String> covered = new HashSet<>(cities);
                covered.retainAll(station.getValue()); // المدن اللي المحطة دي بتغطيها
                if (covered.size() > citiesCovered.size()) {
                    bestStation = station.getKey();
                    citiesCovered = covered;
                }
            }

            // ضيف المحطة الأفضل وامسح المدن اللي اتغطت
            if (bestStation != null) {
                cities.removeAll(citiesCovered);
                finalStations.add(bestStation);
            }
        }

        return finalStations;
    }
}
