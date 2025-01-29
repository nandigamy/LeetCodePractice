package com.nandi.slidingwindow;

public class MaxAverageSubArray {

	public static double maxAverageSubArray(int[] nums, int k) {

		int i = 0;
		int j = 0;
		double sum = 0;
		double count = 0;
		double maxAverage = Integer.MIN_VALUE;

		while (j < nums.length) {

			
				sum += nums[j];
				count++;
				double average = sum / count;
			

			if (j - i + 1 == k) {

				maxAverage = Math.max(maxAverage, average);
				
				sum-=nums[i];
				count--;
				i++;
			}
           j++;
		}

		return maxAverage;
	}
	
	
	//window size less than -- calculations... refer to aditya verma explanation
	//window size equal to ==getting the answer
	// then slide the window

	public static double maxAverageSubArray2(int[] nums, int k) {

		int i = 0;
		int j = 0;
		double sum = 0;
		double maxSum = Integer.MIN_VALUE;

		while (j < nums.length) {

			
				sum += nums[j];
				
			

			if (j - i + 1 == k) {
				

				maxSum = Math.max(maxSum, sum);
				
				sum-=nums[i];
				
				i++;
			}
           j++;
		}

		return maxSum/k;
	}
	
	public static double maxAverageSubArray3(int[] nums, int k) {
	    int i = 0;
	    long sum = 0;  // Use long to avoid floating-point inaccuracies
	    long maxSum = Long.MIN_VALUE;

	    for (int j = 0; j < nums.length; j++) {
	        sum += nums[j];

	        if (j >= k - 1) {  // When we have a full window
	            maxSum = Math.max(maxSum, sum);
	            sum -= nums[i];  // Remove leftmost element to slide the window
	            i++;
	        }
	    }

	    return (double) maxSum / k;  // Convert to double only once
	}
	
	 public static double findMaxAverage(int[] nums, int k) {
	        int currentSum = 0;
	        for (int i = 0; i < k; i++) {
	            currentSum += nums[i];
	        }

	        int maxSum = currentSum;

	        for (int i = k; i < nums.length; i++) {
	            currentSum += nums[i] - nums[i - k];
	            maxSum = Math.max(maxSum, currentSum);
	        }

	        return (double) maxSum / k;
	    }

	public static void main(String[] args) {

		int[] nums = { -5,-1,4,2,-3,6 };

		System.out.println(maxAverageSubArray3(nums, 3));
		System.out.println(findMaxAverage(nums, 3));
	}

}
