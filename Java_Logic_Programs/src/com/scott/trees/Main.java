
package com.scott.trees;

public class Main {

	public static void main(String[] args) {

		
		
		BinarySearchTree myBST = new BinarySearchTree();
		System.out.println("Root  "+ myBST.root );
		myBST.insert(47);
		myBST.insert(21);
		myBST.insert(76);
		myBST.insert(18);
		myBST.insert(52);
		myBST.insert(82);
		//myBST.insert(52);
		

		//System.out.println(myBST.root.getLeft().getRight().getValue());
		
		System.out.println(myBST.contains(53));
		//System.out.println(myBST.rContains(52));
		
		

		BinarySearchTree myBST1 = new BinarySearchTree();
		System.out.println("Root  "+ myBST.root.getValue() );
		myBST1.rInsert(10);
		myBST1.rInsert(5);
		myBST1.rInsert(15);
//		myBST1.rInsert(7);
//		myBST1.rInsert(52);
//		myBST1.rInsert(82);
		System.out.println("Root  "+ myBST1.root.getValue() );
		System.out.println("Root left  "+ myBST1.root.getLeft().getValue());
		System.out.println("Root left  "+ myBST1.root.getRight().getValue());
		
		//myBST1.rDelete(15);
//		myBST1.invert();
//		System.out.println("Root  "+ myBST1.root.getValue() );
//		System.out.println("Root left  "+ myBST1.root.getLeft().getValue());
//		System.out.println("Root right  "+ myBST1.root.getRight().getValue());
		
		//System.out.println(myBST.contains(53));
		//System.out.println(myBST1.rContains(52));
		
		BinarySearchTree myBST2 = new BinarySearchTree();
		
		int[] sortedArray = {1, 2, 3, 4, 5, 6, 7};

        // Convert the sorted array to a balanced BST
        Node inorder = myBST2.sortedArrayToBST(sortedArray);
        myBST2.printInOrder(inorder);

		
	}

}
