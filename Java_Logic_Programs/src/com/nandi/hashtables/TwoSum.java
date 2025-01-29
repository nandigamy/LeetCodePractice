package com.nandi.hashtables;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	

	 static int[] twoSum(int[] nums, int target) {

		 HashMap<Integer, Integer> twosum= new HashMap<>();
		 int[] result = new int[2];
		 for ( int i=0; i<nums.length; i++) {
			 
			 if (twosum.containsKey(target-nums[i])) {
				 result[0]=twosum.get(target-nums[i]);
			      result[1]=i;
			      return result;
			 }
			 else {
				 twosum.put(nums[i], i);
			 }
			 
		 }
		 
		 
	 
		 return new int[0];
	}


	public static void main(String[] args) {

		
		System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
       System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));
        /*
            EXPECTED OUTPUT:
            ----------------
            [0, 1]
            [1, 2]
            [0, 1]
            []
            [2, 3]
            [0, 1]
            []

        */
	}

}


//
//for ( int i=0; i<nums.length; i++) {
//		 int temp=nums[i];
//	 
//  for ( int j=i+1; j<nums.length ; j++) {
//			 
//			if(temp==target-nums[j] ) {
//				result[0]=twosum.get(nums[i]);
//				result[1]=twosum.get(nums[j]);
//				
//			}
//		 }
//		
//	 }
//