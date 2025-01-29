package com.scott.LinkedList;

public class DLLNode {
	
	
	private int value;
	private DLLNode next;
	private DLLNode prev;
	
public DLLNode(int value) {
		
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public DLLNode getNext() {
		return next;
	}

	public void setNext(DLLNode next) {
		this.next = next;
	}

	public DLLNode getPrev() {
		return prev;
	}

	public void setPrev(DLLNode prev) {
		this.prev = prev;
	}

	

}
