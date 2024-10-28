
public class Queue {
	private Node first;
	private Node last;
	private int length;
	 
	//creating Node and its constructor..
	class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value=value;
		}
	}
	// contructor of Queue class..
		public  Queue(int value) {
			Node newNode= new Node(value);
			first=newNode;
			last=newNode;
			length=1;
		}
		
	 //Enqueue method =>add the node to queue from last of the Node because its time complexity is O(1)
		public void enqueue(int value) {
			Node newNode = new Node(value);
			if(length==0) {
				first=newNode;
				last=newNode;
			}else {
				last.next=newNode;
				last=newNode;
			}
			length++;
		}

//		Dequeue  => delete the item from first of the queue because its time complexity is O(1)
		public Node dequeue() {
			if(length ==0) return null;
			Node temp=first;
			if(length==1) {
				first=null;
				last=null;
			}else {
				first=first.next;
				temp.next=null;
			}
			length--;
			return temp;
		}
	//printlist
	public void printlist() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
	}

//	Main class
	public static void main(String[] args) {
   
              Queue myqueue= new Queue(1);
              myqueue.enqueue(2);
              myqueue.enqueue(3);
              myqueue.enqueue(4);
              myqueue.dequeue();
              myqueue.printlist();
              
	}

}
