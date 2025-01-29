package com.scott.stackandqueues;

public class QueueTest {

	public static void main(String[] args) {

		
		Queue myQueue= new Queue(1);
		
		myQueue.getFirst();
		myQueue.getLast();	
		myQueue.getLength();
		myQueue.printQueue();
		
		myQueue.enQueue(2);
		myQueue.getFirst();
		myQueue.getLast();	
		myQueue.getLength();
		myQueue.printQueue();
		
		myQueue.enQueue(3);
		myQueue.getFirst();
		myQueue.getLast();	
		myQueue.getLength();
		myQueue.printQueue();
		
		myQueue.deQueue();
		myQueue.getFirst();
		myQueue.getLast();	
		myQueue.getLength();
		myQueue.printQueue();
		
		myQueue.deQueue();
		myQueue.getFirst();
		myQueue.getLast();	
		myQueue.getLength();
		myQueue.printQueue();
		
	
		
		
	}

}
