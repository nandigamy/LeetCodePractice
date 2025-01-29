package com.nandi.sortingandsearch;

import java.util.Arrays;

public class BubbleSortUpdated {

	public static void main(String[] args) {

		
		
	int [] Array1 = { 48, 35, 15, 10, 45,60, 5};
		
		
		BubbleSort bs = new BubbleSort();
		
		bs.sort(Array1);
		
		//for( int i=0; i<Array1.length; i++) {
			
			//System.out.println(Array[i]+ " ");
			
			System.out.println("Sorted Array" +Arrays.toString(Array1));
		}
		
		public void sort(int[] array) {
			
			if( array== null || array.length <=1) {
				return;
			}
			
			int n = array.length;
			
			while( n>1) {
				
				int lastSwappedIndex =0;
				
			for (	int j=0; j<n-1; j++){
				
				if(array[j]> array[j+1]) {
					
					swap( array, j, j+1);
					
					lastSwappedIndex =j+1;
					
					
				}
			}
			
			n= lastSwappedIndex;
				
			}
			
			
		}

		
		
		public void swap ( int [] array, int i, int j) {
			int temp = array[i];
			array[i]= array[j];
			array[j]= temp;
		}
	
	}
	
	
	
	
	
		
	


