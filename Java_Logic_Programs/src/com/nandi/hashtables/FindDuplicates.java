package com.nandi.hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicates {
	
	
	
	private static List<Integer> findDuplicates(int[] nums) {

		
		HashMap<Integer, Integer> countMap= new HashMap<>();
		List<Integer> duplicates = new ArrayList<>();
		
		for( int num: nums) {
			
			if(countMap.containsKey(num)) {
				
				int currentCount = countMap.get(num);
				countMap.put(num, currentCount+1);
			} else {
				countMap.put(num, 1);
			}
		}
		
		for ( HashMap.Entry<Integer,Integer> entry: countMap.entrySet()) {
			if(entry.getValue()>1) {
				duplicates.add(entry.getKey());
			}
		}
		
		return duplicates;
	}
	
	private static List<Integer> findDuplicatesOptimized(int[] nums) {
		
		HashMap<Integer, Boolean> countMap= new HashMap<>();
		List<Integer> duplicates = new ArrayList<>();
		
		
for( int num: nums) {
			
			if(countMap.containsKey(num)) {
				
				duplicates.add(num);
				//countMap.put(num, currentCount+1);
			} else {
				countMap.put(num, true);
			}
		
}
		return duplicates;
		
	}
	


	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates); 
        
      //  List<Integer> duplicates1 = findDuplicatesOptimized(nums);
        System.out.println(duplicates);
        
        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */
		
	}

	

}
