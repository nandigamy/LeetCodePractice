package com.nandi.topkelements;

import java.util.PriorityQueue;

public class KthLargestInteger {

	public static String findKthLargest(String[] nums, int k) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for (int i = 0; i < k; i++) {
			
			 

			minHeap.add(Integer.parseInt(nums[i]));
		}

		for (int j = k; j < nums.length; j++) {

			if (Integer.parseInt(nums[j]) > minHeap.peek()) {

				minHeap.poll();
				minHeap.add(Integer.parseInt(nums[j]));

			}

		}

		return minHeap.peek().toString();
	}

	public static void main(String[] args) {

		String[] nums = { "9", "8", "7", "6", "5" };

		System.out.println(findKthLargest(nums, 2));
	}

}
