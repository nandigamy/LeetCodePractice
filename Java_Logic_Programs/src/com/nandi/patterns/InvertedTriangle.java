package com.nandi.patterns;

import java.util.Scanner;

public class InvertedTriangle {

	public static void main(String[] args) {

		
		System.out.println(" enter a number");
		Scanner sc = new Scanner( System.in);
		int num= sc.nextInt();
		
		for( int i=num; i>0; i--) {
			
			for ( int j=1;j<=i; j++) {
				
				System.out.print(j + " ");
			}
			
			System.out.println(" ");
			
		}
		sc.close();

	}

}
