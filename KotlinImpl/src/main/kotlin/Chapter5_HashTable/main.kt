package Chapter5_HashTable

fun main() {
    val hashTable = mutableMapOf<String, Int>()

    // إضافة عناصر
    hashTable["Alice"] = 30
    hashTable["Bob"] = 25

    // الوصول لعناصر
    println("Alice's age: ${hashTable["Alice"]}")

    // التحقق من وجود مفتاح
    if ("Bob" in hashTable) {
        println("Bob's age: ${hashTable["Bob"]}")
    }
}
