package org.example.Chapter2

data class Node(var data: Int, var next: Node? = null) // Node data and link

class LinkedList {
    var head: Node? = null // Head of the list

    // Method to insert an element at the head
    fun insertAtHead(data: Int) {
        val newNode = Node(data)
        newNode.next = head // Link new node to the head
        head = newNode // Update head
    }

    // Method to print elements
    fun printList() {
        var current = head
        while (current != null) {
            print("${current.data} ") // Print node data
            current = current.next // Move to the next node
        }
    }
}

fun main() {
    val list = LinkedList()
    list.insertAtHead(1) // Adding 1
    list.insertAtHead(2) // Adding 2
    list.insertAtHead(3) // Adding 3

    // Print elements
    print("Elements: ")
    list.printList() // Output will be 3 2 1
}
