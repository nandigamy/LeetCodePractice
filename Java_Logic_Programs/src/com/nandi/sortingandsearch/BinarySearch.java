package com.nandi.sortingandsearch;

public class BinarySearch {

	public static void main(String[] args) {

		
      int [] array = { 3, 5,  10, 15, 25, 40};
		
		System.out.println(binarySearch(array, 40));
		
		
	}
	
	
	
	private static int binarySearch( int [] a, int target) {
		
		
		int n = a.length;
		
		int low = 0;
	     int high = n-1;
	     
	     
	     
	     while ( low <= high) {
	    	 
	    	 int mid = (low+ high)/2;
	    	 
	    	 if( a[mid]==target) {
	    		 
	    		 return target;
	    	 }
	    	 
	    	 else if (a[mid]<target){
	    		 
	    		 low = mid+1;
	    		 
	    	 }
	    	 else {
	    		 
	    		 high = mid -1;
	    		 
	    	 }
	     }
		
		return -1;
		
		
	}

}
