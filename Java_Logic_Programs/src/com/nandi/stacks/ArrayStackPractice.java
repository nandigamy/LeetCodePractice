package com.nandi.stacks;

public class ArrayStackPractice {
	
	private int[] stack;
	
	private static int capacity=10;
	
	private int top=-1;
	
	//size, is empty, push, pop  and top
	
	public ArrayStackPractice() {
		
		this(capacity);
	}

	public ArrayStackPractice(int capacity) {
        
		this.capacity= capacity;
	
	
	}
	
	
	public int size() {
		
		
		
		//return stack.length;
		
		return top+1;
		
		
		
		
	}
	
	public boolean isEmpty() {
		
		
		
		return top<0;
		
	}
	
	
	public void push( int data) throws Exception {
		
		if(size()== capacity) {
			
			throw new Exception("stack is full");
		}
		
		stack[++top]=data;
	}
	
	public int pop() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("stack is empty");
			
		}
		
		int data = stack[top];
		 top--;
		
		 return data;
		
		
	}
	
	
	
public int top() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("stack is empty");
			
		}
		return stack[top];
		
		


}

}
