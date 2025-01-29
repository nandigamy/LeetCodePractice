package com.nandi.fastandslowpointers;

public class FindDuplicateNumber {
	

	/*
	Given an array of positive numbers, nums, such that the values lie in the range 
	[
	1
	,
	n
	]
	[1,n]
	, inclusive, and that there are 
	n
	+
	1
	n+1
	 numbers in the array, find and return the duplicate number present in nums. There is only one repeated number in nums.

	Note: You cannot modify the given array nums. You have to solve the problem using only constant extra space.

	Constraints:

	1
	≤
	n
	≤
	1
	0
	3
	1≤n≤10 
	3
	 
	nums.length 
	=
	n
	+
	1
	=n+1
	1
	≤
	1≤
	 nums[i] 
	≤
	n
	≤n
	All the integers in nums are unique, except for one integer that will appear more than once.
*/
	
	
	public static int findDuplicate(int[] nums) {
	      
		int slowP= nums[0];
		int fastP= nums[0];
		
		slowP= nums[slowP];
		fastP=nums[nums[fastP]];
		while(slowP!=fastP) {
			slowP= nums[slowP];
			fastP= nums[nums[fastP]];
			
		}
		slowP= nums[0];
		
		while(slowP!=fastP) {
			
			slowP= nums[slowP];
			fastP=nums[fastP];
		}
	      
	      return fastP;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findDuplicate(new int[] {1, 5, 4, 3, 2, 4, 6} ));


	}

}
