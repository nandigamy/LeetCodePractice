package com.nandi.sortingandsearch;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		
		int [] Array1 = { 48, 35, 15, 10, 45,60, 5};
		
		
		SelectionSort sS = new SelectionSort();
		
		sS.sort(Array1);
		
		
			
			System.out.println("Sorted Array" +Arrays.toString(Array1));
		}
		
		
	public void sort (int[] numbers) {
		
		int n = numbers.length;
		for ( int i=0; i<n-1; i++) {
			
			int minIndex=i;
			
			for ( int j=i+1; j<n; j++) {
				
				if(numbers[j]< numbers[minIndex]) {
					minIndex= j;
					
				}
			}
			
			swap(numbers, i, minIndex);
		}
		
	}

	
	public void swap ( int [] array, int i, int j) {
		int temp = array[i];
		array[i]= array[j];
		array[j]= temp;
	}

}


