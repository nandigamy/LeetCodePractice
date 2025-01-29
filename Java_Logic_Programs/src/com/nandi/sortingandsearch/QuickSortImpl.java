package com.nandi.sortingandsearch;

import java.util.Arrays;

public class QuickSortImpl {
	
	
	
	private static void quickSort(int[] nums, int low, int high) {
		
		
		if (low < high) { // Base case: Stop when the subarray has one or zero elements
	        int pivotIndex = partitionPractice3(nums, low, high); // Partition and get pivot index
	        quickSort(nums, low, pivotIndex - 1); // Recursively sort the left subarray
	        quickSort(nums, pivotIndex + 1, high); // Recursively sort the right subarray
	    }
	}
	

	public static int partition( int[] nums, int low, int high) {
		int i=low;
		int pivot = nums[high];
		for (int j=low; j<high; j++) {
			if(nums[j]<=pivot) {
				swap(nums, i, j);
				i++;
			}
			
			
		}
		swap(nums, i, high);
		
		
		return i;
		
		
		
	}
	
	public static void swap ( int [] array, int i, int j) {
		int temp = array[i];
		array[i]= array[j];
		array[j]= temp;
	}
	
	public static int partitionPractice(int[] nums, int low, int high) {
		
		int pivot = nums[low];
		
		int i = low+1;
		
		for( int j=low+1; j<=high; j++) {
			
			if(nums[j]>pivot){
				
				swap(nums, i , j);
				i++;
				
				
			}
		}
		swap(nums, low, i-1);
	return i-1;
		
		
		
	}
	
	//pivot value -- low or high
	//window would be all other elements 
	
	
	public static int partitionPractice2(int[] nums, int low, int high) {
		
		int pivot = nums[high];
		int i=low;
		
		for( int j=low; j<high; j++) {
			
			if(nums[j]<pivot) {
				
				swap(nums, i, j);
				i++;
				
			}
		}
		swap(nums, i, high);
		
		return i;
		
	}
	
	
public static int partitionPractice3(int[] nums, int low, int high) {
		
		int pivot = nums[low];
		int i=low;
		
		for( int j=low+1; j<=high; j++) {
			
			if(nums[j]<pivot) {
				
				i++;
				swap(nums, i, j);
				
				
				
				
			}
		}
		swap(nums, low, i);
		
		return i;
		
	}
	
	

	public static void main(String[] args) {

		int[]  nums = { 1,5,3,2,4,8,6, 7};
		//printArray(nums);
//		System.out.println(sumArray(nums));
//		System.out.println(findMax(nums));
//		System.out.println(findCount(nums));
		//splitArray(nums);
		int [] num1 = {1,5,4,2,3};
		
		int [] num2 = {3,2,7,5,4};
		//System.out.println(Arrays.toString(mergeSort(nums)));
		//System.out.println(Arrays.toString(quickSort(nums)));
	//	System.out.println(partition(num1, 0, (num1.length)-1 ));
		//System.out.println(partitionPractice3(num2, 0, (num2.length)-1 ));
		quickSort(num2, 0, (num2.length)-1 );
		for(int num: num2) {
			System.out.print(" values" + num+" ");
		}
		
	}

	

}
