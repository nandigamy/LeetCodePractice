package com.nandi.sortingandsearch;

public class RecursiveBinarySearch {

	public static void main(String[] args) {

		
		
		
	      int [] array = { 3, 5,  10, 15, 25, 40};
			
			System.out.println(recursiveBinarySearch(array, 40, 0, array.length-1));
			
			
		}
	
	private static int recursiveBinarySearch(int[] a, int target, int low, int high) {
		
		if( low>high) {
			
			return -1;
			
		}
		
		
		int mid = (low +high )/2;
		
		if( a[mid]== target) {
			
			return target;
		}
		else if( a[mid]<target) {
			return recursiveBinarySearch(a,  target,  mid+1,  high);
			
		}
		else {
			return recursiveBinarySearch(a,  target,  low,  mid-1);
		}
	
		
		
		
		
		
		
		
	}
	
	
	
	
}


