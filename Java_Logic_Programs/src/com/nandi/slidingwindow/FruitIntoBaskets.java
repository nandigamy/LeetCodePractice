package com.nandi.slidingwindow;

import java.util.*;

public class FruitIntoBaskets {

	public static int totalFruit(int[] nums) {

		// if key count is two.. find the window size
		// go upto end and find max..
		// slide the window

		int i = 0;
		int j = 0;
		int MaxWindowSize = 0;
		Map<Integer, Integer> map = new HashMap<>();
		while (j < nums.length) {

			map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

			// slide the window
			while (map.size() > 2) {

				map.put(nums[i], map.get(nums[i]) - 1);
				if (map.get(nums[i]) == 0) {
					map.remove(nums[i]);
				}

				i++;
			}

			int windowSize = j - i + 1;
			MaxWindowSize = Math.max(MaxWindowSize, windowSize);
			j++;
		}

		return MaxWindowSize;
	}

	public static void main(String[] args) {

		System.out.println(totalFruit(new int[] { 3, 2, 1, 4, 2, 3 }));
	}

}

//if(map.size()<=2) {
//
//int windowSize= j-i+1;
//MaxWindowSize= Math.max(MaxWindowSize, windowSize);
//}