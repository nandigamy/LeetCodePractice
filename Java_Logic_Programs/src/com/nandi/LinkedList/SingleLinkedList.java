package com.nandi.LinkedList;

public class SingleLinkedList {
	
	private ListNode head;
	
	private ListNode tail;
	
	
	public void create( int data) {
		
		ListNode newNode = new ListNode();
		
		newNode.setData(data);
		
		newNode.setNext(null);
		
		
		if( head== null) {
		head= newNode;
		
		tail = newNode;
		}
		
		else {
			
//			ListNode temp = head;
//			
//			while( temp.getNext()!= null) {
//				
//				temp = temp.getNext();
//			}
//			
//			temp.setNext(newNode);
			
			tail.setNext(newNode);
			
			tail= newNode;
			
		}
	}
	
	
	public void traverse() {
		
		 ListNode currentNode = head;
		 while( currentNode!= null) {
			 
			 System.out.println("data  " + currentNode.getData());
			 System.out.println("value  " + currentNode.getNext());
			 
			 currentNode = currentNode.getNext();
		 }
		 
		 
		
		
	}
	
	
	public void insertAtBeginning(int data) {
		
		
		if( head== null) {
			
			
			ListNode newNode = createNewNode(data);
			head= newNode;
			
			tail = newNode;
			}
			
			else {
		
		ListNode temp = head;
		
		ListNode newNode = new ListNode();
		newNode.setData(data);
		newNode.setNext(temp);
		
		head= newNode;
			}
		
		
	}


	private ListNode createNewNode(int data) {
		ListNode newNode = new ListNode();
		newNode.setData(data);
		newNode.setNext(null);
		return newNode;
	}
	
	
	public void insertAtEnd(int data) {
		
		ListNode newNode = createNewNode(data);
		
		
		if( head== null) {
			head= newNode;
			
			tail = newNode;
			}
			
			else {
		
		tail.setNext(newNode);
		
		tail = newNode;
		
			}
		
	}
	
	
	public void insertAfter( int position, int data) {
		
		ListNode newNode = createNewNode(data);
		
		if( head== null ) {
			head= newNode;
			
			tail = newNode;
			}
		
		else if ( position ==0) {
			
			
			ListNode temp = newNode;
			
			temp.setNext(head);
			head = temp;
		}
		
		
		else {
			
			ListNode temp = head;
			
			for ( int i=1; i<position; i++) {
				
				temp= temp.getNext();
			}
			
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
			
			
		}
		
	}
	
	
	
	public void reverse() {
		
		
		//ListNode currentNode = head;
		//ListNode tempTail = tail;
		
		ListNode prevNode = null;
		ListNode nextNode = null;
		
		while( head!= null) {
			
			
			nextNode= head.getNext();
			head.setNext(prevNode);
			
			prevNode =head;
			head= nextNode;
			
			
		}
		
		head=prevNode;
		

	}
	
	
	public void reversePractice(){
		
		ListNode prevNode= null ;
				ListNode	 currentNode = null;
		
		while( head!= null) {
			
			currentNode= head.getNext();
			head.setNext(prevNode);
			prevNode=head;
			head= currentNode;
			
		}
		
		head= prevNode;
		
	}
	
	
	public boolean hasLoop() {
		
		ListNode slowPtr=head, fastPtr= head;
		while( slowPtr!= null && fastPtr!= null && fastPtr.getNext()!= null) {
			
			slowPtr= slowPtr.getNext();
			fastPtr= fastPtr.getNext().getNext();
			if( slowPtr== fastPtr) {
				return true;
			}
		}
		
		
		return false;
		
	}
	
	public void deleteNodeAtBeginning() {
		
		if( head== null) {
			System.out.println(" the list is empty");
		}
		
		else {
			
			ListNode temp = head;
			head= temp.getNext();
			temp.setNext(null); 
		}
	}
	
	
	public void deleteMatchingNode(int data) {
		if( head== null) {
			System.out.println(" the list is empty");
		} else if ( head.getData()==data) {
			ListNode temp= head;
			head= temp.getNext();
			temp.setNext(null);
			
		} else {
			
			
			ListNode currentNode = head;
			ListNode targetNode=head.getNext();
			while( targetNode !=null && targetNode.getData()!=data ) {
				
				targetNode = targetNode.getNext();
				currentNode =currentNode.getNext();
				
			}
			
			if( targetNode == null) {
				
				System.out.println("Node with data not found");
				return;
			}
			currentNode.setNext(currentNode.getNext().getNext());
			targetNode.setNext(null);
			
			
			
		}
		
	}

	
	public void reversePractice2() {
		ListNode prevNode= null;
		ListNode currentNode = null;
		
		while( head!= null) {
			
			currentNode= head.getNext();
			head.setNext(prevNode);
			prevNode =head;
			head=currentNode;
		}
		
		head=prevNode;
	}
	
	public void clearList() {
		
		head =null;
	}
}



