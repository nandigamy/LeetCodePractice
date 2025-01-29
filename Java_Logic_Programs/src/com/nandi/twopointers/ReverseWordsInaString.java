package com.nandi.twopointers;

public class ReverseWordsInaString {
	
	public static String reverseWordsInaString(String str) {

		String result = "";
		String trimmed = str.trim();

		String[] trim = trimmed.split(" ");

		for (String st : trim) {

			System.out.println(" " + st);

		}

		for (int i = trim.length - 1; i >= 0; i--) {

			if (!trim[i].isEmpty()) {

				result = result + trim[i] + " ";
			}
		}

		return result.trim();

	}
	
	
	public static String reverseWordsInaString3( String str) {
		
		str = str.replaceAll("\\s+", " ").trim();
		char[] ch= str.toCharArray();
		
		int length= ch.length-1;
		reverse(ch, 0, length);
		
		int start =0;
		
		for(int end=0; end<=length; end++) {
			if(ch[end]==' ') {
				reverse(ch, start, end-1);
				start=end+1;
				
			}
		}
		reverse(ch, start, length);
		
		
		return new String(ch);
		
	}
	
	
	
	
	
	public static String reverseWordsInaString2( String str) {
		
		char[] ch= reverseString(str).toCharArray();
	int start=0;
	int end=0;
	//System.out.println(str.indexOf(end));
	while( end<=ch.length-1) {
		
	
		if( ch[end]==' ') {
			
			reverse(ch, start, end-1);
			start= end+1;
		}
		end++;
	
	}
	
	    reverse(ch, start, end-1);
		return new String(ch);
		
		
	}
	
	private static void reverse(char[] charArray, int left, int right) {
	    while (left < right) {
	        char temp = charArray[left];
	        charArray[left] = charArray[right];
	        charArray[right] = temp;
	        left++;
	        right--;
	    }
	}
	

	private static String reverseString(String str) {
		
		char[] charArray = str.toCharArray();
		int left =0;
		int right=charArray.length-1;
		while(left<right) {
			
			swap(charArray, left, right);
			left++;
			right--;
		}
		
		return new String(charArray);
	}


	private static void swap(char[] charArray, int left, int right) {

		char temp= charArray[left];
		charArray[left]= charArray[right];
		charArray[right]= temp;
	}


	public static void main(String[] args) {

	System.out.println(	reverseWordsInaString3("Hello     World"));
		
	}

}
