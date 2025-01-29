package com.nandi.javaprograms;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PrintEvenWords {

	public static void main(String[] args) {

		System.out.println(" enter a String");
		Scanner sc = new Scanner( System.in);
		String s= sc.nextLine();
		
//		String[] words = s.split(" ");
//		
//		for (String word: words) {
//			if(word.length()%2 ==0) {
//				System.out.println(" even words are " + word);
//			}
//			
//		}
		
		StringTokenizer tokenizer = new StringTokenizer(s);
		while( tokenizer.hasMoreTokens()) {
			
			String token = tokenizer.nextToken();
			
			if(token.length()%2 ==0) {
				System.out.println(" even words are " + token);
			}
		}
		sc.close();

	}

}
