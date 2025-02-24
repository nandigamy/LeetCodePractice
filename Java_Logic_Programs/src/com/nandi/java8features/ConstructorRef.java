package com.nandi.java8features;


interface Interf
{
	public Sample get();
}

public class ConstructorRef {
	
	


	
	public static void main(String[] args) {

		Interf i = Sample::new;
		Sample s= i.get();
	}

}



	

