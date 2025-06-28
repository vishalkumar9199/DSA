// DFS class will implement in BinarySearchTress class
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
