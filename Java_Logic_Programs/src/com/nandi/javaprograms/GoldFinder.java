package com.nandi.javaprograms;

import java.util.Scanner;

public class GoldFinder {

	public static void main(String[] args) {

		

		System.out.println(" enter a String1");
		Scanner sc = new Scanner( System.in);
		String s1= sc.nextLine();
		
		s1= s1.toLowerCase();
		
		String s2= "gold";
		boolean found= false;
		
		
		for ( int i=0; i<s1.length(); i++) {
			
			int k=i, j=0; 
			
			
			for (  j=0; j<s2.length(); j++) {
				
				if(s1.charAt(k)!=s2.charAt(j)) {
					break;
				}
				k++;
				
			}
			
			if( j==s2.length()) {
				found= true;
				System.out.println("gold is found");
				break;
			}
		}
			
			if(!found) {
				System.out.println("no gold");
			}
			sc.close();


	}
	

}

//substring
//indexof
//regex pattern matcher
// these are all different methods
