package com.nandi.HeapImplementation;

import java.util.ArrayList;

public class HeapOperations {
	
	static ArrayList<Integer> heap = new ArrayList<>();
	
	public static  void heapInsert(int n) {
		
		heap.add(n);
		
		System.out.println("heap" + heap);
		
	int	childIndex= heap.size()-1;
	
	int parentIndex= getParentIndex(childIndex); 
	
	while( childIndex>0 && heap.get( parentIndex)<heap.get(childIndex)) {
		
		swap( parentIndex ,childIndex);
		
		childIndex=parentIndex ;
		parentIndex= getParentIndex(childIndex); 
		
	}
	
	System.out.println("index "+ childIndex + "parentInde" + parentIndex) ;
		
	}
	
	public static int heapDelete() {
		
		
		int result= heap.get(0);
		heap.set(0, heap.remove(heap.size()-1));
		
		
		int largestIndex=0;
		int childIndex=0;
		
		
	while( true)	{
		
		largestIndex= childIndex;
		if(getLeftChildIndex(childIndex) < heap.size() && heap.get(childIndex)<heap.get(getLeftChildIndex(childIndex))) {
			
			largestIndex=getLeftChildIndex(childIndex);
		}
		
     if(getRightChildIndex(childIndex) < heap.size() && heap.get(largestIndex)<heap.get(getRightChildIndex(childIndex))) {
			
			largestIndex=getRightChildIndex(childIndex);
		}
		
     
     if(largestIndex== childIndex) {
    	 break;
     }
     swap(largestIndex,childIndex);
     
     childIndex= largestIndex;
	}	
		return result;
		
	}
	
	public static int getParentIndex(int index) {
		
		return (index-1)/2;
	}
	
public static int getLeftChildIndex(int index) {
		
		return (index*2+1);
	}

public static int getRightChildIndex(int index) {
	
	return (index*2+2);
}
	

	public static void swap(Integer index1, Integer index2) {

		int temp = heap.get(index1);
		heap.set(index1, heap.get(index2));
		heap.set(index2, temp);
	}


	public static void main(String[] args) {

		heapInsert(10);
		heapInsert(20);
		heapInsert(30);
		heapInsert(40);
		System.out.println("heap Insert" + heap);
		
		heapDelete();
		System.out.println("heap Delete" + heap);
		
		heapDelete();
		System.out.println("heap Delete" + heap);
		
		
	}

}
