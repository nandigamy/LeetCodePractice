package com.nandi.topkelements;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class ThirdMaximumDistintNumber {

	public static int thirdMax(int[] nums) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {

			if (!set.contains(nums[i])) {
				set.add(nums[i]);

				if (minHeap.size() < 3) {
					minHeap.add(nums[i]);

				} else {

					if (nums[i] > minHeap.peek()) {
						minHeap.poll();
						minHeap.add(nums[i]);
					}
				}
			}

		}
		
		if(minHeap.size()==2) {
			
			minHeap.poll();
		}
		

		return minHeap.peek();

	}

	public static void main(String[] args) {

		int[] nums = { 5, 2, 4, 1, 3, 5 };

		System.out.println(thirdMax(nums));

	}

}
