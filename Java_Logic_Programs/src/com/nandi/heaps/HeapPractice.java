package com.nandi.heaps;
import java.util.*;

public class HeapPractice {

	private  List<Integer> heap;
	
	public HeapPractice() {
		
		heap= new ArrayList<>();
	}
	
	public List<Integer> getHeap() {
		return new ArrayList<>(heap);
	}
	
	
	private int getLeftChild(int index) {
		
		return 2*index+1;
	}
	
	private int getRightChild(int index) {
		
		return 2*index+2;
	}
	
	private int getParent(int index) {
		return (index-1)/2;
	}
	
	private void swap(int index1, int index2) {
		
		int temp=heap.get(index1);
		heap.set(index1, heap.get(index2));
		heap.set(index2, temp);
		
	}
	
	public boolean insert(int value) {
		heap.add(value);
		int index= heap.size()-1;
		while(index>0 && heap.get(index)>heap.get(getParent(index))) {
			
			swap(index, getParent(index));
			
			index= getParent(index);
			
		}
		
		
		return false;
		
		
	} 
	
	/*
	public void remove(int index) {
		
		//heap.remove(0);
		
		int maxValue = heap.get(0);
		heap.set(0, heap.remove(heap.size()-1));
		
		int parent=index;
		
		while( true) {
			
			if(getLeftChild(parent)<heap.size() && heap.get(parent)<heap.get(getLeftChild(parent))) {
				
				//swap(parent, getLeftChild(parent));
				parent=getLeftChild(parent);
			} 
			
		if( getRightChild(parent)<heap.size() && heap.get(parent)<heap.get(getRightChild(parent))) {
				
				//swap(parent, getRightChild(parent));
			//heap.get(parent)>heap.get(getLeftChild(parent)) &&
			
			parent=getRightChild(parent);
			} 
		
		if( parent!=index) {
			swap(index, parent);
			index=parent;
		}
		else {
			return;
		}
		}
		
		
	}
	
	*/
	
	public void remove(int index) {
	    // Replace the element at index with the last element
	    heap.set(index, heap.remove(heap.size() - 1));

	    // Reheapify: Bubble down the replaced element
	    int parent = index;
	    while (true) {
	        int leftChild = getLeftChild(parent);
	        int rightChild = getRightChild(parent);
	        int largest = parent;

	        // Find the largest among parent and its children
	        if (leftChild < heap.size() && heap.get(leftChild) > heap.get(largest)) {
	            largest = leftChild;
	        }
	        if (rightChild < heap.size() && heap.get(rightChild) > heap.get(largest)) {
	            largest = rightChild;
	        }

	        // If the parent is already the largest, stop
	        if (largest == parent) {
	            break;
	        }

	        // Swap and continue
	        swap(parent, largest);
	        parent = largest;
	    }
	}

	
	public  int findKthSmallest(int [] nums, int k) {
		
		HeapPractice myHeap1 = new HeapPractice();
		
	
		
		for(int i=0; i<k; i++) {
			
			myHeap1.insert(nums[i]);
		}
		
		
        for(int i=k; i<nums.length; i++) {
			
			if( nums[i]<myHeap1.getHeap().get(0)) {
				myHeap1.remove(0);
				myHeap1.insert(nums[i]);
			}
		}
		
		
		return myHeap1.getHeap().get(0);
		
		
	}
	
	
	public  List<Integer> streamMax(int[] nums){
		
		

		HeapPractice myHeap2 = new HeapPractice();
		
	
		List<Integer> result = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			
			myHeap2.insert(nums[i]);
			result.add(myHeap2.getHeap().get(0));
		}
		
		
		return result;
		
		
	}
	
	
	
	public static void main(String[] args) {
		HeapPractice myHeap = new HeapPractice();
		myHeap.insert(99);
		myHeap.insert(72);
		myHeap.insert(61);
		myHeap.insert(58);
		
		System.out.println(myHeap.getHeap());
		
		myHeap.insert(100);
		
		System.out.println(myHeap.getHeap());
		
		myHeap.insert(75);
		
		System.out.println(myHeap.getHeap());
		//myHeap.remove(0);
		System.out.println(myHeap.findKthSmallest(new int[] {100, 99, 75, 58, 72, 61}, 5));
	   
		
		System.out.println(myHeap.streamMax(new int [] {10,2,5,1,0,11,6}));
		System.out.println(myHeap.streamMax(new int [] {1, 5, 2, 9, 3, 6, 8}));
		
		System.out.println(myHeap.streamMax(new int [] {3, 3, 3, 3, 3, 3, 3}));
	
	}

}
