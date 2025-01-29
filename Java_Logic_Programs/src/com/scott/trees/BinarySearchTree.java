package com.scott.trees;

public class BinarySearchTree {

	Node root;

	public BinarySearchTree() {
	}

	public boolean insert(int value) {

		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
			return true;
		}

		Node temp = root;
		while (true) {

			if (newNode.getValue() == temp.getValue()) {
				return false;
			}

			if (newNode.getValue() < temp.getValue()) {

				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();

			} else {

				if (temp.getRight() == null) {
					temp.setRight(newNode);
					return true;
				}

				temp = temp.getRight();
			}
		}

	}
	
	
	
	public boolean contains( int value) {
		if(root ==null) {
			return false;
		}
		
		Node temp = root;
		
		while( temp!=null) {
			
			if(temp.getValue()==value) {
				return true;
			}
			else if(value<temp.getValue()) {
				
				temp= temp.getLeft();
			}
			else {
				temp=temp.getRight();
			}
			
			
		}
		
		return false;
		
	}
	
	
	private  boolean rContains(Node currentNode, int value) {
		
		if( currentNode == null) {
			return false;
		}
		
		if(currentNode.getValue()== value) {
			return true;
		}
		
		if(value <currentNode.getValue()) {
			return rContains(currentNode.getLeft(), value);
			//currentNode= currentNode.getLeft();
		}
		else {
			return rContains(currentNode.getRight(), value);
			//currentNode= (currentNode.getRight());
		}
		
		//return false;
		
	}
	
	public boolean rContains(int value) {
		return rContains(root, value);
	}
	
	private Node  rInsert(Node currentNode, int value) {
		
		if( currentNode == null) {
			
			return new Node( value);
		}
		
		if(currentNode.getValue()== value) {
			return null;
		}
		

		if(value <currentNode.getValue()) {
			 currentNode.setLeft(rInsert(currentNode.getLeft(), value));
			//currentNode= currentNode.getLeft();
		}
		else {
			 currentNode.setRight(rInsert(currentNode.getRight(), value));
			//currentNode= (currentNode.getRight());
		}
		
		
		return currentNode;
		
	}
	
//	public Node rInsert1(int value) {
//		
//		return rInsert(root, value);
//	}
	
  public void rInsert(int value) {
	  if( root == null) root = new Node(value);
		
		 rInsert(root, value);
	 }
  
  
  public void rDelete(int value) {
	  
	  rDelete(root, value);
  }
	
  private Node  rDelete(Node currentNode, int value) {
	  
	  if(currentNode== null) {
		  return null;
	  }
	

		if(value <currentNode.getValue()) {
			currentNode.setLeft(rDelete(currentNode.getLeft(), value));
		}
		else if (value >currentNode.getValue()){
			currentNode.setRight(rDelete(currentNode.getRight(), value));
		} else {
			if(currentNode.getLeft()== null && currentNode.getRight()==null) {
				
				currentNode=null;
			} else if(currentNode.getLeft()!= null && currentNode.getRight()==null) {
				currentNode= currentNode.getLeft();
			} else if(currentNode.getLeft()== null && currentNode.getRight()!=null) {
				currentNode = currentNode.getRight();

			}else {
				int subTreeMin= minValue(currentNode.getRight());
				currentNode.setValue(subTreeMin);
				
				currentNode.setRight(rDelete(currentNode.getRight(), subTreeMin));
				
			}
			
		}
	  
	
	  
	  return currentNode;
	  
  }
  
  
  public int minValue(Node currentNode) {
	  while( currentNode.getLeft()!= null) {
		  currentNode= currentNode.getLeft();
	  }
	  
	  return currentNode.getValue();
  }
  
  
  public void invert() {
	  root= invertTree(root);
  }

	private Node invertTree(Node currentNode) {

//	if( currentNode.getLeft().getLeft()==null && currentNode.getRight().getRight()==null) {
//		
//		Node temp =currentNode.getLeft();
//		currentNode.setLeft(currentNode.getRight());
//		currentNode.setRight(temp);
//		return currentNode;
//	}
//	
//	
//	if( currentNode.getLeft().getLeft()!=null && currentNode.getRight().getRight()!= null) {
//		
//		currentNode.setLeft(invertTree(currentNode.getLeft()));
//		currentNode.setRight(invertTree(currentNode.getRight()));
//	}

		if (currentNode == null) {
			return null;
		}

		Node temp = currentNode.getLeft();
		currentNode.setLeft(currentNode.getRight());
		currentNode.setRight(temp);

		invertTree(currentNode.getLeft());
		invertTree(currentNode.getRight());

		return currentNode;
	}

	
	public Node  sortedArrayToBST( int [] nums) {
		return sortedArrayToBST(nums, 0, nums.length-1);
	}
	private Node sortedArrayToBST( int[] nums, int left, int right ) {
		
		//base case
		if( left>right) {
			return null;
		}
		int mid = (left+right)/2;
		
		Node root = new Node(nums[mid]);
		
		root.setLeft(sortedArrayToBST(nums,left, mid-1));
		root.setRight(sortedArrayToBST(nums,mid+1, right));
		
		return root;
		
	}
	
	// Helper to print the tree (in-order traversal)
    public void printInOrder(Node root) {
        if (root == null) {
            return;
        }
        printInOrder(root.getLeft());
        System.out.print(root.getValue() + " ");
        printInOrder(root.getRight());
    }
}
