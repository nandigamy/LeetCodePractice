package com.nandi.twopointers;

public class MinNoOfMovesToMakeAPalindrome {
	
	public static int minMovesToMakePalindrome(String s) {
		char[] ch = s.toCharArray();
		int moves = 0;
		int i = 0;
		int j = ch.length - 1;
		while (i < j) {
			int k = j;
			while (k > i && ch[i] != ch[k]) {
				k--;
			}

			if (k == i) {
				moves += (ch.length) / 2 - i;
			} else {
				while (k < j) {
					swap(ch, k, k + 1);
					k++;
					moves++;
				}
				j--;
			}
			i++;

		}

		return moves;

	}

	public static void swap(char[] ch, int i, int j) {

		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;

	}

	public static void main(String[] args) {

		System.out.println(minMovesToMakePalindrome("ntiin"));
	}

}
//
///*
//public int minMovesToMakePalindrome2(String s) {
//    char[] chars = s.toCharArray();
//    int moves = 0;
//    
//    int i = 0, j = chars.length - 1;
//    
//    while (i < j) {
//        int k = j;
//        
//        // Find the closest matching character for chars[i] from the right
//        while (k > i && chars[i] != chars[k]) {
//            k--;
//        }
//        
//        if (k == i) { 
//            // Unique middle character case: Move it towards the center
//            moves += chars.length / 2 - i;
//        } else {
//            // Move the matching character at k to j step-by-step
//            while (k < j) {
//                swap(chars, k, k + 1);
//                k++;
//                moves++;
//            }
//            // Reduce j since the rightmost character is now in place
//            j--;
//        }
//        i++; // Move left pointer
//    }
//    return moves;
//}
//
//// Utility function to swap characters in the array
//private void swap(char[] chars, int i, int j) {
//    char temp = chars[i];
//    chars[i] = chars[j];
//    chars[j] = temp;
//}
///*
//
//}

/*
public static int minMovesToMakePalindrome(String s) {
	char[] ch = s.toCharArray();
	int moves = 0;
	int i = 0;
	int j = ch.length - 1;
	while (i < j) {
	if(ch[i]==ch[j]{
	i++;
	j--
	
	}
	else{
		int k = j;
		while (k > i && ch[i] != ch[k]) {
			k--;
		}

		if (k == i) {
			moves += (ch.length) / 2 - i;
		} else {
			while (k < j) {
				swap(ch, k, k + 1);
				k++;
				moves++;
			}
			j--;
		}
		i++;

	}
}
	return moves;

}
*/