package com.nandi.patterns;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {

	
	
		System.out.println(" enter a number");
		Scanner sc = new Scanner( System.in);
		int num= sc.nextInt();
		
		for( int i=1; i<=num; i++) {
			
			for ( int j=1;j<i+1; j++) {
				
				System.out.print(j + " ");
			}
			
			System.out.println(" ");
			
		}
		sc.close();

	
	}

}
