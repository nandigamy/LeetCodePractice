package com.scott.stackandqueues;

public class MyQueueWithStacks {

	
	 private StackWithArray<Integer> stack1;
	 private StackWithArray<Integer> stack2;
	 
	 public MyQueueWithStacks() {
		 stack1 = new StackWithArray<>();
	        stack2 = new StackWithArray<>();
	 }
	
	 
	 public void enqueue(int value) {
			
		 while( !stack1.isEmpty()) {
			 stack2.push(stack1.pop());
		 }
			stack1.push(value);
			
			 while( !stack2.isEmpty()) {
				 stack1.push(stack2.pop());
			 }
			
		}

	 public Integer dequeue() {
		 if (stack1.isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        return stack1.pop(); // Simpl
	 }
	 
	 
	 
	 public int peek() {
	        return stack1.peek();
	    }

	    public boolean isEmpty() {
	        return stack1.isEmpty();
	    }
}
