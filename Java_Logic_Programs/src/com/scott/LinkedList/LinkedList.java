package com.scott.LinkedList;

public class LinkedList {
	
	private Node head;
	private Node tail;
	private int length;
	
	
	public LinkedList(int value) {
		
		Node newNode = new Node(value);
		head=newNode;
		tail=newNode;
		length=1;
		
	}

	
	public void getHead() {
		
		System.out.println("head "+ head.getValue());
		
		
	}

	
	public void getTail() {
		System.out.println("tail "+ tail.getValue());
		}

	

	public void  getLength() {
		 System.out.println("length "+ length);;
	}

	

	
	public  void printList() {
		
		Node temp = head;
		
		while( temp!= null) {
			
			System.out.println("LinkedList values "+ temp.getValue());
			temp= temp.getNext();
		}
	}
	
	public void append(int value) {
		
		Node appendedNode = new Node(value);
		if(length== 0) {
			head=appendedNode;
			tail= appendedNode;
		}
		
		else {
		
		tail.setNext(appendedNode);
		tail=appendedNode;
		
		}
		
		length++;
	}
	
	public void prepend(int value) {
		
		Node prependedNode = new Node(value);
		if(length==0)
		{
			head = prependedNode;
			tail= prependedNode;
			
		}
		else {
		prependedNode.setNext(head);
		head=prependedNode;
		}
		length++;
		
	}
	
	public Node removeFirst() {
		
		if(length==0) {
			return null;
		}
		
		Node temp= head;
		head= head.getNext();
		temp.setNext(null);
		length--;
		if(length==0) {
			tail=null;
		}
		return temp;
	}
	
	public Node get(int index) {
		
		if(index<0 ||index>length-1) {
			
			return null;
		}
		
		Node temp=head;
		
			
			for(int i=0; i<index; i++) {
				
				temp= temp.getNext();
			}
		
		return temp;
		
		
	}
	
	public boolean insert(int index, int value) {
		
        if(index<0 ||index>=length) {			
			return false;
		   }
        
        Node newNode = new Node(value);
        if(index==0) {
        	newNode.setNext(head);
        	head=newNode;
        	tail=newNode;
        	length++;
        	return true;
        }
        else if(index==length-1) {
        	tail.setNext(newNode);
        	tail= newNode;
        	length++;
        	return true;
        	
        	
        } else {
        	
        	 Node temp=head;
             
             for(int i=0; i<index-1; i++) {
     			
     			temp= temp.getNext();
     		}
        	
            // Node temp2 = temp.getNext().getNext();.getNext()
             newNode.setNext(temp.getNext());
             
             temp.setNext(newNode);
            
             length++;
             
             return true;
        	
        	
        }
        	
		
	}
	
	public Node remove(int index) {
		
		if(length==1) {
			Node temp=head;
			head=tail=null;
			length--;
			return temp;
		}
		
		if(index<0 || index>=length) {
			return null;
		}
		
		if(index==0 ) {
			
			Node temp= head;
			head= temp.getNext();
			temp.setNext(null);
			length--;
			return temp;
		}
		else if(index==length-1){
			
		Node temp= head;
		while(temp.getNext()!=tail)
		{
		temp= temp.getNext();
		}
		Node temp2= tail;
		temp.setNext(null);
	    tail=temp;
	    length--;
	    return temp2;
		}
		
		
		else  {
			
			Node temp= head;
			
			 for(int i=0; i<index; i++) {
	     			
	     			temp= temp.getNext();
	     		}
			 Node pre =temp.getNext();
			
			temp.setNext(temp.getNext().getNext());
			length--;
			
			return pre;
		}
		
		
		

	}
	
	
	public void reverse() {
		
		
		Node tempTail= head;
		
	
		Node prevNode= null;
		Node currNode= null;
	
		while( head!= null) {
			
			currNode= head.getNext();
			head.setNext(prevNode);
			prevNode=head;
			head= currNode;
			
			
		}
		head=prevNode;
		
		 tail= tempTail;
	}
	
	
	public void partitionList(int x) {
		
		if(head==null) {
			System.out.println("linkedlist is empty");
			return;
		}
		
		
		Node temp= head;
		Node smallDummy = new Node(-1);
		Node bigDummy = new Node(-1);
		Node smallHead= smallDummy;
		Node bigHead =bigDummy;
		
		while( temp!= null) {
			
			if(temp.getValue()<x) {
				
				
				
				smallHead.setNext(temp);;
				smallHead= smallHead.getNext();
				
				
			}
			else {
				bigHead.setNext(temp);
				bigHead= bigHead.getNext();
				
			}
			
			temp= temp.getNext();
			
			
			
		}
		bigHead.setNext(null);
		
		// the given below lines are master piece
		
		smallHead.setNext(bigDummy.getNext());
		head= smallDummy.getNext();
		
		
	}
	
public void reverseBetween(int m, int n) {
	
	
	if (m < 0 || n < 0 || m >= n) {
	    System.out.println("Invalid indices");
	    return;
	}
	
	if( head==null || head.getNext()==null || m==n) {
		System.out.println("nothing to revse");
		
		return;
	}
		
		Node temp= head;
		
		//traverse to m-1th node or handle case when m==1
		
		Node tempHeadBefore =null;
		
		for(int i=0; i<=m-1 && temp!=null; i++) {
			
			tempHeadBefore= temp;
			temp= temp.getNext();
		}
		
		//strating node of sublist
		
		 Node tempHead= (tempHeadBefore!= null) ?tempHeadBefore.getNext():head;
		 
			
		//Traverse to nth node
		Node tempTail= tempHead;
		for(int i=m; i<n && tempTail!=null ; i++) {
			
			tempTail=tempTail.getNext();
			
		
		}
		//node after sublist
		Node tempTailAfter= tempTail.getNext();
		
		
		Node rPrevNode=null;
		Node rCurrNode=null;
		Node rtempTail= tempHead;
		
		while(tempHead!= tempTailAfter) {
			rCurrNode =tempHead.getNext();
			tempHead.setNext(rPrevNode);
			rPrevNode= tempHead;
			tempHead=rCurrNode;
			
		}
		
		//tempHead=rPrevNode;
		
		if(tempHeadBefore!=null)
		{
		
		tempHeadBefore.setNext(rPrevNode);
		
		}
		
		else {
			head=rPrevNode;
		}
		rtempTail.setNext(tempTailAfter);
		
	}
	
	
	public boolean set(int index, int value) {
		
      if(index<0 ||index>length-1) {
			
			return false;
		}
      
      Node temp=head;
      

		for(int i=0; i<index; i++) {
			
			temp= temp.getNext();
		}
		
		temp.setValue(value);
		
		return true;
		
		
		
	}
	
	public Node findMiddleNode() {
		
		
	
		Node slowPtr= head;
		Node fastPtr =head;
		
		
		while(fastPtr!=null && fastPtr.getNext()!=null && fastPtr.getNext().getNext()!=null) {
			
			
			 
			 fastPtr= fastPtr.getNext().getNext();
			 slowPtr=slowPtr.getNext();
			 System.out.println("slowptr inside"+ slowPtr.getValue() ); 
			 System.out.println("fastptr"+ fastPtr.getValue() ); 
			
					
		}
		
		if(fastPtr!=null && fastPtr.getNext()!=null) {
			
			return slowPtr.getNext();
		}
		
		return slowPtr;
		
		
	}
	
	
	public boolean hasLoop() {
		
		Node slowPtr= head;
		Node fastPtr= head;
	
		
		while(fastPtr!=null && fastPtr.getNext()!=null && fastPtr.getNext().getNext()!=null) {
			
			 fastPtr= fastPtr.getNext().getNext();
			 slowPtr=slowPtr.getNext();
			 if(fastPtr==slowPtr) {
				 return true;
			 }
			
		}
		
		return false;
		
		
	}
	
	
	
	public Node findKthFromEnd(int k) {
		Node temp =head;
		
		if(  k<0) {
			return null;
		}
		
		Node kthNode=head;
		
		for( int i=0; i<k; i++) {
			
			temp= temp.getNext();
			if(temp==null) {
				return null;
			}
		}
		
		while(temp!=null) {
			
			kthNode=kthNode.getNext();
			temp= temp.getNext();
			
		}
		return kthNode;
}
	
	public void removeDuplicates() {
		
		Node temp = head;
		
		
		while(  temp!=null &&temp.getNext()!=null) {
			
		Node dupe=temp;
			while(dupe.getNext() != null  )  {
				
				if(temp.getValue()==dupe.getNext().getValue()) {
					
			        dupe.setNext( dupe.getNext().getNext());
					System.out.println("duplicate found"+ temp.getValue());
			    }
				else {
			       dupe= dupe.getNext();
				}
				
			}
			
			temp= temp.getNext();
		}
		
		
		
	}
	
	
	public int binaryToDecimal() {
		
		Node temp= head;
		
		int result =0;
		
		while(temp!=null) {
			
			result= result*2+ (temp.getValue());
			
			
			temp =temp.getNext();
		}
		
		
		return result;
		
		
	}
	
	public Node removeLast() {
		
		Node temp = head;
		Node pre=null;
		if(length==0) {
			
			System.out.println("linkedlist is emoty");
			return temp;
		}
		else if ( length==1) {
			
			
			head= null;
			tail= null;
			length--;
			return temp;
		}
		
		else {
		
		while(temp.getNext()!=tail) {
			temp= temp.getNext();
		}
		
		 pre= temp.getNext();
		temp.setNext(null);
		tail=temp;
		length--;
		return pre;
	   }
	
	

 }
	
}
