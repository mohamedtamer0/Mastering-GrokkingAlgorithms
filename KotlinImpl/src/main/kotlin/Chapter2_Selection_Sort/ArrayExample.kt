package Chapter2_Selection_Sort

fun main() {
    // Creating an array
    val numbers = arrayOf(1, 2, 3, 4, 5)

    // Reading elements
    for (i in numbers.indices) {
        println("Element at index $i: ${numbers[i]}")
    }

    // Inserting an element at the end
    val list = numbers.toMutableList() // Convert array to a mutable list
    list.add(6) // Adding an element at the end
    println("Elements after addition: $list")
}
