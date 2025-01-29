package com.nandi.fastandslowpointers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SplitCircularArray {

	public static int findNextIndex(int[] nums, int i) {

		// handling circular nature to wrap around
		int index = (i + nums[i]) % nums.length;

		// handling negative indices to wrap around correctly
		if (index < 0) {
			index += nums.length;
		}
		return index;
	}

	public static boolean isSameDirection(int[] nums, int current, int next) {
		// checking if the direction is either forward or either backward.. but not at
		// all a mix

		return (nums[current] >= 0 && nums[next] >= 0) || (nums[current] < 0 && nums[next] < 0);

	}

	public static List<Integer> traverseCircularArray(int[] nums, int start) {

		List<Integer> result = new ArrayList<>();
		Set<Integer> visitedSet = new HashSet<>();

		int i = start;

		result.add(start);
		visitedSet.add(start);

		while (true) {

			int current = findNextIndex(nums, i);

			if (!isSameDirection(nums, i, current)) {
				break;
			}

			if (visitedSet.contains(current)) {
				if(current== start) {
					result.add(current);
				}
				break;
			}
			result.add(current);
			visitedSet.add(current);

			i = current;

		}

		return result;

	}

	public static boolean hasCycle(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			List<Integer> visited = traverseCircularArray(nums, i);

			if (visited.size() > 2 && visited.get(visited.size() - 1).equals(visited.get(0))) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {

		int[] nums = { 2, -1, 1, 2, 2 };
		System.out.println(findNextIndex(nums, 1));
		int[] nums1 = {5, 4, -2, -1, 3};
		System.out.println(hasCycle(nums1));  // Expected Output: true

		int[] nums2 = {1, 2, 3, 4, 5};
		System.out.println(hasCycle(nums2));  // Expected Output: false

		int[] nums3 = {-1, -2, -3, -4};
		System.out.println(hasCycle(nums3));  // Expected Output: true

	}

}
