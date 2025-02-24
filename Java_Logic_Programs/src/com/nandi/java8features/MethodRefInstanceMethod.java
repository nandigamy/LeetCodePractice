package com.nandi.java8features;

public class MethodRefInstanceMethod {
	
	
	public void m1() {
		
		for ( int i=0; i<10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {

		MethodRefInstanceMethod t = new MethodRefInstanceMethod();
		
		//Runnable r = t::m1;
		
		// normal implementation
//		Runnable r = new Runnable() {
//			
//			@Override
//			public void run() {
//				t.m1(); // code to be executed in new thread
//				
//			}
//		};
		
		//Runnable r  =() -> t.m1(); //lambda expression
		
		//using ,methid refrebnce
		Runnable r = t::m1;
		
		
		Thread t1= new Thread(r);
		
		t1.start();
		for ( int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
		
	}

}
