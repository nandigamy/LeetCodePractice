package com.nandi.InPlaceManipulationOfLinkedList;

public class ReorderList {

    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reorderList(Node head) {
        if (head == null || head.next == null) return head;

        // Step 1: Find the middle of the list
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        Node secondHalf = reverseList(slow.next);
        slow.next = null; // Disconnect first half

        // Step 3: Merge two halves
        Node firstHalf = head;
        return mergeLists(firstHalf, secondHalf);
    }

    // Function to reverse a linked list
    private static Node reverseList(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Function to merge first and second halves
    private static Node mergeLists(Node first, Node second) {
        Node dummy = new Node(0);
//        Node temp = dummy;
//        boolean toggle = true;
//
//        while (first != null && second != null) {
//            if (toggle) {
//                temp.next = first;
//                first = first.next;
//            } else {
//                temp.next = second;
//                second = second.next;
//            }
//            temp = temp.next;
//            toggle = !toggle;
//        }

//        // Attach any remaining nodes
//        if (first != null) temp.next = first;
//        if (second != null) temp.next = second;
        
        Node current = dummy;

        while (first != null && second != null) {
            current.next = first;
            first = first.next;
            current = current.next; // Move forward

            current.next = second;
            second = second.next;
            current = current.next; // Move forward
        }

        // Attach any remaining nodes
        if (first != null) current.next = first;
       

        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        Node temp = head;
        for (int i = 1; i <= 5; i++) {
            temp.next = new Node(i);
            temp = temp.next;
        }

        head = reorderList(head);

        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
