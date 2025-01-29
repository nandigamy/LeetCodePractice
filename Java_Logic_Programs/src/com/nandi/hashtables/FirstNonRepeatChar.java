package com.nandi.hashtables;

import java.util.HashMap;

public class FirstNonRepeatChar {


	
	private static Character firstNonRepeatingChar(String string) {
		
		
		char[] charArray = string.toCharArray();
		
		HashMap<Character, Integer> charMap = new HashMap<>();
		
		for ( char ch: charArray) {
			
			charMap.put(ch, charMap.getOrDefault(ch, 0)+1);
		}
		
		for ( char ch: charArray) {
			if(charMap.get(ch)==1) {
				return ch;
			}
		}
		
		

		return  null;
	}
	
	
	public static void main(String[] args) {

		    System.out.println(firstNonRepeatingChar("leetcode"));
	        System.out.println(firstNonRepeatingChar("hello"));
	        System.out.println(firstNonRepeatingChar("aabbcc"));
	        
		
	}

	

}
