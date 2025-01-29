package com.scott.LinkedList;

public class TestLinkedList {

	
	


	    public static void main(String[] args) {

	        LinkedList myLinkedList = new LinkedList(1);
            myLinkedList.append(2);
            myLinkedList.append(3);
	        myLinkedList.append(4);
	        myLinkedList.append(5);
	      //  myLinkedList.append(2);
	       
//	       myLinkedList.prepend(3);
//	       myLinkedList.append(2);
//	        myLinkedList.append(8);
//	        myLinkedList.append(9);
//	        myLinkedList.append(10);
//	        myLinkedList.append(11);
//	        myLinkedList.append(12);
//	        myLinkedList.append(13);

	        System.out.println("\nLinked List:");
	        myLinkedList.printList();
	        
	        
	        
	        myLinkedList.getHead();
	        myLinkedList.getTail();
	        myLinkedList.getLength();
	        

	        System.out.println("\nLinked List:");
	      System.out.println(  myLinkedList.removeFirst().getValue() );
	        myLinkedList.printList();
	        
	   //  System.out.println(  myLinkedList.remove(7) ); ;
	        
//	        myLinkedList.reverse();
	        
	       
	      //  System.out.println("slow ptr " + myLinkedList.findMiddleNode().getValue());
	        
	       // System.out.println("find node from last  " + myLinkedList.findKthFromEnd(9).getValue());
	        
//	      System.out.println( "index at "+  myLinkedList.get(7).getValue());
//	      
//	      System.out.println( "set at "+  myLinkedList.set(6,10));
	        
	        
//	        myLinkedList.removeFirst();
//	        
//	       // System.out.println("last value "+ myLinkedList.removeLast().getValue());
//	      
//	      
//	         
//	        
	      
	        //myLinkedList.reverseBetween(0, 3);
	       // myLinkedList.partitionList(3);
	       // myLinkedList.reverseBetween(2, 4);
	       // myLinkedList.removeDuplicates();
//	        System.out.println("\n after rev Linked List:");
//        myLinkedList.printList();
//	        
//	        myLinkedList.getHead();
//	        myLinkedList.getTail();
//	        myLinkedList.getLength();
//	        
//	       // myLinkedList.removeFirst(); myLinkedList.printList();
//	        
//	        
//	        myLinkedList.getHead();
//	        myLinkedList.getTail();
//	        myLinkedList.getLength();

	        /*
	            EXPECTED OUTPUT:
	            ----------------
	            Head: 4
	            Tail: 4
	            Length: 1
	            
	            Linked List:
	            4

	        */

	    }

	}
	

