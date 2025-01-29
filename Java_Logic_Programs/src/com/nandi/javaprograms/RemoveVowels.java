package com.nandi.javaprograms;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {

		System.out.println(" enter a String");
		Scanner sc = new Scanner( System.in);
		String s= sc.nextLine();
		
		StringBuffer sb = new StringBuffer();
		int vowelCount=0;
		int consCount=0;
		
		for( int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				vowelCount++;
				continue;
				
			}
			else {
				sb.append(s.charAt(i));
				consCount++;
			}
		}
		
		System.out.println("string without vowels " + sb);
		
		System.out.println("vowels " + vowelCount + " consonants " + consCount);
		sc.close();

		
	}

}
