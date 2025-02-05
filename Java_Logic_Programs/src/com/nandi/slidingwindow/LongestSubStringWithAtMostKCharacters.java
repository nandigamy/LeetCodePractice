package com.nandi.slidingwindow;

import java.util.*;

public class LongestSubStringWithAtMostKCharacters {

	public static int longestSubStringWithAtMostKCharacters(String s, int k) {
		int i = 0, j = 0;
		int maxSubStringLength = 0;
		Map<Character, Integer> map = new HashMap<>();

		while (j < s.length()) {
			// Expand the window
			map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

			// Shrink the window if there are more than K distinct characters
			while (map.size() > k) {

				map.put(s.charAt(i), map.get(s.charAt(i)) - 1);

				if (map.get(s.charAt(i)) == 0) {
					map.remove(s.charAt(i));
				}

				i++; // Shrink the window from the left
			}

			// ✅ Update max length **only when map.size() <= k**
			
                maxSubStringLength = Math.max(maxSubStringLength, j - i + 1);
            

			j++; // Expand the window
		}

		return maxSubStringLength;
	}

	public static void main(String[] args) {
		System.out.println(longestSubStringWithAtMostKCharacters("abcabcbb", 3)); // Expected: 6
		System.out.println(longestSubStringWithAtMostKCharacters("eceba", 2)); // Expected: 3
		System.out.println(longestSubStringWithAtMostKCharacters("aa", 1)); // Expected: 2
		System.out.println(longestSubStringWithAtMostKCharacters("aabbcc", 0)); // Expected: 0
		System.out.println(longestSubStringWithAtMostKCharacters("abaccc", 2)); // Expected: 4
	}
}
