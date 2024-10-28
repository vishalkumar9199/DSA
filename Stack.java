
public class Stack {
	private Node top;
	private int height;
	
	// creating Node and its constructor..
	class Node{
		int value;
		Node next;
	
	   Node(int value){
		   this.value=value;
	   }
	}
	
	// contructor of Stack class..
	public Stack(int value) {
		Node newNode = new Node(value);
		top=newNode;
		height=1;
		
	}
	
	//print method
	 public void printlist() {
		  Node temp=top;
		  while(temp!=null) {
			  System.out.println(temp.value);
			  temp=temp.next;
		  }
	  }
	 
	 //Push method
	 public void push(int value) {
		 Node newNode = new Node(value);
		 if(height==0) {
			 top=newNode;
		 }else {
			 newNode.next=top;
			 top=newNode;
		 }
		 height++;
	 }
   
	 // Pop method..
	 public Node pop(){
		 if(height==0) return null;
		 
		 Node temp=top;
		 temp.next=null;
		 
		 height--;
		 return temp;
		 
	 }
	 
	 // Main class
	public static void main(String[] args) {
		//creating object of Stack...
	Stack mystack = new Stack(1);
	mystack.push(0);
	mystack.push(3);
	mystack.push(4);
	System.out.println(mystack.pop().value);
	mystack.printlist();

	}

}
