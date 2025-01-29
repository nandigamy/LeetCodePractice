package com.nandi.fastandslowpointers;

import java.util.Random;

public class SplitCircularLinkedList {

    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class CircularLinkedList {
        Node head = null;
        Node tail = null;

        // Function to insert a new node at the end
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
            tail.next = head; // Making it circular
        }

        // Function to display the circular linked list
        public void display() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            Node temp = head;
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("(Back to Head: " + head.data + ")");
        }
    }

    // Placeholder for splitting logic (to be implemented by you)
    public static Node[] splitCircularLinkedList(Node head) {
    	Node temp= head;
    	
    	//while
    	
        return new Node[]{null, null}; // Return two empty lists as placeholders
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        Random rand = new Random();

        // Insert 6 random digits (0-9)
        for (int i = 0; i < 6; i++) {
            cll.insert(rand.nextInt(10));  // Random number between 0-9
        }

        // Display the circular linked list
        cll.display();
    }
}
