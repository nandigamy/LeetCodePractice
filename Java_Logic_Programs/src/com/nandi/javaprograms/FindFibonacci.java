package com.nandi.javaprograms;

import java.util.Scanner;

public class FindFibonacci {

	public static void main(String[] args) {
		
		System.out.println(" enter a number");
		
		Scanner sc = new Scanner( System.in);
		int num= sc.nextInt();
		
		int n1=0 ;
		int n2=1;
		System.out.println(n1 );
		System.out.println(n2 );
		
		for ( int i=2; i<num; i++) {
			int n3= n1+n2;
			System.out.println(n3 + " ");
			
			n1=n2;
			n2=n3;
		}
		sc.close();


	}

}
