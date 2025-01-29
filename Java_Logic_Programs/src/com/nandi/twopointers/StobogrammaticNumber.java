package com.nandi.twopointers;

import java.util.HashMap;
import java.util.Map;

public class StobogrammaticNumber {
	
	
	
	public static boolean isStrobogrammatic (String num) {
	
	
	Map<Character, Character> dict = new HashMap<>();
	dict.put('0', '0');
	dict.put('1', '1');
	dict.put('6', '9');
	dict.put('8', '8');
	dict.put('9', '6');
	
	int left=0;
	int right= num.length()-1;
	
	while(left<=right) {
		
		
		if(!dict.containsKey(num.charAt(right)) ||num.charAt(left)!= dict.get(num.charAt(right))){
			
			return false;
			
		}else {
			left++;
			right--;
		}
	}
	
   
      // Replace this placeholder return statement with your code
        return true;
    }
	
	public static void main( String[] args) {
		System.out.println(isStrobogrammatic("828"));
	}
}
