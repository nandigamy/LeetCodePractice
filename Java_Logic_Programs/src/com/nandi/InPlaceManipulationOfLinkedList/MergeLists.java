package com.nandi.InPlaceManipulationOfLinkedList;


public class MergeLists {

    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Creating List A: 1 → 3 → 5
        Node headA = new Node(1);
        Node tempA = headA;
        for (int i = 3; i <= 5; i += 2) {
            tempA.next = new Node(i);
            tempA = tempA.next;
        }

        // Creating List B: 2 → 4 → 6
        Node headB = new Node(2);
        Node tempB = headB;
        for (int i = 4; i <= 6; i += 2) {
            tempB.next = new Node(i);
            tempB = tempB.next;
        }

        // Printing the lists before merging
        System.out.println("List A:");
        printList(headA);
        System.out.println("List B:");
        printList(headB);

        // Call merge function
        Node mergedHead = mergeLists(headA, headB);

        // Print merged list
        System.out.println("Merged List:");
        printList(mergedHead);
    }

    // Function to merge two lists alternately
    public static Node mergeLists(Node headA, Node headB) {
        // Your logic goes here!
        return null; // Placeholder, replace with merged list logic
    }

    // Helper function to print a linked list
    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
