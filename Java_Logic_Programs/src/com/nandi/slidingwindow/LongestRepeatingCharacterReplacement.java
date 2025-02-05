package com.nandi.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement { 
	
	
	public static int longestRepeatingCharacterReplacement(String s, int k) {
		
		int i=0, j=0;
		int maxLength=0, maxFreq=0;
		Map<Character, Integer> map = new HashMap<>();
		while( j< s.length()) {
			map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
			maxFreq= Math.max(map.get(s.charAt(j)), maxFreq);
			
			
			while( j-i+1 - maxFreq >k) {
				
				map.put(s.charAt(i), map.get(s.charAt(i))-1);
				
			
				i++;
			}
			
			maxLength= Math.max(maxLength, j-i+1);
			j++;
			
		}
		
		
		return maxLength;
	}

	public static void main(String[] args) {
		
		System.out.println(longestRepeatingCharacterReplacement("lmno",2));

	}

}
