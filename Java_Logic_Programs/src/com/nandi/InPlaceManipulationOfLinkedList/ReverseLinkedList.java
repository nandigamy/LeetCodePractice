package com.nandi.InPlaceManipulationOfLinkedList;

public class ReverseLinkedList {

	static class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node reverse(Node head) {
		// Replace this placeholder return statement with your code

		Node curr = null;
		Node prev = null;
		Node temp = head;

		while (temp != null) {
			curr = temp;
			temp = temp.next;
			curr.next = prev;
			prev = curr;

		}
		head = prev;
		return head;
	}

	public static Node removeElements(Node head, int k) {

		while (head != null && head.data==k) {
			head= head.next;
		}

		Node temp = head;

		while (temp != null && temp.next!=null) {

			if (temp.next.data == k) {
				temp.next = temp.next.next;
			}
			else {
				temp = temp.next;
			}

		}

		return head;
	}
	
	
	public static Node removeElements2(Node head, int k) {
		
		
		Node dummy=new Node(0);
		dummy.next=head; //missed
		Node prev=dummy; 
		Node curr= head;
		
		while(curr!= null) {
			
			
			if(curr.data==k) {
				prev.next= curr.next;
				curr= prev.next;
				
			}else {
				
				prev=curr;
				curr=curr.next;
				
			}
			
			
		}
		
		
		
		return dummy.next;//missed
		
	}

	public static void main(String[] args) {

		Node head = new Node(0);
		Node nd = new Node(1);
		head.next=nd;

		for (int i = 1; i < 5; i++) {
			Node newNode = new Node(i);
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;

			}
			temp.next = newNode;

		}

		// head= reverse( head);

		head = removeElements2(head, 1);

		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}
