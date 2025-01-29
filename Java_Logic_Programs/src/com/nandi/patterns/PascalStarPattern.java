package com.nandi.patterns;

import java.util.Scanner;

public class PascalStarPattern {

	public static void main(String[] args) {

		

		System.out.println(" enter a number");
		Scanner sc = new Scanner( System.in);
		int num= sc.nextInt();
		
		
		for ( int i=0; i<num; i++)
		{
			for ( int j=0; j<=i; j++)
			{
				System.out.print("X");
			}
			System.out.println();
		}
		
		

		for ( int i=1; i<num; i++)
		{
			for ( int j=i; j<num; j++)
			{
				System.out.print("X");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

} 
