package com.nandi.javaprograms;

import java.util.Scanner;

public class FindFibanocciWithRecursion {

	private static int fibonacci( int n) {
		if( n==0 || n==1) {
			return n;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {

	System.out.println(" enter a number");
	
	Scanner sc = new Scanner( System.in);
	
	int num = sc.nextInt();
	
//	int [] fb= new int[10];
//	fb[0]=0;
//	fb[1]=1;
//	System.out.println(fb[0]);
//	System.out.println(fb[1]);
//	
//	for( int n=2; n<num; n++) {
//	
//		fb[n]= fb[n-1]+fb[n-2];
//		System.out.println(fb[n]);
//		n--;
//		
//		
//	}
	
	for ( int i=0; i<num; i++) {
		System.out.println(fibonacci(i)+ " ");
	}
	sc.close();

	
	}

}
