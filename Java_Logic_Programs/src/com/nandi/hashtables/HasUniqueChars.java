package com.nandi.hashtables;

import java.util.HashSet;
import java.util.Set;

public class HasUniqueChars {

	
	
	 static boolean hasUniqueChars(String string) {

		 char [] ch = string.toCharArray();
		 
		 Set <Character> uniqueChars = new HashSet<>();
		 
		 for( char c: ch) {
			 
			 if(uniqueChars.contains(c)) {
				 return false;
			 }
			 uniqueChars.add(c);
		 }
		 
		 
		 return true;
	}
    
	
	
	public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false
            
        */
        
    }

	
	
	
}
