package com.nandi.hashtables;

import java.util.HashMap;

public class ItemInCommon {
	
	public static boolean  itemInCommon(int[] arr1, int[]arr2) {
		
		if (arr1.length == 0 || arr2.length == 0) {
		    return false;
		}

		
		HashMap<Integer, Boolean> arrayHash = new HashMap<>();
		for( int i=0; i<arr1.length ; i++) {
			
			arrayHash.put(arr1[i], true);
		}
		
     for( int i=0; i<arr2.length ; i++) {
			
			if(arrayHash.containsKey(arr2[i])) {
				
				System.out.println("common "+ arr2[i]);
				return true;
			}
		}
		
		
		return false;
		
	}

	public static void main(String[] args) {

		
		int[] array1 = {1,2,6};
		int[] array2 = {2,4,5};
		
		System.out.println(itemInCommon(array1, array2));
	}

}
