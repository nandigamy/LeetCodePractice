package com.scott.LinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {

		
		DoublyLinkedList myDLL = new DoublyLinkedList(1);
		
		myDLL.getHead();
		myDLL.getTail();
		myDLL.getLength();
		myDLL.printList();
		
		 myDLL.append(2);
		 
		 System.out.println("after appending");
		 
			myDLL.printList();
			myDLL.getHead();
			myDLL.getTail();
			myDLL.getLength();
			
			
			 myDLL.append(3);
			 myDLL.append(4);
			// myDLL.append(5);
			 
			 System.out.println("after appending");
			 
				myDLL.printList();
				myDLL.getHead();
				myDLL.getTail();
				myDLL.getLength();
				
//				System.out.println("after removing last node");
//				System.out.println("last node value " + myDLL.removeLastWithTail().getValue());
//				
//				myDLL.printList();
//				myDLL.getHead();
//				myDLL.getTail();
//				myDLL.getLength();
				
				
				
				System.out.println("after prepending ");
				
				//myDLL.prepend(0);
				
				
				myDLL.printList();
				myDLL.getHead();
				myDLL.getTail();
				myDLL.getLength();
				
//				System.out.println("after removing first");
				
//			System.out.println(	"first value " + myDLL.removeFirst().getValue());
//			myDLL.printList();
//			myDLL.getHead();
//			myDLL.getTail();
//			myDLL.getLength();
				
				//System.out.println(myDLL.get(2).getValue());
				//myDLL.set(4, 5);
				
//				System.out.println(myDLL.remove(4));
//				myDLL.printList();
//				myDLL.getHead();
//				myDLL.getTail();
//				myDLL.getLength();
//				
//				myDLL.insert(4, 4);
//				
//				myDLL.printList();
//				myDLL.getHead();
//				myDLL.getTail();
//				myDLL.getLength();
//				
//				System.out.println("after first and alst swap");
//				
//myDLL.swapFirstLast();
				
//				myDLL.printList();
//				myDLL.getHead();
//				myDLL.getTail();
//				myDLL.getLength();
//				
//				System.out.println(myDLL.palindromeCheck());
//				
//				myDLL.reverse();
//				
//				myDLL.printList();
//				myDLL.getHead();
//				myDLL.getTail();
//				myDLL.getLength();
				
				
//	myDLL.nodeSwapInPairs();
	myDLL.nodeSwapByPair();
				
				myDLL.printList();
				myDLL.getHead();
				myDLL.getTail();
				myDLL.getLength();
				
				
			
	}

}
