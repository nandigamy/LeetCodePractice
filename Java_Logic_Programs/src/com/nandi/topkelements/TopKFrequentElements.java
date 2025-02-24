package com.nandi.topkelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class TopKFrequentElements {
	
	 public static List<Integer> topKFrequent(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr) {
        	map.put(num, map.getOrDefault(num, 0)+1);
        	
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Map.Entry.comparingByValue());
//		 
//     map.entrySet().stream().limit(k).forEach(entry-> minHeap.add(entry));
//     map.entrySet().stream().skip(k).forEach(entry->{
//    	 
//    	 if (entry.getValue()>minHeap.peek().getValue()) {
//    		 minHeap.poll();
//    		 minHeap.add(entry);
//    	 }
//     });
     
     for(Map.Entry<Integer, Integer> entry:map.entrySet()){
    	 
    	 minHeap.add(entry);
    	 if(minHeap.size()>k) {
    		 minHeap.poll();
    	 }
    	 
    	 
    	 
     }
        
		 return minHeap.stream().map(Map.Entry::getKey).collect(Collectors.toList());
	    }
	
	

	public static void main(String[] args) {

		
		int[] arr = {1,1,2,4,5,5};
	    System.out.println(topKFrequent(arr,2));
		
		
	}

}
