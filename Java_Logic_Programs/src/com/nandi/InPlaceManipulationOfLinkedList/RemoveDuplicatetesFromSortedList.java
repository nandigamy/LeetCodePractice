package com.nandi.InPlaceManipulationOfLinkedList;

public class RemoveDuplicatetesFromSortedList {

	static class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node removeDuplicatetesFromSortedList(Node head) {

		Node temp = head;

		while (temp != null && temp.next != null) {
			if (temp.data == temp.next.data) {
				temp.next = temp.next.next;
			} else {

				temp = temp.next;
			}

		}

		return head;
	}

	public static void main(String[] args) {

		Node head = new Node(0);
		Node nd = new Node(1);
		head.next = nd;

		for (int i = 1; i < 5; i++) {
			Node newNode = new Node(i);
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;

			}
			temp.next = newNode;

		}

		head = removeDuplicatetesFromSortedList(head);

		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}
