package com.nandi.hashtables;

import java.util.*;

public class FindPairs {
	
	 static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {

		 
		 Set<String> uniquePairs = new HashSet<>();
		 Set<Integer> pair1 = new HashSet<>();
		 
		 List<int[]> result= new ArrayList<>();

		 
		 for(int nums: arr1) {
			 pair1.add(nums);
			 
		 }
		 
		 for(int num: arr2) {
			 
			 if( pair1.contains(target-num)) {
//				 
//				 
//				 String pairKey= Math.min(num,  target-num)+ ":" +Math.max(num,  target-num);
//				 
//				 if(!uniquePairs.contains(pairKey)) {
//				 
//					 uniquePairs.add(pairKey);
				 result.add(new int[] {num, target-num});
//				 }
			 }
		 }
		 
		 
		 return result;
	}

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]
            
        */
        
    }


}
