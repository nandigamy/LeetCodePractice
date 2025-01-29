package com.nandi.slidingwindow;

//import java.util.*;

class MinSizeSubArraySum {
	public static int minSubArrayLen(int target, int[] nums) {

		int i = 0;
		int j = 0;
		int n = nums.length;
		int wSize = Integer.MAX_VALUE;
		int sum = 0;

		while (j < n) {
			// calculation
			sum += nums[j];

			// window size equal-- condition check & optimization

			while (sum >= target) {
				int currentWindowSize = j - i + 1;
				wSize = Math.min(currentWindowSize, wSize);

				// sliding the window
				sum -= nums[i];
				i++;
			}

			j++;

		}

		return wSize == Integer.MAX_VALUE ? 0 : wSize;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
