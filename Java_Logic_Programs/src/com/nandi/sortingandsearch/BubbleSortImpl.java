package com.nandi.sortingandsearch;

public class BubbleSortImpl {

	
//	private int[] bubbleSort(int[] nums) {
//		int n= nums.length;
//		
//		for( int i=0; i<n; i++) {
//			boolean swapped =false; // optimisatio incase of sorted array
//			int lastSwap =0; // reducing the range incase some part the tail is already sorted
//			
//			// int k=n-i;
//            int range = Math.min(n - i, lastSwap == 0 ? n : lastSwap);
//
//			for (int j=1; j<range; j++) {
//				
//				if(nums[j-1]> nums[j]) {
//					
//				swap(nums, j-1, j);
//					swapped= true;
//					lastSwap =j;
//					
//				}
//				
//			}
//			
//			if(!swapped) {
//				break;
//			}
//			
//			//k= lastSwap;
//		}
//		
//		
//		return nums;
//		
//		
//	}
	
	private int[] bubbleSort1(int[] nums) {
		int n= nums.length;
		int range =n;
		
		for( int i=0; i<n; i++) {
			boolean swapped =false; // optimisatio incase of sorted array
			int lastSwap =0; // reducing the range incase some part the tail is already sorted
			
			

			for (int j=1; j<range; j++) {
				
				if(nums[j-1]> nums[j]) {
					
				swap(nums, j-1, j);
					swapped= true;
					lastSwap =j;
					
				}
				
			}
			
			if(!swapped) {
				break;
			}
			
			range= lastSwap;
		}
		
		
		return nums;
		
		
	}
	
	
	
	private void swap(int[]nums , int i, int j) {
		int temp = nums[i];
		nums[ i] = nums[j];
		nums[ j]= temp;
		
	}


	public static void main(String[] args) {

		BubbleSortImpl bs = new BubbleSortImpl();
		//bs.bubbleSort(new int[] {5, 3, 8, 4, 2});
		int [] nums = {5, 3, 8, 4, 2};
		bs.bubbleSort1(nums);
		for (int num: nums) {
			System.out.print(num+" ");
		}
		//System.out.println(bs.bubbleSort(new int[] {5, 3, 8, 4, 2}).toString());
		
	}

}
