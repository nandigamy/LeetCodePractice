package com.nandi.javaprograms;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		
System.out.println(" enter a String");
		
		Scanner sc = new Scanner( System.in);
		String s= sc.next();
		//StringBuffer sb = new StringBuffer() ;
		String output ="";
		for ( int i=s.length()-1; i>=0; i--) {
			 //sb.append(s.charAt(i));
			// System.out.println( sb);
			output += s.charAt(i);
		}
		if(output.equals(s)) {
			System.out.println("The string is a palindrome");
		}
		
		//System.out.println(" eString " + sb);
		System.out.println(output);
		sc.close();

	}
	
	

}
