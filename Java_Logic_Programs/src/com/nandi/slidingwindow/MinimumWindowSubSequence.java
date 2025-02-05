package com.nandi.slidingwindow;

public class MinimumWindowSubSequence {

	public static String minWindowSubSequence(String s, String t) {

		int i = 0;
		int j = 0;
		int k = 0;
		
		String result = "";
		int windowLength = Integer.MAX_VALUE;

		while (j < s.length()) {	

			if (t.charAt(i) == s.charAt(j)) {

				if (i == 0) {

					k = j;
				}

				i++;
				
				if (i == t.length()) {
					
					// Try shrinking from the left while maintaining t as a subsequence
                    while (k < j &&  (k + 1 < s.length()) && s.charAt(k) == s.charAt(k+1)) {
                        k++; // Move left pointer forward
                    }



					// Update the minimum window if this one is smaller
                    if (j - k + 1 < windowLength) {
                        windowLength = j - k + 1;
                        result = s.substring(k, j + 1);
                    }
					
					j=k+1;
					i=0;

				}
				

			}

			j++;

		}
		

		return result;
	}

	public static void main(String[] args) {

		System.out.println(minWindowSubSequence("abcdbebe", "bbe"));
	}

}
