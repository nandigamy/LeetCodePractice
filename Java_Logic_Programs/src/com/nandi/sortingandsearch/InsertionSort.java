package com.nandi.sortingandsearch;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
int [] Array1 = { 25, 15,  10, 54,3};
		
		
InsertionSort sS = new InsertionSort();
		
		sS.sort(Array1);
		
		
			
			System.out.println("Sorted Array" +Arrays.toString(Array1));
		}
	
	
	
public void sort (int[] numbers) {
		
		int n = numbers.length;
		for ( int i=1; i<n; i++) {
			
			int j=i-1;
			
			while( j>= 0 && numbers[j+1]< numbers[j] ) {
				
				swap(numbers, j, j+1);
				
				j--;
				
			}
			
			
		}
	 }
		
public void swap ( int [] array, int i, int j) {
	int temp = array[i];
	array[i]= array[j];
	array[j]= temp;
}


	}


