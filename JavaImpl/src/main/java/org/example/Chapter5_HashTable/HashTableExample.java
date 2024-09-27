package org.example.Chapter5_HashTable;

import java.util.HashMap;

public class HashTableExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashTable = new HashMap<>();

        // إضافة عناصر
        hashTable.put("Alice", 30);
        hashTable.put("Bob", 25);

        // الوصول لعناصر
        System.out.println("Alice's age: " + hashTable.get("Alice"));
        
        // التحقق من وجود مفتاح
        if (hashTable.containsKey("Bob")) {
            System.out.println("Bob's age: " + hashTable.get("Bob"));
        }
    }
}
