package com.scott.stackandqueues;

import java.util.ArrayList;

public class StackWithArray<T> {
	
	
	private ArrayList<T> stackList = new ArrayList<>();
	
	public ArrayList<T> getStackList(){
		
		return stackList;
	}
	
	public void printStack() {
		
		for(int i=stackList.size()-1;i>=0; i--) {
			System.out.println(stackList.get(i));
		}
	}
	
	public boolean isEmpty() {
		
		return  stackList.size()==0;
	}
	
	
	public T peek() {
		if(isEmpty()) {
			return null;
		}
		else {
			return stackList.get(stackList.size()-1);
		}
	}
	
	public int size() {
		return stackList.size();
	}
 
	public  void push(T value) {
		
		//ArrayList<T> stackList = new ArrayList<>();
		
		stackList.add( value);
		
	 }
	
	public T pop() {
		
		
		if(isEmpty()) {
			return null;
		}
		else {
			return stackList.remove(stackList.size()-1);
		}		
	}
	
	public  String reverseString( String str) {
		
		StackWithArray<Character> stackList = new StackWithArray<>();

		for( int i=0; i<str.length(); i++) {
			
			 stackList.push(str.charAt(i));
			}
				char[] reversed = new char[str.length()];
		
				int i=0;
				
				while(! stackList.isEmpty()) {
					
					reversed[i++]= stackList.pop();
				}
				
			return new String(reversed);
		
		}
	
	public boolean isBalancedParanthesis(String str) {
		
		
		StackWithArray<Character> stackList = new StackWithArray<>();

		for( int i=0; i<str.length(); i++) {
			
			 if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[') {
				 stackList.push(str.charAt(i));
			 }
			 
			 if(str.charAt(i)==')' || str.charAt(i)=='}' || str.charAt(i)==']') {
				 if(stackList.isEmpty()) {
					 return false;
				 }
				char c= stackList.pop();
				if(!(c=='(' && str.charAt(i)==')' || c=='{' && str.charAt(i)=='}'||  c=='[' && str.charAt(i)==']')) {
					return false;
				}
			 }
			}
		return stackList.isEmpty();
		
	}
	
	
	public boolean isBalancedParanthesisfn(String str) {
		
		StackWithArray<Character> stack = new StackWithArray<>();
		
		for( int i=0; i<str.length(); i++) {
			
			char ch= str.charAt(i);
			
			 if(ch=='(' || ch=='{' || ch=='[') {
				 
				 stack.push(ch);
					
			 }
			 else if(ch==')' || ch=='}' || ch==']') {
				 
				 if(stack.isEmpty()) {
					 return false;
				 }
				 
				 char top= stack.pop();
				 if(!isMatchingPair(top,ch)) {
					 return false;
				 }
				 
			 }
		}
		
		return stack.isEmpty();
		
	}

	private boolean isMatchingPair(char open, char close) {

		
		
		return (open=='(' && close==')') ||
				(open=='{' && close=='}')||
				(open=='[' && close==']');
	}
	
	
	
	public StackWithArray<Integer> sortStack(StackWithArray<Integer> stack){
		
		
		StackWithArray<Integer> newStack = new StackWithArray<>();
		
		while(!stack.isEmpty()) {
			
			int temp = stack.pop();	
			while(!newStack.isEmpty() && newStack.peek()>temp) {
			
				stack.push(newStack.pop());
			
			}
				newStack.push(temp);
		}
		
		
		
		 
		 while (!newStack.isEmpty()) {
			 
			 stack.push(newStack.pop());
		 } 
		 
		 
		 //printStackValues(stack);
		 
		 
		
		return stack;
		
		
	}

	private void printStackValues(StackWithArray<Integer> stack) {
		
		
		System.out.println("Sorted Stack:");
	    while (!stack.isEmpty()) {
	        System.out.println(stack.pop());
	    }
		
	}

	
//	public void enQueue(int value) {
//		
//		StackWithArray<Integer> stack1 = new StackWithArray<>();
//		stack1.push(value);
//		
//	}
	
	
}


