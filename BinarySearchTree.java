import java.util.*;
public class BinarySearchTree {
	Node root;

  
	class Node{
		 int value;
		 Node left;
		 Node right;
		
		Node(int value){
			this.value=value;
		}
	}
		
	
//	   Insert Method..
	
	public boolean insert(int value) {
		Node newNode = new Node(value);
		if(root==null) {
			root=newNode;
			return true;
		}
		Node temp=root;
		while(true) {
			if(newNode.value == temp.value) return false;
			if(newNode.value < temp.value) {
				if(temp.left == null) {
					temp.left=newNode;
					return true;
				}
				temp=temp.left;
			}else {
				if(temp.right == null) {
					temp.right=newNode;
					return true;
				}
				temp=temp.right;
			}
		}
	}

  
	
//	  Contain Method.. 
	public boolean contain(int value) {
		Node temp=root;
		while(temp!=null) {
			if(value<temp.value) {
				temp=temp.left;
			}else if(value>temp.value) {
				temp=temp.right;
			}else {
				return true;
			}
		}
		return false;
	}

  // Main class
 	public static void main(String[] args) {

 		BinarySearchTree myBst= new BinarySearchTree();
 		
 		myBst.insert(47);
 		myBst.insert(21);
 		myBst.insert(76);
 		myBst.insert(18);
 		myBst.insert(52);
 		myBst.insert(82);
 		
 		myBst.insert(52);
 		
 		System.out.println(myBst.root.left.right.value);
 		

	}

}
