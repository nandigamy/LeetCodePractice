package com.nandi.slidingwindow;

//longest sub array with sum<=k
public class LongestSubArraySum {

	public static int longestSubArraySum(int[] nums, int k) {
		int i = 0;
		int j = 0;
		int sum = 0;
		int subArrayLength = Integer.MIN_VALUE;

		if (nums.length == 0)
			return 0;

		while (j < nums.length) {

			
			sum+= nums[j];
				
			
			while(sum>k) {		
				sum-= nums[i];
				i++;
			}
			
			subArrayLength = Math.max(subArrayLength, j - i + 1);
			
			j++;
		}

		return subArrayLength == Integer.MIN_VALUE ? 0 : subArrayLength;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 1, 2, 7, 4, 2, 1, 1, 5 };
		System.out.println(longestSubArraySum(nums, 2));
	}

	/*
	 * 
	 * 
	 * while (j < nums.length) {
	 * 
	 * sum += nums[j];
	 * 
	 * while (j<nums.length && sum<= k) {
	 * 
	 * subArrayLength = Math.max(subArrayLength, j - i + 1);
	 * 
	 * 
	 * sum += nums[j]; j++;
	 * 
	 * }
	 * 
	 * i++; // expand the window
	 * 
	 * }
	 */

}
