package com.nandi.stacks;

public class BalanceChecker {
	
	
	public static boolean check(String str) throws Exception

	{
		
		LinkedListStackChar stack =  new LinkedListStackChar();
		
		
		for( int i=0; i<str.length(); i++) {
			
			char x = str.charAt(i);
			
			if(x=='(' || x =='[' || x=='{') {
				stack.push(x);
				continue;
			}
			
				
		
			if(stack.isEmpty()) {
				return false;
			}
			
			char y;
			
			switch(x) {
			
			case ')':
				y= stack.pop();
				
				if(y=='{' || y=='[') return false;
				break;
				
			case '}':
				y= stack.pop();
				
				if(y=='(' || y=='[') return false;
				break;
				
			case ']':
				y= stack.pop();
				
				if(y=='(' || y=='{') return false;
				break;	
			}
			
			
		}
		return (stack.isEmpty());
		 
	}

	public static void main(String[] args) throws Exception {

		System.out.println(check("()(){}[]{"));
		
	}

}
