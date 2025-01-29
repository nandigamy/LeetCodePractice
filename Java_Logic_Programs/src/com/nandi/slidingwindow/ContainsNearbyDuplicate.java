package com.nandi.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class ContainsNearbyDuplicate {

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		
		Set<Integer> dupCheck = new HashSet<>();
		int i = 0;
		int j = 0;
		if(k<=0) return false;

		while (j < nums.length) {

			if (dupCheck.contains(nums[j])) {
				return true;
			} 
			
			dupCheck.add(nums[j]);
			
			if ((j - i) >=k) {
				dupCheck.remove(nums[i]);
				i++;
			}
			j++;

		}

		return false;
	}

	public static void main(String[] args) {
		
		System.out.println(containsNearbyDuplicate( new int[] {444, -666, -999, 888, -444, 666, -666, 999}, 4));

	}

}
