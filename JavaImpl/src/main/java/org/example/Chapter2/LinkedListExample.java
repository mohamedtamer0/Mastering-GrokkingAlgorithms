package org.example.Chapter2;

class Node {
    int data; // Node data
    Node next; // Link to the next node

    Node(int d) {
        data = d;
        next = null; // Initialize next as null
    }
}

class LinkedList {
    Node head; // Head of the list

    // Method to insert an element at the head
    void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Link new node to the head
        head = newNode; // Update head
    }

    // Method to print elements
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " "); // Print node data
            current = current.next; // Move to the next node
        }
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(1); // Adding 1
        list.insertAtHead(2); // Adding 2
        list.insertAtHead(3); // Adding 3

        // Print elements
        System.out.print("Elements: ");
        list.printList(); // Output will be 3 2 1
    }
}
