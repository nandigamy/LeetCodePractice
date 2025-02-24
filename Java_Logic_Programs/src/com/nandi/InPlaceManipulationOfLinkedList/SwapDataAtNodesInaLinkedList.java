package com.nandi.InPlaceManipulationOfLinkedList;

import com.nandi.InPlaceManipulationOfLinkedList.DeleteNNodesAfterMNodes.Node;

public class SwapDataAtNodesInaLinkedList {

	static class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node swapDataAtNodes(Node head, int k) {

		Node temp = head;
		for (int i = 0; i < k-1; i++) {

			temp = temp.next;

		}

		Node begK = temp;

		Node temp1 = begK.next;
		Node start = head;

		while (temp1 != null) {

			start = start.next;
			temp1 = temp1.next;
		}

		Node endK = start;

		int dummy = endK.data;
		endK.data = begK.data;
		begK.data = dummy;

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

		head = swapDataAtNodes(head, 2);
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}
}
