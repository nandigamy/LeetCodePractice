package com.nandi.javaprograms;

import java.util.Scanner;

public class CountNoOfWords {

	public static void main(String[] args) {

		System.out.println(" enter a String");
		Scanner sc = new Scanner( System.in);
		String s= sc.nextLine();
		int count=0;
		int count1=0;
		
		for (int i= s.length()-1; i>=0; i--) {
			if(s.charAt(i)==' ') {
				count++;
			}
		 
//			if(Character.isWhitespace(s.charAt(i))) {
//				count1++;
//			}
		}
		
		System.out.println( count+1);
		//System.out.println("count 1 "+ count1++);
		sc.close();
		
	}
	

}
