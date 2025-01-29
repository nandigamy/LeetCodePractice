package com.nandi.stacks;

import java.util.Arrays;

public class ArrayStack {
	
	private int[] stack;
	
	private static int capacity =10;
	
	private int top =-1;
	
	public ArrayStack() {
		
		this(capacity);
		
	}
	
	public ArrayStack(int capacity) {
		
		stack = new int[capacity];
	}

	
	public int size() {
		
		return top+1;
	}

	
	public boolean isEmpty() {
		
//		int size= stack.length;
//		if(size==0) {
//			
//			return true;
//		}
//		
//		
//		
//		
//		
//		return false;
		
		
		return top<0;
		
		
		
	}
	
	public void push(int data) throws Exception {
		
		if(size()==stack.length) {
			System.out.println(" Stack is full");
			
			throw new Exception("stack is overflowed");
		}
		
		stack[++top]=data;
	}
	
	
	public int pop() throws Exception {
		
		
		if( isEmpty()) {
			throw new Exception("stack is empty");
		}
		int data= stack[top];
		stack[top]= Integer.MIN_VALUE;
		top--;
		return data;
		
	}
	
	
	public int top() throws Exception {
		
		
		if( isEmpty()) {
			throw new Exception("stack is empty");
		}
		
		
		return stack[top];
		
		
		
	}
	
	public void printStack() {
		System.out.println(Arrays.toString(stack));
	}
}
