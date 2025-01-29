package com.nandi.javaprograms;

import java.util.Scanner;

public class StringEndsWithAString {

	public static void main(String[] args) {

		
		System.out.println(" enter a String1");
		Scanner sc = new Scanner( System.in);
		String s1= sc.nextLine();
		

		System.out.println(" enter a String2");
		Scanner sc1 = new Scanner( System.in);
		String s2= sc1.nextLine();
		
		for ( int i=s1.length()-1; i>=0; i--) {
			
			int k=0;
			
			for ( int j=s2.length()-1; j>=0; j--) {
				
				if(s1.charAt(i)==s2.charAt(j)) {
					k++;
				}
			}
			
		}
		sc.close();		sc1.close();

		

	}

}
