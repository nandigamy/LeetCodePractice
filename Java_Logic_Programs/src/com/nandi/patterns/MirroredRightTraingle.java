package com.nandi.patterns;

import java.util.Scanner;

public class MirroredRightTraingle {

	public static void main(String[] args) {

	
		System.out.println(" enter a number");
		Scanner sc = new Scanner( System.in);
		int num= sc.nextInt();
		
		
		for( int i=num; i>0; i--) {
			

			
			
			int k=i;
			while(k>=1) {
				System.out.print(" ");
				k--;
			}
			
			
			for (int j=i; j<=num; j++ ) {
				
				
				System.out.print(j);
				
			}
			
			System.out.println();
		}
		
		
		sc.close();

		
	 }
		
		
		
		
		
}


