package com.nandi.Queue;

public class ListQueueImpl {
	
	private ListNode front;
	private ListNode rear;
	private int size;
	
	public boolean isEmpty() {
		
		return ( size==0);
	}
	
	public int size() {
		
		return size;
	}

	
	public void enQueue(int data) {
		
		ListNode node = new ListNode();
	
		
		node.setData(data);
		
		if(isEmpty()) {
			front= node;
		}
		else {
			rear.setNext(node);
		}
		
		rear=node;
		
		size++;
		
	}
	
	public int deQueue() throws Exception {
		

		if(isEmpty()) {
		
		
			throw new Exception("Queue is empty already");
		}
		
		
		int result = front.getData();
		
		front= front.getNext();
		
		
		size--;
		
		if(isEmpty()) {
			
			rear= null;
		}
		
		return result;
		
	}
	
	public int peek() {
		if( isEmpty()) {
			System.out.println("Queue is empty");
			
		}
		
		return front.getData();
	}
	
	public void traverse() {
		
		ListNode temp =front;
		while(temp!= null) {
			
			System.out.println(temp.getData());
			temp= temp.getNext();
		}
	}
}
