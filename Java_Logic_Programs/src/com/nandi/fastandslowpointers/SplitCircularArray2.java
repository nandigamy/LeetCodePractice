package com.nandi.fastandslowpointers;

import java.util.HashSet;
import java.util.Set;


	
	

	public class SplitCircularArray2 {

	    public static int findNextIndex(int[] nums, int i) {
	        // Handling circular nature to wrap around
	        int index = (i + nums[i]) % nums.length;

	        // Handling negative indices to wrap around correctly
	        if (index < 0) {
	            index += nums.length;
	        }
	        return index;
	    }

	    public static boolean traverseCircularArray(int[] nums, int start) {
	        Set<Integer> visitedSet = new HashSet<>();
	        int i = start;
	        int count = 0;  // Tracks number of elements in the cycle

	        while (true) {
	            int current = findNextIndex(nums, i);

	            // Stop if direction changes
	            if ((nums[i] >= 0) != (nums[current] >= 0)) {
	                return false; // Not a valid cycle
	            }

	            // Stop if we revisit an index (check if it's a cycle)
	            if (visitedSet.contains(current)) {
	                return current == start && count >= 2; // ✅ Ensure length ≥ 2
	            }

	            // Mark index as visited
	            visitedSet.add(current);
	            count++;  // Increment step count
	            i = current;
	        }
	    }

	    public static boolean hasCycle(int[] nums) {
	        for (int i = 0; i < nums.length; i++) {
	            if (traverseCircularArray(nums, i)) {
	                return true; // Found a valid cycle
	            }
	        }
	        return false; // No cycle found
	    }

	    public static void main(String[] args) {
	        int[] nums1 = {5, 4, -2, -1, 3};
	        System.out.println(hasCycle(nums1));  // Expected Output: true

	        int[] nums2 = {1, 2, 3, 4, 5};
	        System.out.println(hasCycle(nums2));  // Expected Output: false

	        int[] nums3 = {-1, -2, -3, -4};
	        System.out.println(hasCycle(nums3));  // Expected Output: true

	        int[] nums4 = {1, 1, 1, 1};  
	        System.out.println(hasCycle(nums4));  // Expected Output: true (valid cycle of length ≥ 2)

	        int[] nums5 = {1, 0, 1, 0};  
	        System.out.println(hasCycle(nums5));  // Expected Output: false (self-loop issue)
	    }
	}



