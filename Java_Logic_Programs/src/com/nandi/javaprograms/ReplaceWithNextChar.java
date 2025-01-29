package com.nandi.javaprograms;

import java.util.Scanner;

public class ReplaceWithNextChar {

	public static void main(String[] args) {

		
		System.out.println(" enter a String");
		Scanner sc = new Scanner( System.in);
		String s1= sc.nextLine();
		System.out.println(" enter a String2");
		Scanner sc2 = new Scanner( System.in);
		String s2= sc.nextLine();
		String output="";
		int count =0;
		
		for ( int i=s1.length()-1, j= s2.length()-1;j>=0 ; i--, j--) {
			
			if(s1.charAt(i)==s2.charAt(j)) {
				count++;
			}
		}
			
			if( count==s2.length()) {
				System.out.println("string match is found");
			}
			else {
				System.out.println("no match found");
			}
			
			sc.close();
			sc2.close();

		
	 //System.out.println("output  " + output);
	}

}
