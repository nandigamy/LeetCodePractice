package com.nandi.stacks;

public class StringReverser {
	
	public static String reverse(String str) throws Exception {
		
		LinkedListStackChar stack = new LinkedListStackChar();
		
		
		for( int i=0; i<str.length(); i++) {
			
			stack.push(str.charAt(i));
		}
		
		char[] reversed = new char[str.length()];
		
		int i=0;
		
		while(! stack.isEmpty()) {
			
			reversed[i++]= stack.pop();
		}
		
		return new String(reversed);
	}

	public static void main(String[] args) throws Exception {

		
		System.out.println(reverse("vineesha"));
	}

}
