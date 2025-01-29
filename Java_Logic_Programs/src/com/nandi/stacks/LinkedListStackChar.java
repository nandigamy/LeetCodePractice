package com.nandi.stacks;

public class LinkedListStackChar {
	
	
	
	
	private ListNodeChar top;
	
	private int length;
	

	public int size() {
		
		return length;
	}

	
	public boolean isEmpty() {
		
		return (length==0);
	
	}
	
	
	public void push( char data) {
		
		ListNodeChar temp = new ListNodeChar();
		
		temp.setData(data);
		temp.setNext(top);
		
		top= temp;
	length++;
		
	}
	
	
	public char pop() throws Exception {
		
		if(isEmpty()) {
			
			throw new Exception("stack is empty");
		}
		
		char data= top.getData();
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
		
		ListNodeChar temp = top;
		
		while(temp!= null) {

		
			
			System.out.println(temp.getData());
			temp= temp.getNext();
			
			
		}
	}

}
