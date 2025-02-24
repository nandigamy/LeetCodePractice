package com.nandi.java8features;


// this is an exmaple for method reference for a static methiod..
interface TestInterfMethodRef{
	
	public void m1();
}

public class MethodRef {
	
	public static void m2() {
		System.out.println("Implementation by method reference m2");
	}
	

	public static void main(String[] args) {

		
		TestInterfMethodRef t = MethodRef::m2; //syatac --classname:: methodname
		t.m1();
	}

}
