package com.nandi.sortingandsearch;

import java.util.Arrays;

public class InsertionSortImpl {
	
	public int[] insertionSort1(int[] nums) {

		int n = nums.length;

		for (int i = 1; i < n; i++) {

			int temp = nums[i];
			for (int j = i - 1; j >= 0; j--) {

				if (temp < nums[j]) {
					nums[j + 1] = nums[j];
					if (j == 0) {
						nums[j] = temp;
					}

			} 
					else {
					nums[j + 1] = temp;
					break;
				}
			}
		}

		return nums;
		
		
	}

	
	public int[]  insertionSort(int[] nums) {
		
		int n = nums.length;
		
		for( int i=1; i<n ; i++) {
			
			int temp = nums[i];
			
			int j=i-1;
			
			while( j>=0 && temp<nums[j]) {
				
				nums[j+1]= nums[j];
				j--;
			}
			
			nums[j+1]= temp;
			
		}
		
		
		
		return nums;
		
		
	}
		
	

	public static void main(String[] args) {

		InsertionSortImpl is = new InsertionSortImpl();
		int [] nums = { 7,3,8,5,2};
		int[] result =is.insertionSort1(nums);
		Arrays.toString(result);
		for (int num: nums) {
			System.out.print(num+" ");
		}
 		
	}

}
