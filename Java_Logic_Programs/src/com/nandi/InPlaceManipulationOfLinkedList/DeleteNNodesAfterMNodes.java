package com.nandi.InPlaceManipulationOfLinkedList;

public class DeleteNNodesAfterMNodes {

	static class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node deleteNNodesAfterMNodes(Node head, int m, int n) {

		if (head == null || m == 0)
			return head;

		Node temp = head;

		while (temp != null) {
			for (int i = 0; i < m - 1 && temp != null; i++) {

				temp = temp.next;
			}

			if (temp == null || temp.next == null)
				return head;

			Node current = temp.next;

			for (int i = 0; i < n && current != null; i++) {

				current = current.next;

			}
			temp.next = current;

			temp = temp.next;

		}

		return head;
	}

	public static Node deleteNNodesAfterMNodes2(Node head, int m, int n) {

		if (head == null || m == 0)
			return head;

		Node temp = head;

		while (temp != null) {
			// M nodes movement
			for (int i = 0; i < m - 1 && temp != null; i++) {
				temp = temp.next;

			}
			
			if( temp== null || temp.next==null) return head;

			Node current= temp.next; //missed-- as it is a multiple loop
			for (int i = 0; i < n & current!= null; i++) {

				// delete n nodes
				current= current.next;

			}
			 temp.next= current; //missed

			temp = temp.next;

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

		head = deleteNNodesAfterMNodes(head, 1, 1);
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}
