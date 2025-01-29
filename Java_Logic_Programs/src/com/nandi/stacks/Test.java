package com.nandi.stacks;

public class Test {

	public static void main(String[] args) throws Exception {
  
		ArrayStack stack = new ArrayStack(5);
		
		stack.push(1);
		
		stack.push(2);
         
		stack.push(3);
		
		stack.push(4);
		
		stack.push(5);
		
		System.out.println(stack.isEmpty());
		
		System.out.println("stack size " + stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("stack size " + stack.size());
		
		System.out.println(stack.top());
		
		
		stack.printStack();
		
	}

}
