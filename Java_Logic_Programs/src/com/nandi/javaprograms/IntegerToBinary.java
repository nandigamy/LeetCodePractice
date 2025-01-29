package com.nandi.javaprograms;

import java.util.Scanner;

public class IntegerToBinary {

	public static void main(String[] args) {
		System.out.println("enter a number :");
		
		Scanner scanner = new Scanner (System.in);
		
		int num = scanner.nextInt();
		
		// simple solution using inbuilt function
		
		System.out.println(Integer.toBinaryString(num));
		int [] binaryNum = new int[10];
		
		int i =0;
		
		while ( num!=0) {
			
			binaryNum[i]= num%2;
			
			num= num/2;
			i++;
		}
		
		for( int j=i-1; j>=0 ; j--) {
			System.out.println(binaryNum[j]);
		}
		scanner.close();

	}

}
