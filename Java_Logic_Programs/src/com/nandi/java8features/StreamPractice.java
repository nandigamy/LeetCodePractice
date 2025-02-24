package com.nandi.java8features;

import java.util.ArrayList;

public class StreamPractice {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<>();
		l.add(0); l.add(10); l.add(20); l.add(5);l.add(15);l.add(25);
		
		Integer[] array = l.stream().toArray(Integer[]::new);
		for(Integer x: array) {
			System.out.println(x);
		}
		
		System.out.println("fin");
		
		Integer[] array1 = l.stream().toArray(x -> new Integer[x]);
		for(Integer x: array1) {
			System.out.println(x);
		}
	}
	

}
