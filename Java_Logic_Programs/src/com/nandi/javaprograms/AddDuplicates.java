package com.nandi.javaprograms;

import java.util.Scanner;

public class AddDuplicates {

	public static void main(String[] args) {

		System.out.println(" enter a String");
		Scanner sc = new Scanner( System.in);
		String s= sc.nextLine();
		String output="";
		
		for ( int i=0; i< s.length(); i++) {
			
			output+=s.charAt(i);
			output+=s.charAt(i);
			
		}
		
		System.out.println("output " +output);
		sc.close();
		
	}
	
	

}
