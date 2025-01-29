package com.nandi.Queue;

public class TestListQueue {

	public static void main(String[] args) throws Exception {

		ListQueueImpl lq= new ListQueueImpl();
		
		lq.enQueue(10);
		lq.enQueue(20);
		lq.enQueue(30);
		lq.enQueue(40);
		
		lq.traverse();
		
		lq.deQueue();
		
		lq.traverse();
		
		lq.deQueue();
		
		lq.traverse();
	}

}
