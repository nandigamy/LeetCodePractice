package com.scott.LinkedList;

public class DoublyLinkedList {
	
	
	private DLLNode head;
	
	private DLLNode tail;
	
	private int length;
	
	public DoublyLinkedList(int value ) {
		
		DLLNode DNode = new DLLNode(value);
		head=DNode;
		tail=DNode;
		length=1;
	}
	
	public void printList() {
		
		DLLNode temp= head;
		while( temp!=null) {
			System.out.println(" "+ temp.getValue());
			temp = temp.getNext();
			
		}
	}
	
	public void getHead() {
		
		System.out.println("Head "+ head.getValue());
	}

	
	public void getTail() {
		
		System.out.println("Tail "+ tail.getValue());
	}
	
	public void getLength() {
		System.out.println("length "+ length);
	}
	
	
	public void append( int value)
	
	{
		DLLNode DNode = new DLLNode(value);
		
		if(head!=null) {
			
			
			tail.setNext(DNode);
			DNode.setPrev(tail);
			tail=DNode;
		}
		else {
			head=DNode;
			tail=DNode;
		}
		
		length++;
	}
	
	public DLLNode removeLast() {
		
		if (head==null) {
			
			return null;
		}else if (head.getNext()==null){
			
			DLLNode temp= head;
			head=null;
			tail=null;
			length--;
			return temp;
			
		}
		else {
		DLLNode temp= head;
		
		while(temp.getNext()!=null) {
			
			temp= temp.getNext();
		}
		
		tail= temp.getPrev();
		
		temp.setPrev(null);
		temp.setNext(null);
		tail.setNext(null);
		
		length--;
		return temp;
		}
		
	}
	
public DLLNode removeLastWithTail() {
		
		if (head==null) {
			
			return null;
		}else if (head.getNext()==null){
			
			DLLNode temp= head;
			head=null;
			tail=null;
			length--;
			return temp;
			
		}
		else {
		DLLNode temp= tail;
		
		
		
		tail= tail.getPrev();
		
		temp.setPrev(null);
		temp.setNext(null);
		tail.setNext(null);
		
		length--;
		return temp;
		}
		
	}


public void prepend( int value) {
	
	DLLNode DNode = new DLLNode(value);
	
	if(head==null) {
		
		head=DNode;
		tail=DNode;
	}
	else {
	
	DNode.setNext(head);
	head.setPrev(DNode);
	head=DNode;
	
	  }
	length++;
	
    }

public DLLNode removeFirst() {
	
	if(head==null) {
		return null;
	}
	else if( head.getNext()==null) {
		DLLNode temp = head;
		head= null;
		tail= null;
		length--;	
		return temp;		
	}
	
	else {
		DLLNode temp = head;
		head = head.getNext();
		temp.setNext(null);
		head.setPrev(null);
		length--;
		return temp;
		
		
	}
	
	
	
}




public boolean  set(int index, int value) {
	
	if(index<0 || index>length-1) {
		return false;
	}
	
	
DLLNode temp = head;
	

	
	if(index<length/2)
	{

	for(int i=0; i<index; i++) {
		temp = temp.getNext();
	}
	 temp.setValue(value);
	 
	 return true;
	}
	
	else {
		DLLNode tempTail = tail;
		for( int i=length-1; i>index; i--) {
			tempTail= tempTail.getPrev();
		}
	 tempTail.setValue(value);
	 return true;
	}
		
}


public DLLNode get(int index) {
	
	if(index<0 || index>=length) {
		return null;
	}
	
	
	
	
	DLLNode temp = head;
	
	DLLNode tempTail = tail;
	
	if(index<length/2)
	{

	for(int i=0; i<index; i++) {
		temp = temp.getNext();
	}
	return temp;
	}
	
	else {
		for( int i=length-1; i>index; i--) {
			tempTail= tempTail.getPrev();
		}
	return tempTail;
	}
	
}


public boolean insert( int index, int value) {
	
	if(index<0 || index>length) {
		return false;
	}
	
	DLLNode DNode = new DLLNode(value);
	
	if(index==0) {
		
		DNode.setNext(head);
		head.setPrev(DNode);
		head=DNode;
		length++;
		return true;
	}
	else if(index==length) {
		
		tail.setNext(DNode);
		DNode.setPrev(tail);
		tail= DNode;
		length++;
		return true;
	}
	
	else if(index<length/2) {
		DLLNode temp= head;
	

				for(int i=0; i<index; i++) {
					temp = temp.getNext();
				}
		
		DLLNode tempBefore= temp.getPrev();
		temp.setPrev(DNode);
		DNode.setNext(temp);
		tempBefore.setNext(DNode);
		DNode.setPrev(tempBefore);
		length++;
	    return true;
	}
	

	else  {
		DLLNode tempTail= tail;
			for( int i=length-1; i>index; i--) {
				tempTail= tempTail.getPrev();
			}
			
			DLLNode tempTailBefore= tempTail.getPrev();
			tempTail.setPrev(DNode);
			DNode.setNext(tempTail);
			tempTailBefore.setNext(DNode);
			DNode.setPrev(tempTailBefore);
			
			length++;
	        return  true;
	 }
	
//	else  {
//		
//		DLLNode temp= head;
//		
//			for(int i=0; i<index-1; i++) {
//				
//				temp= temp.getNext();
//			}
//		
//		DLLNode tempForward= temp.getNext();
//		temp.setNext(DNode);
//		DNode.setPrev(temp);
//		DNode.setNext(tempForward);
//		tempForward.setPrev(DNode);
//		length++;
//		return true;	
//				
//	}
	
	
	
	
	 
}


public DLLNode remove (int index) {
	
	if(index<0 || index>=length) {
		return null;
	}
	
	 if( index==0 && length>1) {
		DLLNode temp = head;
		head =head.getNext();
		temp.setNext(null);
		head.setPrev(null);
		
		length--;	
		return temp;		
	}
	 
	 else if(index==length-1 && length>1) {
			DLLNode tailBefore = tail.getPrev();
			DLLNode temp = tail;
			tailBefore.setNext(null);		
			tail= tailBefore;
			length--;
			return temp;
		}
			
		
	 else if(index==0 && length==1) {
		 DLLNode temp = head;
		 head= null;
		 tail= null;
		 length--;
		 return temp;	
	 }
	 else {
		 DLLNode temp = head;
		 for ( int i =0;i<index; i++) {
			 temp= temp.getNext();
		 }
		 
		 DLLNode before = temp.getPrev();
		 DLLNode after = temp.getNext();
		 before.setNext(after);
		 after.setPrev(before);
		 
		 temp.setNext(null);
		 temp.setPrev(null);
			length--;
		 return temp;
		 
	 }
	
	
}

public void swapFirstLast() {
	if(length<2) {
		return;
	}
	
	int newHead = tail.getValue();
	
	int newTail = head.getValue();
	
	head.setValue(newHead);
	
	tail.setValue(newTail);
	

}


public boolean palindromeCheck() {
	
	DLLNode tempHead= head;
	DLLNode tempTail = tail;
	
	while( tempHead!= null && tempTail!= null) {
		
		if(tempHead.getValue()!= tempTail.getValue()) {
			return false;
		}
		tempHead= tempHead.getNext();
		tempTail=tempTail.getPrev();
	}
	
	
	return true;
	
}

public void reverse() {
	
	
	
	DLLNode prev= null;
	
	DLLNode curr = null;
	
DLLNode prevTail= null;
	
	DLLNode currTail = null;
	
	while( head!= null && tail!=null ) {
		
		curr= head.getNext();
		
	    head.setNext(prev);
	   
	    prev=head;
	    
	    head= curr;
	    
	    
	    currTail =tail.getPrev();
	    tail.setPrev(prevTail);
	    prevTail= tail;
	    tail= currTail;
	    
	}
	
	head=prev;
	tail=prevTail;
}







public void nodeSwapByPair() {
	
	
if( head==null || head.getNext()==null) {
		
		System.out.println("List is too short to swap in pairs");
		return;

	}

//initialization

 DLLNode current = head;
 DLLNode newHead= null;
 DLLNode prevPairTail = null;
 
 while( current!= null && current.getNext()!= null) {
	 
	 //pairs initia
	 
	 DLLNode first = current;
	 DLLNode second = current.getNext();
	 DLLNode nextNodefirst = second.getNext();
	 
	 
	 //swap node in pairs
	 second.setNext(first);
	 first.setPrev(second);
	 
	 //connect this with the rest of the elements 
	 
	 if(nextNodefirst!= null) {
		 
		 first.setNext(nextNodefirst);
		 nextNodefirst.setPrev(first);
	 }
	 else {
		 first.setNext(null);
	 }
	 
	 
	 //update the head
	 if(newHead== null) {
		 newHead=second;
	 }
	 
	 //update the prevPair Tail connection
	 
	 if(prevPairTail!=null) {
		 prevPairTail.setNext(second);
		 second.setPrev(prevPairTail);
		 
	 }
		 
	
	 
	 
	 
	 //update prevPair tail
	 prevPairTail= first;
	 
	 //update first
	 current =nextNodefirst;
	 
 }
 //update head
 head= newHead;
	

}







public void nodeSwapInPairs() {
	
	if( head==null || head.getNext()==null) {
		
		System.out.println("List is too short to swap in pairs");
		return;

	}
	
	
	DLLNode current = head;
	DLLNode newHead= null; // To track the new head of the list 
	DLLNode prevPairTail= null; // to connect with prev pair 
	
	while(current != null && current.getNext()!= null) {
		
		DLLNode first =current; // First Node in the pair
		DLLNode second = current.getNext(); // Second Node in the pair
		DLLNode nextPairStartElement = second.getNext(); // start of the next pair
		
		
		// swap the pair
		
		second.setNext(first);
		first.setPrev(second);
		
		//update the connection to  the rest of the list
		
		if(nextPairStartElement !=null) {
			
			first.setNext(nextPairStartElement);
			nextPairStartElement.setPrev(first);
			
		} else {
			first.setNext(null);
		}
	
		
		//update the head for first swap
		if(newHead==null) {
			newHead= second;
		}
		
		
		//connect the prev swapped pair to  the current pair
		if(prevPairTail!=null) {
			prevPairTail.setNext(second);
			second.setPrev(prevPairTail);
			
		}
		
		
		//update the previous pair tail
		
		prevPairTail= first;
		
		
		//move to next pair
		
		current=nextPairStartElement;
		
		
	       
	
	}
	//updating head 
	head= newHead;
	

        }

}
