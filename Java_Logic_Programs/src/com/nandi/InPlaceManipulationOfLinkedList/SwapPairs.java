package com.nandi.InPlaceManipulationOfLinkedList;


public class SwapPairs {
	
	static class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node swapPairs(Node head) {
		
		if(head==null || head.next == null) return head;

		Node temp = head;
		Node dummyPrev = new Node(100);

		Node curr = temp;
		if (curr != null && curr.next != null) {

			Node Next = curr.next;
			curr.next= Next.next;
			Next.next= curr;
			dummyPrev.next=Next;
			
		}
		
		head=dummyPrev.next;
		
		
		
		Node prev= head.next;
		if (prev!=null) curr=prev.next;
		while (curr != null && curr.next != null) {

			Node Next = curr.next;
			//swap
			curr.next= Next.next;
			Next.next= curr;
			prev.next=Next;
			
			//move forward
			prev=curr;
			curr= curr.next;
		}
	    return head;
	  }

	
public static Node swapPairs2(Node head) {
		
		if(head==null || head.next == null) return head;
//does not handle edge cases-- where there are only two nodes
		
		Node curr= head;
		head= curr.next;
		Node prev= curr;
		while (curr != null && curr.next != null) {

			Node Next = curr.next;
			//swap
			curr.next= Next.next;
			Next.next= curr;
			prev.next=Next;
			
			//move forward
			prev=curr;
			curr= curr.next;
		}
	    return head;
	  }

	

public static Node swapPairsFinal(Node head) {
    if (head == null || head.next == null) return head;

    // Dummy node acts as a placeholder before head
    Node dummy = new Node(0);
    dummy.next = head;
    Node prev = dummy;

    while (head != null && head.next != null) {
        Node first = head;
        Node second = head.next;

        // Swapping
        first.next = second.next;
        second.next = first;
        prev.next = second;

        // Move pointers forward
        prev = first;
        head = first.next;
    }
    
    return dummy.next;
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

		 head = swapPairs(head);
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}

//Dummy Node
//reassigning
