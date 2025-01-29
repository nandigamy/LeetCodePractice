package com.nandi.hashtables;

import java.util.HashMap;

public class SubArraySum {
	
	
	
	private static int[] subarraySum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum = sum + nums[j];
				if (sum == target) {
					System.out.println("i " + i + " j " + j);
					System.out.println("sum " + sum);
					return new int[] { i, j };
				}
			}

		}

		return new int[0];
	}

	 static int[] subarraySumWithHashTable(int[] nums, int target) {
		
		
		HashMap<Integer, Integer> sumMap = new HashMap<>();
		sumMap.put(0, -1);
		int sum= 0;
		for(int i=0; i<nums.length; i++) {
			sum= sum+ nums[i];
			if(sumMap.containsKey(sum-target)) {
				return new int[] {sumMap.get(sum- target)+1, i};
			}
			
				sumMap.put( sum, i);
			
			
			
			
		}
		
		return new int[0];
		
		
	}

	public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 9;
//        int [] result1 = subarraySumWithHashTable(nums1, target1);
//        System.out.println("[" + result1[0] + ", " + result1[1] + "]");
        
        
       // int[] result1 = subarraySum(nums1, target1);
       //System.out.println("[" + result1[0] + ", " + result1[1] + "]");

//        int[] nums2 = {-1, 2, 3, -4, 5};
//        int target2 = 0;
//        int[] result2 = subarraySum(nums2, target2);
//        System.out.println("[" + result2[0] + ", " + result2[1] + "]");
        
      int[] nums2 = {-1, 2, 3, -4, 5};
      int target2 = 0;
      int[] result2 = subarraySumWithHashTable(nums2, target2);
      System.out.println("[" + result2[0] + ", " + result2[1] + "]");

/*
        int[] nums3 = {2, 3, 4, 5, 6};
        int target3 = 3;
       int[] result3 = subarraySum(nums3, target3);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");

        int[] nums4 = {};
        int target4 = 0;
        int[] result4 = subarraySum(nums4, target4);
        System.out.println("[]");
        
        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 3]
            [0, 3]
            [1, 1]
            []
    
        */
        
    }

	

}
