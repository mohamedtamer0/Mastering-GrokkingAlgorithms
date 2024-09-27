package org.example.Chapter6_BreadthFirstSearch;

import java.util.*;

public class BFSSearch {
    public static void main(String[] args) {
        // إنشاء الـ Graph كـ HashMap
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("Alice", Arrays.asList("Bob", "Claire", "Frank"));
        graph.put("Bob", Arrays.asList("Alice", "Peggy"));
        graph.put("Claire", Arrays.asList("Alice", "Thom", "Jonny"));
        graph.put("Frank", Arrays.asList("Alice"));
        graph.put("Peggy", Arrays.asList("Bob"));
        graph.put("Thom", Arrays.asList("Claire"));
        graph.put("Jonny", Arrays.asList("Claire"));

        // استدعاء دالة البحث
        System.out.println(bfsSearch(graph, "Alice", "Jonny"));
    }

    public static boolean bfsSearch(Map<String, List<String>> graph, String start, String target) {
        Queue<String> searchQueue = new LinkedList<>(graph.get(start));
        Set<String> searched = new HashSet<>(); // علشان نتجنب زيارة نفس العقدة مرتين

        while (!searchQueue.isEmpty()) {
            String person = searchQueue.poll(); // شيل العنصر من بداية الـ Queue
            if (!searched.contains(person)) { // لو العقدة دي متزارتش قبل كده
                if (person.equals(target)) { // لو لقينا الشخص المطلوب
                    return true;
                } else {
                    searchQueue.addAll(graph.getOrDefault(person, Collections.emptyList())); // ضيف أصدقاؤه للـ Queue
                    searched.add(person); // علم إن العقدة دي اتزارت
                }
            }
        }
        return false;
    }
}
