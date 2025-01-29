package com.nandi.fastandslowpointers;

public class HappyNumber {
	
	
	public static boolean isHappyNumber(int n) {
		
		if(n==1) {
			return true;
		}

		int slowP=n;
		int fastP= squareDigits(n);
		
		while( fastP!=slowP) {
			
			slowP=squareDigits(slowP);
			fastP= squareDigits(fastP);
			fastP=squareDigits(fastP);
			if(fastP==1) {
				return true;
			}
		}
		
		
		return false;
    }
	
	public static int squareDigits(int n) {
		int result = 0;
		while (n > 0) {

			int digit  = n % 10;
			result = result + digit* digit;
			n= n/10;

		}
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(" is happy number " + isHappyNumber(28));
		System.out.println(" is happy number " + isHappyNumber(4));


	}
	

}
