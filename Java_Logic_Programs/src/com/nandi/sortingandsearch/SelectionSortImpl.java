package com.nandi.sortingandsearch;

public class SelectionSortImpl {

	
	private void selectionSort(int[] nums) {

		
		int n = nums.length;
		
		for ( int i=0; i< n; i++) {
			
			int large =findLarge(nums, 0, n-i);
			
				
				swap(nums,n-i-1, large);
				
				
				
			
		}
	}

	private int findLarge(int[] nums, int i, int j) {

		int maxIndex= i;
		
		for( int k =i; k<j ; k++) {
			
			if( nums[k]>nums[maxIndex]) {
				maxIndex= k;
			}
		}
		
		return maxIndex;
	}

	private void swap(int[]nums , int i, int j) {
		int temp = nums[i];
		nums[ i] = nums[j];
		nums[j]= temp;
	}
	
	
	public static void main(String[] args) {

		SelectionSortImpl ss = new SelectionSortImpl();
		int [] nums = {5, 3, 8, 4, 2};
		ss.selectionSort(nums);
		for (int num: nums) {
			System.out.print(num+" ");
		}
		
	}

	
}
