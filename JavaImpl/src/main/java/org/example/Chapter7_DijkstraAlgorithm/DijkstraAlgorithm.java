package org.example.Chapter7_DijkstraAlgorithm;

import java.util.*;

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        // إنشاء الـ Graph كـ HashMap
        Map<String, Map<String, Integer>> graph = new HashMap<>();
        graph.put("start", Map.of("a", 6, "b", 2));
        graph.put("a", Map.of("fin", 1));
        graph.put("b", Map.of("a", 3, "fin", 5));
        graph.put("fin", Collections.emptyMap());

        // استدعاء دالة Dijkstra
        Map<String, Integer> costs = dijkstra(graph, "start");

        // طباعة النتائج
        System.out.println("أقصر مسافة لكل عقدة: " + costs);
    }

    public static Map<String, Integer> dijkstra(Map<String, Map<String, Integer>> graph, String start) {
        Map<String, Integer> costs = new HashMap<>();
        Map<String, String> parents = new HashMap<>();
        Set<String> processed = new HashSet<>();

        // تعيين المسافات الأولية
        for (String node : graph.keySet()) {
            if (node.equals(start)) {
                costs.put(node, 0);
            } else {
                costs.put(node, Integer.MAX_VALUE); // تعيين قيمة لانهائية لباقي العقد
            }
        }

        String node = getLowestCostNode(costs, processed);
        while (node != null) {
            int cost = costs.get(node);
            Map<String, Integer> neighbors = graph.get(node);

            for (Map.Entry<String, Integer> neighbor : neighbors.entrySet()) {
                int newCost = cost + neighbor.getValue();
                if (newCost < costs.get(neighbor.getKey())) {
                    costs.put(neighbor.getKey(), newCost);
                    parents.put(neighbor.getKey(), node);
                }
            }

            processed.add(node);
            node = getLowestCostNode(costs, processed);
        }

        return costs;
    }

    private static String getLowestCostNode(Map<String, Integer> costs, Set<String> processed) {
        int lowestCost = Integer.MAX_VALUE;
        String lowestCostNode = null;

        for (Map.Entry<String, Integer> entry : costs.entrySet()) {
            int cost = entry.getValue();
            if (cost < lowestCost && !processed.contains(entry.getKey())) {
                lowestCost = cost;
                lowestCostNode = entry.getKey();
            }
        }

        return lowestCostNode;
    }
}
