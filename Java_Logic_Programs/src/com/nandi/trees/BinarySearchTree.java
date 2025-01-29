package com.nandi.trees;

public class BinarySearchTree {
	
	public BSTNode insertRecursive( BSTNode root, int data) {
		
		if ( root == null) {
			
			return new BSTNode(data);
		}
		
		else if( data< root.getData()) {
			
			
			root.setLeft(insertRecursive(root.getLeft(), data));
			
		}
		
		else {
			
			root.setRight(insertRecursive(root.getRight(), data));
			
		}
		
		
		return root;
		
		
	}
	
	public BSTNode insert(BSTNode root, int data ) {
		
		return insertRecursive(root,data);
	}
	
	
	public void inOrder(BSTNode node) {
		
		if(node!=null) {
			inOrder(node.getLeft());
			System.out.println(" "+ node.getData());
			inOrder(node.getRight());	
			
			
		}
	}
	
public void preOrder(BSTNode node) {
		
		if(node!=null) {
			
			System.out.println(" "+ node.getData());
			preOrder(node.getLeft());
			
			preOrder(node.getRight());	
			
			
		}
	}
	
public void postOrder(BSTNode node) {
	
	if(node!=null) {
		postOrder(node.getLeft());
		postOrder(node.getRight());
		System.out.println(" "+ node.getData());
		
	}
}

public int max( BSTNode root) {
	
	int max=0;
	 if(root!=null) {
		 
		int lMax= max(root.getLeft());
		int rMax= max(root.getRight());
		 
		if(lMax>rMax) {
			max=lMax;
		}
		else {
			max=rMax;
		}
			
		if(root.getData()>max) {
			max=root.getData();
		}
	 }
	 
	 
	 return max;
}
	

public boolean search(BSTNode root, int data ){
	
	if(root ==null) {
		return false;
		
	}
	
	if(root.getData()==data) {
		
		return true;
	}
	
	if(root!=null) {
		
	return( search(root.getLeft(),data) || search(root.getRight(),data));
	}
	return false;
	
	
	
	


}

public boolean binarySearch(BSTNode root, int data) {
	
	if( root ==null) {
		
		return false;
	}
	
if(root.getData()==data) {
		
		return true;
	}

if( data>root.getData()) {
	
	return (search(root.getRight(),data));
}
else {
	return (search(root.getLeft(),data));
}
	
}

public BSTNode findMinBST(BSTNode root) {
	
   if( root ==null || root.getLeft()==null) {
		
		return root;
	}
   
   BSTNode min =findMinBST(root.getLeft());
   
   
	
	return min;
}


public BSTNode findMaxBST(BSTNode root) {
	
	   if( root ==null || root.getRight()==null) {
			
			return root;
		}
	   
	   BSTNode max =findMaxBST(root.getRight());
	   
	   
		
		return max;
	}

public int height(BSTNode root) {
	
	if(root==null) {
		return 0;
	}
		int lCount=height(root.getLeft());
	
		int rCount=height(root.getRight());
	return (lCount>rCount)? lCount+1 : rCount+1;	
}

public int size(BSTNode root) {
	
	
	if(root==null) {
		return 0;
	}
		int lSize=size(root.getLeft());
	
		int rSize=size(root.getRight());
	return (lSize+rSize+1);
	
		
	
}

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		
		BSTNode root = bst.insert(null,  5);
		
		root = bst.insert(root,3);
		root = bst.insert(root,4);
		root = bst.insert(root,2);
		root = bst.insert(root,6);
		root = bst.insert(root,7);
		root = bst.insert(root,8);
		
		//bst.inOrder(root);
	//	bst.preOrder(root);
		//bst.postOrder(root);
		
		//System.out.println(bst.max(root));
		//System.out.println("search  " + bst.search(root, 0));
		
		//System.out.println("height " + bst.height(root));
		
		System.out.println("size "+ bst.size(root));
		
		//System.out.println("binary searcg "+ bst.binarySearch(root, 9));
		
		System.out.println("min node "+ (bst.findMinBST(root)).getData());
		
		System.out.println("max node "+ (bst.findMaxBST(root)).getData());

		
	}

}
