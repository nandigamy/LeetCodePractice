package com.scott.stackandqueues;

public class StackLL {
	
private	Node top;
private int height;

public StackLL(int value) {
	
	Node newNode = new Node(value);
	top=newNode;
	height=1;
	
}
	

public void printStack() {
	
	Node temp = top;
	
	while( temp!= null) {
		System.out.println(" "+ temp.getValue());
		temp= temp.getNext();
	}
}
	
public void getTop() {
	
	System.out.println("top " + top.getValue());
	
}

public void getHeight() {
	
	System.out.println("height "+height);
}

public void push(int value) {
	
	Node newNode = new Node(value);
	if(top==null) {	
		top=newNode;
		height=1;
		return;
	}
	
	newNode.setNext(top);
	top= newNode;
	height++;
	
	
}

public Node pop() {
	if(top==null) {
		return null;
	}
	Node temp = top;
	top = top.getNext();
	temp.setNext(null);
	height--;
	return temp;
	
}

}
