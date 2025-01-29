package com.nandi.stacks;

public class LinkedListStack {
	
	
	
	
	private ListNode top;
	
	private int length;
	

	public int size() {
		
		return length;
	}

	
	public boolean isEmpty() {
		
		return (length==0);
	
	}
	
	
	public void push( int data) {
		
		ListNode temp = new ListNode();
		
		temp.setData(data);
		temp.setNext(top);
		
		top= temp;
	length++;
		
	}
	
	
	public int pop() throws Exception {
		
		if(isEmpty()) {
			
			throw new Exception("stack is empty");
		}
		
		int data= top.getData();
		top= top.getNext();
		length--;
		return data;
		
		
	}
	
	public int peek() throws Exception {
		

		if(isEmpty()) {
			
			throw new Exception("stack is empty");
		}
		
		return top.getData();
	}
	
	public void traverse () {
		
		ListNode temp = top;
		
		while(temp!= null) {

		
			
			System.out.println(temp.getData());
			temp= temp.getNext();
			
			
		}
	}

}
