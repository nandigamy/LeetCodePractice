package com.nandi.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

	public static String minWindow(String s, String t) {

		if (s == null || s.length() == 0 || t == null || t.length() == 0) {
			return "";
		}
		int i = 0;
		int j = 0;
		int minLen = Integer.MAX_VALUE;

		Map<Character, Integer> map = new HashMap<>();
		int count = 0;
		int start = 0;

		int k = 0;
		while (k < t.length()) {
			map.put(t.charAt(k), map.getOrDefault(t.charAt(k), 0) + 1);
			k++;
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			System.out.println("Key " + entry.getKey() + " value " + entry.getValue());
		}

		while (j < s.length()) {

			if (map.containsKey(s.charAt(j))) {
				map.put(s.charAt(j), map.get(s.charAt(j)) - 1);

				if (map.get(s.charAt(j)) >= 0) {
					count++; // valid match

				}

			}

			while (count == t.length()) {

				if (j - i + 1 < minLen) {

					minLen = j - i + 1;
					start = i;
				}

				if (map.containsKey(s.charAt(i))) {

					map.put(s.charAt(i), map.get(s.charAt(i)) + 1);

					if (map.get(s.charAt(i)) > 0) {
						count--;
					}
				}
				i++;

			}

			j++;
		}

		return minLen == Integer.MAX_VALUE? "" : s.substring(start, start + minLen);
	}

	public static void main(String[] args) {

		System.out.println(minWindow("y", "k"));
	}

}
