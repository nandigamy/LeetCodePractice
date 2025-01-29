package com.scott.stackandqueues;

public class StackTest {

	
	public static void main(String[] args) {

//		StackLL myStack = new StackLL(1);
//		
//		myStack.getTop();
//		myStack.getHeight();
//		myStack.printStack();
//		
//		myStack.push(2);
//		myStack.getTop();
//		myStack.getHeight();
//		myStack.printStack();
//		
//		myStack.push(3);
//		myStack.getTop();
//		myStack.getHeight();
//		myStack.printStack();
//		
//		myStack.pop();
//		myStack.getTop();
//		myStack.getHeight();
//		myStack.printStack();
		
		
		StackWithArray swa = new StackWithArray();
		
		swa.push(2);
		swa.push(4);
		swa.push(1);
		swa.push(3);
		
		
		//swa.sortStack(swa);
		
		
		 // Create a new queue
        MyQueueWithStacks q = new MyQueueWithStacks();

        // Enqueue some values
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        // Output the front of the queue
        System.out.println("Front of the queue: " + q.peek());

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + q.isEmpty());

System.out.println(q.dequeue());
		
		
		
		//swa.printStack();
		//System.out.println(swa.isBalancedParanthesis("(()}"));
	
	}
}
