package com.nandi.InPlaceManipulationOfLinkedList;

public class ReverseLinkedListFromLeftToRight {

	static class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Dummy node to use .. incase left ==1 case point

	// reconnecting and moving forward

	public static Node reverseBetween(Node head, int left, int right) {

		Node temp = head;

		for (int i = 0; i < left - 2; i++) {

			temp = temp.next;
		}

		Node leftBefore = temp;
		Node prev = null;
		Node rightBefore = temp.next;

		Node curr = null;

		for (int j = 0; j < right && temp != null; j++) {

			curr = temp;
			temp = temp.next;
			curr.next = prev;

			prev = curr;

		}
		if (left == 1) {
			head = prev;

		} else {
			leftBefore.next = prev;
		}
		rightBefore.next = temp;
		return head;
	}

	public static Node reverseBetween2(Node head, int left, int right) {

		// traverse to left before -- use dumy node incase to reverse from head
		// take leftbefore and right after nodes
		// reverse between
		// connect

		Node dummy = new Node(100);
		dummy.next = head;

		Node temp = head;

		if (left == 1) {
			temp = dummy;
		} else {
			temp = head;
		}

		for (int i = 0; i < left - 2; i++) {

			temp = temp.next;
		}
		Node leftBefore = temp;
		System.out.println("leftBefore " + temp.data);
		Node rightBefore= temp;
		if (temp != null) {
			 rightBefore = temp.next;
			System.out.println("rightAfter " + temp.next.data);
		}
		//reversing
		temp= temp.next;
		System.out.println("revrseral first element " + temp.data);
		Node prev = null;
		Node curr = null;
		for( int j=0; j<right-left+1 &temp!=null; j++) { //window size is the miss--right-left+1
			
			curr= temp;
			temp= temp.next;
			curr.next=prev;
			
			prev= curr;
		
		}
		//System.out.println("revrseral last element " + temp.data);
		
		leftBefore.next=prev;
		rightBefore.next= temp;
		//connect with left and right
		

		return dummy.next;

	}
	
	
	//optimized version
	public static Node reverseBetween3(Node head, int left, int right) {

		// traverse to left before -- use dumy node incase to reverse from head
		// take leftbefore and right after nodes
		// reverse between
		// connect

		Node dummy = new Node(100);
		dummy.next = head;

		Node temp = dummy;

		
		for (int i = 0; i < left - 1; i++) {

			temp = temp.next;
		}
		Node leftBefore = temp;
		System.out.println("leftBefore " + temp.data);
		Node rightBefore= temp.next;
		
			System.out.println("rightbefore " + temp.next.data);
		
		//reversing
		temp= temp.next;
		System.out.println("revrseral first element " + temp.data);
		Node prev = null;
		Node curr = null;
		for( int j=0; j<right-left+1 &temp!=null; j++) { //window size is the miss--right-left+1
			
			curr= temp;
			temp= temp.next;
			curr.next=prev;
			
			prev= curr;
		
		}
		//System.out.println("revrseral last element " + temp.data);
		
		leftBefore.next=prev;
		rightBefore.next= temp;
		//connect with left and right
		

		return dummy.next;

	}
	
	public static Node reverseBetween4(Node head, int left, int right) {
		
		Node dummy = new Node(100);
		dummy.next = head;
		Node prev= dummy;
		
		for (int i = 0; i < left - 1; i++) {

			prev = prev.next;
		}
		
		Node curr= prev.next;
		
		for( int j=0; j<right-left ; j++) {
			
			Node nextNode = curr.next;
			curr.next=nextNode.next;
			nextNode.next=prev.next;
			prev.next=nextNode;
		}
		

		return dummy.next;
		
	}
	

	public static void main(String[] args) {
		Node head = new Node(1);
//		Node nd = new Node(1);
//		head.next = nd;

		for (int i = 2; i < 6; i++) {
			Node newNode = new Node(i);
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;

			}
			temp.next = newNode;

		}

		head = reverseBetween3(head, 1, 5);
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}
}
