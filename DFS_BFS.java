// BFS and DFS class will implement in BinarySearchTree class


	       // BFS
	public ArrayList<Integer>BFS(){
	Node currentNode=root;
	Queue<Node>queue=new LinkedList<>();
	ArrayList<Integer>result=new ArrayList<>();
	queue.add(currentNode);
	
	while(queue.size()>0) {
		currentNode=queue.remove();
		result.add(currentNode.value);
		if(currentNode.left!=null) {
			queue.add(currentNode.left);
		}
		if(currentNode.right!=null) {
			queue.add(currentNode.right);
		}
	}
	return result;
}

//	        DFSPreorder

	public ArrayList<Integer>DFSPreorder(){
		ArrayList<Integer>result=new ArrayList<>();
		
		class Traverse{
			Traverse(Node currentNode){
				result.add(currentNode.value);
				if(currentNode.left!=null) {
					new Traverse(currentNode.left);
				}
				if(currentNode.right!=null) {
					new Traverse(currentNode.right);
				}
			}
		}
		new Traverse(root);
		return result;
	}
	
//	DFSPostorder

	public ArrayList<Integer>DFSPostorder(){
		ArrayList<Integer>result=new ArrayList<>();
		
		class Traverse{
			Traverse(Node currentNode){
				if(currentNode.left!=null) {
					new Traverse(currentNode.left);
				}
				if(currentNode.right!=null) {
					new Traverse(currentNode.right);
				}
				result.add(currentNode.value);

			}
		}
		new Traverse(root);
		return result;
	}
	
////	DFS Inorder

	public ArrayList<Integer>DFSInorder(){
		ArrayList<Integer>result=new ArrayList<>();
		
		class Traverse{
			Traverse(Node currentNode){
				if(currentNode.left!=null) {
				new Traverse(currentNode.left);
				}
				result.add(currentNode.value);			
				if(currentNode.right!=null) {
					new Traverse(currentNode.right);
				}
				

			}
		}
		new Traverse(root);
		return result;
	}

