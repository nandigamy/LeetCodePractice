package com.nandi.Queue;

import java.util.Arrays;

public class ArrayQueue {
	
	private int[] queue;
	
	int size;
	int capacity;
	int front;
	int rear;
	
	public ArrayQueue(int capacity) {
		
		queue = new int[capacity];
		this.capacity=capacity;
		size=0;
		front =0;
		rear =0;	
	}
	
	public boolean isEmpty() {
		
		
		return (size==0);
		
		
	}
	
	
	public boolean isFull() {
		
		return ( size==capacity);
	}
	
	
	public void enQueue(int data) throws Exception {
		
		if(isFull()) {
			throw new Exception("Queue is full");
		}
		
//		if( rear== capacity) {
//			rear=0;
//		}
		
		System.out.println("adding data " + data + "at rear");
		queue[rear]=data;
		rear = (rear+1)% capacity;
		size++;
	}
	
	public int deQueue() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Queue is empty");
		}
		
//		if(front==capacity) {
//			front=0;
//		}
		int result = queue[front];
		System.out.println("data deleted at" +front);
	
		
		//front++;
		
		front = (front+1)% capacity;
		
		size--;
		
		
		return result;
		
	}
	
	public void printQueue() {
		
		
		if( isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		
		System.out.println("Queue:");
		
		for ( int i=0; i<size; i++) {
			System.out.print( queue[(front+i)%capacity] + " ");
		}
		
		System.out.println();
	}
	
	public int peek() {
		if( isEmpty()) {
			System.out.println("Queue is empty");
			
		}
		
		return queue[front];
	}

}
