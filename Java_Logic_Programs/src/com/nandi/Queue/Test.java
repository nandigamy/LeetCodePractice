package com.nandi.Queue;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws Exception {

	
	ArrayQueue aq = new ArrayQueue(5);
	aq.enQueue(1);
	aq.enQueue(2);
	aq.enQueue(3);
	aq.enQueue(4);
	aq.enQueue(5);
	
	aq.printQueue();
	
	aq.deQueue();
	aq.printQueue();
	aq.enQueue(6);
	
	aq.printQueue();
	
	System.out.println("peek" + aq.peek());
	
	}

}
