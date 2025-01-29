package com.nandi.twopointers;

public class ValidPalindromeII {

	// checking the palindrome by removing an element

	public static boolean isPalindrome(String s) {

		s = s.toLowerCase();

		int left = 0;
		int right = s.length() - 1;

		while (left <= right) {

			if (s.charAt(left) == s.charAt(right)) {
				left++;
				right--;

			} else {
				return isValidPalindrome(s, left + 1, right) || isValidPalindrome(s, left, right - 1);

			}

		}

		// Replace this placeholder return statement with your code

		return true;
	}

	public static boolean isValidPalindrome(String s, int left, int right) {

		while (left <= right) {

			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(isPalindrome("RACEACAR"));
	}

}
