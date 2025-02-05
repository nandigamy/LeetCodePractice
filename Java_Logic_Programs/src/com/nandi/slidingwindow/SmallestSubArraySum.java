package com.nandi.slidingwindow;

public class SmallestSubArraySum {

	public static int smallestSubArraySum(int[] nums, int k) {
		int i = 0;
		int j = 0;
		int sum = 0;
		int subArrayLength = Integer.MAX_VALUE;

		if (nums.length == 0)
			return 0;

		while (j < nums.length) {

			sum += nums[j];

			while (sum >= k) {

				subArrayLength = Math.min(subArrayLength, j - i + 1);

				sum -= nums[i];

				i++;
			}

			j++; // expand the window

		}

		return subArrayLength == Integer.MAX_VALUE ? 0 : subArrayLength;
	}

	public static void main(String[] args) {

		int[] nums = {  1, 2, 3, 4,5 };
		System.out.println(smallestSubArraySum(nums, 6));

	}

}
