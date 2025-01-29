package com.nandi.javaprograms;

import java.util.Scanner;

//public class MaxOccurenceFinder {
//
//	public static void main(String[] args) {
//
//	
//		System.out.println(" enter a String");
//		Scanner sc = new Scanner( System.in);
//		String s= sc.nextLine();
//		
//		int arr[] = new int[256];
//		
//		for ( int i=0; i<s.length(); i++) {
//	
//		arr[(int)s.charAt(i)]++;
//			
//		}
//		
//		int max=0;
//		for ( int i=1; i<arr.length; i++) {
//			
//			//int max=0;
//			if(arr[i]> arr[max]) {
//				
//				max=i;
//				
//			}
//			
//			
//		}
//		
//		System.out.println("max value  " + (char)max);
//		
//
//
//	}
//}



public class MaxOccurrenceFinder {

    public static void main(String[] args) {

        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close(); // Close the Scanner resource

        // Array to store the frequency of each character
        int[] charFrequency = new int[256];

        // Count the occurrences of each character
        for (char ch : input.toCharArray()) {
            charFrequency[ch]++;
        }

        // Find the maximum occurring character
        int maxFrequency = 0;
        char maxChar = '\0';

        for (int i = 0; i < charFrequency.length; i++) {
            if (charFrequency[i] > maxFrequency) {
                maxFrequency = charFrequency[i];
                maxChar = (char) i;
            }
        }

        System.out.println("Character with maximum occurrence: " + maxChar);
        System.out.println("Number of occurrences: " + maxFrequency);
    }
}
