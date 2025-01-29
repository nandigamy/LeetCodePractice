package com.scott.LinkedList;

public class Node {
	
	
	private int value;
	private Node next;
	
	public Node(int data) {
		
		
		this.value = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int data) {
		this.value = data;
	}
	

}
