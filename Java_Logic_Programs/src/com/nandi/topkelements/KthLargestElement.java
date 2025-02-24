package com.nandi.topkelements;

import java.util.PriorityQueue;

public class KthLargestElement {
	
	public static int findKthLargest(int[] nums, int k) {
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	      
	    for( int i=0; i<k; i++) {
	    	
	    	minHeap.add(nums[i]);
	    }
		
 for( int j=k; j<nums.length; j++) {
	 
	 if(nums[j]>minHeap.peek()) {
		 
		 minHeap.poll();
		 minHeap.add(nums[j]);
		 
	 }
	    	
	 
	    	
	    }
		
	      return minHeap.peek();
	   }
	
	public static int findKthLargest2(int[] nums, int k) {
		// Min Heap with capacity k
		PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
	      
	    // Add first k elements
	    for (int i = 0; i < k; i++) {
	    	minHeap.offer(nums[i]);
	    }
		
	    // Process remaining elements
	    for (int j = k; j < nums.length; j++) {
	        if (nums[j] > minHeap.peek()) {
	            minHeap.poll();
	            minHeap.offer(nums[j]);
	        }
	    }
		
	    return minHeap.peek(); // Kth largest element
	}

	public static void main(String[] args) {

		int [] nums = { 5, 12, 9, 0, 6, 7, 1, 8, 4, 9};
		
	System.out.println(	findKthLargest(nums,1));
	}

}
