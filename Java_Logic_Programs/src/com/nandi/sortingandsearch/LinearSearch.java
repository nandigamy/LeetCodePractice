package com.nandi.sortingandsearch;

public class LinearSearch {

	public static void main(String[] args) {

		int [] array = { 25, 35, 15, 10, 45,60, 5};
		
		System.out.println(linearSearch(array, 11));
		
		
	}
		
		private static int linearSearch( int [] a, int target) {
			
			
			
			for( int i=0; i< a.length; i++) {
				
				if(a[i]==target) {
					
					
					 
					 System.out.println("taget element fopund at index  " + i);
					 
					 return i;
					 
				 
				}
				
				
			}
		
			
			
			
		
			return -1;
			
		}
		
	}
		
//		int target =5;
//		boolean found = false;
//		
//		for( int i=0; i< array.length; i++) {
//			
//			if(array[i]==target) {
//				
//				 found = true;
//				 
//				 System.out.println("taget element fopund at index  " + i);
//				 
//				 break;
//				
//				 
//			}
//			
//			
//		}
//		
//		if(!found) {
//		System.out.println("element is not in the list");
//		}
		



