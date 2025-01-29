package com.nandi.patterns;

import java.util.Scanner;

public class ReversePascalTriangle {

	public static void main(String[] args) {

		
		
		System.out.println(" enter a number");
		Scanner sc = new Scanner( System.in);
		int num= sc.nextInt();
		
		
		for ( int i=1; i<=num; i++)
		{
			for ( int j=0; j<num; j++)
			{
				if (j<(num-i)) {
				System.out.print(" ");
				}
				else {
					System.out.print("X");
				}
			}
			System.out.println();
		}
		
		
		
		for ( int i=1; i<num; i++)
		{
			for ( int j=0; j<num; j++)
			{
				if (j<i) {
				System.out.print(" ");
				}
				else {
					System.out.print("X");
				}
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
