package com.nandi.sortingandsearch;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		int [] Numbers = { 25, 35, 15, 10, 45,60, 5};
		
		
		BubbleSort bs = new BubbleSort();
		
		bs.sort(Numbers);
		
		for( int i=0; i<Numbers.length; i++) {
			
			System.out.println(Numbers[i]+ " ");
		}
		
	}
	
	
	public void sort (int[] numbers) {
		
		
		for ( int i=0; i<numbers.length-1; i++) {
			
			for ( int j=0; j<numbers.length-i-1; j++) {
				
				if ( numbers[j]>numbers[j+1]) {
					int temp= numbers[j];
					numbers[j]= numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
		
		
		
	
		
	}

}
