package com.nandi.slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

	public static int[] findMaxSlidingWindow(int[] nums, int w) {

		int[] result = new int[nums.length - w + 1];

		for (int i = 0; i < nums.length - w + 1; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = i; j < w + i; j++) {

				if (nums[j] > max) {
					max = nums[j];
				}

			}
			result[i] = max;
		}

		return result;
	}

	public static int[] findMaxSlidingWindow3(int[] nums, int w) {

		int[] result = new int[nums.length - w + 1];

		int i = 0;
		int j = 0;
		int max = Integer.MIN_VALUE;

		while (j < nums.length)

		{
			// 3 stesp.. when window size is less do calculation
			// when you reach the window .. get the anser and 
			//slide the window
			max = Math.max(nums[j], max);

			if (j - i + 1 == w) {

				result[i] = max;
				if (nums[i] == max) {
					//further optimization...
					if (j + 1 < nums.length && nums[j + 1] > max) {
						max = nums[j + 1];
					} else {
						max = Integer.MIN_VALUE;
						for (int k = i + 1; k <= j; k++) {
							max = Math.max(nums[k], max);
						}
					}
				}

				i++;

			}
			j++;

		}

		return result;
	}

	public static int[] findMaxSlidingWindow2(int[] nums, int w) {

		if (nums == null || w == 0)
			return new int[0];

		int n = nums.length;
		int[] result = new int[n - w + 1];
		Deque<Integer> deque = new LinkedList<>();

		for (int i = 0; i < n; i++) {

			// remove elements that are out of bounds

			if (!deque.isEmpty() && deque.peekFirst() < i - w + 1) {

				deque.pollFirst();
			}

			// remove elemnt from back if they are smaller thn xurrent element
			if (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {

				deque.pollFirst();
			}

			// insert current elemnt at back
			deque.offerLast(i);

			// store the max element of current window
			if (i >= w - 1) {

				result[i - w + 1] = nums[deque.peekFirst()];
			}

		}

		return result;

	}

	public static void main(String[] args) {

		int[] nums = { 10, 6, 9, -3, 23, -1, 34, 56, 67, -1, -4, -8, -2, 9, 10, 34, 67 };

		int[] result = findMaxSlidingWindow3(nums, 3);

		for (int n : result) {

			System.out.println(" " + n);
		}

	}

}

/*
 * 
 * public class SlidingWindowMaximumWithoutDeque { public static int[]
 * findMaxSlidingWindow3(int[] nums, int w) { int n = nums.length; int[] result
 * = new int[n - w + 1]; // Output array int i = 0, j = 0; int max =
 * Integer.MIN_VALUE; int maxIndex = -1; // Stores the index of the current max
 * element
 * 
 * while (j < n) { // ✅ Step 1: Update the max value within the current window
 * if (nums[j] > max) { max = nums[j]; maxIndex = j; }
 * 
 * // ✅ Step 2: Check if the window has reached size `w` if (j - i + 1 == w) {
 * result[i] = max; // Store the max in result
 * 
 * // ✅ Step 3: When sliding the window, check if max is going out if (maxIndex
 * == i) { // Recalculate max since it's being removed from the window max =
 * Integer.MIN_VALUE; for (int k = i + 1; k <= j; k++) { if (nums[k] > max) {
 * max = nums[k]; maxIndex = k; } } }
 * 
 * // ✅ Step 4: Slide the window i++; }
 * 
 * j++; // Expand window }
 * 
 * return result; }
 * 
 * public static void main(String[] args) { int[] nums = {4, 5, 6, 1, 2, 3}; int
 * w = 2; int[] result = findMaxSlidingWindow3(nums, w);
 * 
 * System.out.println(java.util.Arrays.toString(result)); // Output: [5, 6, 6,
 * 2, 3] } }
 * 
 */
