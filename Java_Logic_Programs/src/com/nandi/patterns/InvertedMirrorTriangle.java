package com.nandi.patterns;

import java.util.Scanner;

public class InvertedMirrorTriangle {

	public static void main(String[] args) {

		
		
		System.out.println(" enter a number");
		Scanner sc = new Scanner( System.in);
		int num= sc.nextInt();
		
		
		for ( int i=num; i>0; i--) {
			
			System.out.print(" ");
			
			int k=num;
			 while(k-i>=1) {
				 
				 System.out.print("X");
				 k--;
				 
			 }
		
			
			for ( int j=num-i+1 ; j<=num; j++) {
				
				
				System.out.print(j);
				
				
			}
			
			
			
			System.out.println(" ");
		}
		
		sc.close();

	}

}
