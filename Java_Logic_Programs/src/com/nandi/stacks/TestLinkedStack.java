package com.nandi.stacks;

public class TestLinkedStack {

	public static void main(String[] args) throws Exception {
	
		LinkedListStack lls = new LinkedListStack();
	
	
	lls.push(10);
	
	lls.push(20);
	lls.push(30);
	lls.push(40);
	
	
	lls.traverse();
	
	lls.pop();
	
	System.out.println("after pop");
	lls.traverse();
	
	
lls.pop();
	
	System.out.println("after pop");
	lls.traverse();
	
	System.out.println("after peak");
	
	System.out.println(lls.peek());
	System.out.println(lls.isEmpty());
	
	System.out.println(lls.size());
	
	
	}

}
