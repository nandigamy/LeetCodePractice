package com.scott.stackandqueues;

public class Queue {

	private Node first;
	private Node last;
	
	private int length;
	
	public Queue(int value) {
		Node newNode = new Node(value);
		first= newNode;
		last=newNode;
		length++;
		
	}
	
	public void printQueue() {
		Node temp = first;
		while(temp!= null) {
			System.out.println(" "+ temp.value);
			temp = temp.getNext();
		}
	}
	
	public void getFirst() {
		System.out.println("First "+ first.getValue());
	}
	
	public void getLast() {
		System.out.println("Last "+ last.getValue());
	}
	
	public void getLength() {
		System.out.println("Length "+ length);
	}
	
	public void enQueue(int value) {
		Node newNode = new Node(value);
		if(first==null) {
			first= newNode;
			last=newNode;
			length++;
		}
		
		last.setNext(newNode);
		last=newNode;
		length++;
		
	}
	
	public Node deQueue() {
		if(first==null) {
			System.out.println("queue is empty");
			return null;
		} else if(first.getNext()==null) {
			Node temp= first;
			first=null;
			last=null;
			length--;
			return temp;
		}
		else {
		Node temp= first;
		first= first.getNext();
		temp.setNext(null);
		length--;
		
		return temp;
		
		}
		
	}
}
