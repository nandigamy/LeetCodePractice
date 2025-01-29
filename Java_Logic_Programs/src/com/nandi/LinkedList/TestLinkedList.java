package com.nandi.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		SingleLinkedList singleLinkedList = new SingleLinkedList();
		
		singleLinkedList.create(1);
		
		singleLinkedList.create(2);
		
		singleLinkedList.create(3);
		
		
	//	singleLinkedList.traverse();
		
	singleLinkedList.insertAtBeginning(0);

	//singleLinkedList.traverse();
		
		//singleLinkedList.insertAfter(2, 10);
		
		
	singleLinkedList.insertAtEnd(4);
		
		//singleLinkedList.traverse();
		
		
		
		
		//singleLinkedList.reverse();
		
		//singleLinkedList.traverse();
		//singleLinkedList.deleteNodeAtBeginning();
		
	
		singleLinkedList.deleteMatchingNode(10);
		singleLinkedList.traverse();
		
		
		
		
		
		
	}

}
