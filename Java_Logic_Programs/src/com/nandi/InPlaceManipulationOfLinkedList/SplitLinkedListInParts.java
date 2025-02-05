package com.nandi.InPlaceManipulationOfLinkedList;


public class SplitLinkedListInParts {

	static class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	//core logic --decouple it after n/k and compute the remaining 
	

	public static Node[] splitListToParts(Node head, int k) {
		Node[] ans = new Node[k];
		if( head== null) return ans;

		Node temp = head;
		int n = 0;
		while (temp != null) {
			n++;
			temp = temp.next;
		}
		System.out.println("length " + n);

		
		Node curr = head;

		int baseSize = n / k;
		int remaining= n%k;

		for( int i=0; i<k; i++) {
			
			ans[i]=curr;
			
         int  sizeOfCurrentPart= baseSize+(i<remaining?1:0); // crucial  missing piece
			for( int j=0; j<sizeOfCurrentPart-1 && curr!=null; j++) {
				
				curr= curr.next;
			}
			if(curr!=null) {
			Node temp1=curr.next;
			curr.next=null;
			
			curr=temp1;
			}
			
		}
         
		
		

	return ans;

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

		splitListToParts(head,4);
		// head = deleteNNodesAfterMNodes(head, 1, 1);
//		Node temp = head;
//		while (temp != null) {
//			System.out.println(temp.data);
//			temp = temp.next;
//		}

	}
}
