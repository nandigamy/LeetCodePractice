package com.nandi.hashtables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	
	

	 static List<Integer> removeDuplicates(List<Integer> myList) {
		
		
    Set <Integer> uniqueSet = new HashSet<>();
    
    for( int i=0; i<myList.size(); i++) {
    	uniqueSet.add(myList.get(i));
    	
    }
		
		return new ArrayList<>(uniqueSet);
	}
	

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        List<Integer> newList = removeDuplicates(myList);
        System.out.println(newList);

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8, 9]

            (Order may be different as sets are unordered)
        */
        
    }


}
