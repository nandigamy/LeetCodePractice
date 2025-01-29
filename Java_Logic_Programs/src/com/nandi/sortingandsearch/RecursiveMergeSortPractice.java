package com.nandi.sortingandsearch;

import java.util.Arrays;

public class RecursiveMergeSortPractice {

	
 public static void printArray(int[] nums)
 {
	 
	 int n= nums.length;
	 
	 if(n==0) {
		 return;
	 }
	 
	 System.out.print(" "+ nums[0]);
	 
	 int[] newNums= Arrays.copyOfRange(nums, 1, n);
	 printArray(newNums);
 	 
 }
 
 public static int sumArray(int[] nums)
 {
	 int n= nums.length;	 
	 if(n==0) {
		 return 0;
	 }
	 //System.out.print(" "+ result);
	 
	 int[] newNums= Arrays.copyOfRange(nums, 1, n);
	int result= nums[0] + sumArray(newNums);
	return result; 
 }
	
 public static int findMax(int[] nums) {
	
	 
	 int n= nums.length;	 
	 if(n==1) {
		 return nums[0];
	 }
	 //System.out.print(" "+ result);
	 
	 int[] newNums= Arrays.copyOfRange(nums, 1, n);
	int result= Math.max(nums[0], findMax(newNums));
	return result; 

 
 }
 
public static int findCount(int[] nums) {
	
	 
	 int n= nums.length;	 
	 if(n==0) {
		 return 0;
	 }
	 //System.out.print(" "+ result);
	 
	 int[] newNums= Arrays.copyOfRange(nums, 1, n);
	int result= 1+findCount(newNums);
	return result; 

 
 }

	public static void splitArray(int[] nums) {

		int n = nums.length;
		
		if (n == 1) {
			System.out.println("reached base case" + Arrays.toString(nums));
			return;

		}

		int mid = n / 2;
		int[] left = Arrays.copyOfRange(nums, 0, mid);
		int[] right = Arrays.copyOfRange(nums, mid, n);
		System.out.println("left" + Arrays.toString(left));
		System.out.println("right" + Arrays.toString(right));
		splitArray(left);
		splitArray(right);

	}
	
	public static int[] mergeSort(int[] nums) {
		
		
		
		int n = nums.length;
		//System.out.println(Arrays.toString(mergeSort(nums)));
		if(n==0) {
			return null;
		}
		if (n == 1) {
			System.out.println("reached base case" + Arrays.toString(nums));
			return nums;

		}

		int mid = n / 2;
		int[] left = Arrays.copyOfRange(nums, 0, mid);
		int[] right = Arrays.copyOfRange(nums, mid, n);
		System.out.println("left" + Arrays.toString(left));
		System.out.println("right" + Arrays.toString(right));
		left =mergeSort(left);
		right =mergeSort(right);
		
		return merge(left, right);
		
		//return nums;
		
		
	}
	
	private static int[] merge(int[] left, int[] right) {

		int i=0; int j=0;  int k=0;
		int[] result = new int[left.length+right.length];
	
	while( i<left.length && j<right.length) {
		if(left[i]< right[j]) {
			result[k]= left[i];
			k++;
			i++;
		}else {
			result[k]= right[j];
			k++;
			j++;
		}
	}
		while(i<left.length) {
			result[k]=left[i];
			k++;
			i++;
		}
		while(j<right.length) {
			result[k]=right[j];
			k++;
			j++;
		}
		
		return result;
	}

	public static void main(String[] args) {

		
		int[]  nums = { 1,5,3,2,4,8,6, 7};
		//printArray(nums);
//		System.out.println(sumArray(nums));
//		System.out.println(findMax(nums));
//		System.out.println(findCount(nums));
		//splitArray(nums);
		int [] num1 = {3,3,7,3,2,2,1};
		
		//System.out.println(Arrays.toString(mergeSort(nums)));
		System.out.println(Arrays.toString(mergeSort(num1)));
		
		
	}

}
