public class DoubleLinkedList {
	private Node head;
	private Node tail;
	int length;
	
	 class Node{
		 int value;
		 Node next;
		 Node prev;
		 
		 Node(int value){
			 this.value=value;
		 }
	 }
	 public DoubleLinkedList(int value) {
		 Node newNode= new Node(value);
		 head=newNode;
		 tail=newNode;
		 length=1;
	 }
	
	 
	 // Append method

	 public void append(int value) {
		 Node newNode=new Node(value);
		 if(length==0) {
			 head=newNode;
			 tail=newNode;
		 }else {
			 tail.next=newNode;
			 newNode.prev=tail;
			 tail=newNode;
		 }
		 length++;
	 }
	 
	 
	      // prepend Method

	 public void prepend(int value) {
		 Node newNode= new Node(value);
		 if(length==0) {
			 head=newNode;
			 tail=newNode;
		 }else {
			 newNode.next=head;
			 head.prev=newNode;
			 head=newNode;
		 }
		 length++;
	 }
	 
	 
	 //  RemoveLast method
	 
	 public Node removelast() {
		 if(length==0) return null;
		 Node temp=tail;
		 if(length==1) {
			 head=null;
			 tail=null;
		 }else {
			 tail=tail.prev;
			 tail.next=null;
			 temp.prev=null;
		 }
		 length--;
		 return temp;
	 }
	 
	 
	 
	 //  removefirst

	 public Node removefirsrt() {
		 if(length==0) return null;
		 Node temp=tail;
		 if(length==1) {
			 head=null;
			 tail=null;
		 }else {
			 head=head.next;
			 head.prev=null;
			 temp.next=null;
		 }
		 length--;
		 return temp;
	 }
	 
	 
	 
	 //  Get method

	 public Node get(int index) {
		 if(index < 0 || index>=length) return null;
		 Node temp=head;
		 if(index< length/2) {
			 for(int i=0;i<index;i++) {
				 temp=temp.next;
			 }
		 }else {
			 temp=tail;
			 for(int i=length-1;i>index;i--) {
				 temp=temp.prev;
			 }
		 }
		 return temp;
	 }
	 
	 
	 // set method

	 public boolean set(int index,int value) {
		 Node temp=get(index);
		 if(temp!=null) {
			 temp.value=value;
			 return true;
		 }
		 return false;
	 }
	 
	 
	 
	 // insert method
	 
	 public boolean insert(int index,int value) {
		 if(index < 0 || index > length)return false;
		 if(index==0) {
			 prepend(value);
			 return true;
		 }
		 if(index==length) {
			 append(value);
			 return true;
		 }
		 Node newNode = new Node(value);
		 Node before = get(index-1);
		 Node after=before.next;
		 newNode.prev=before;
		 newNode.next=after;
		 before.next=newNode;
		 after.prev=newNode;
		 length++;
		 return true;
	 }
	 
	 
	 // Remove method--remove node at any index

	 public Node remove(int index) {
		 if(index<0 || index>=length) return null;
		 if(index==0) return removefirsrt();
		 if(index==length-1) return removelast();
		 
		 Node temp = get(index);
		 
		 temp.next.prev=temp.prev;
		 temp.prev.next=temp.next;
		 temp.next=null;
		 temp.prev=null;
		 length--;
		 return temp;
	 }
	 
	//print method

	 public void printlist() {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.value);
				temp=temp.next;
			}
		}

                        //Main method

	public static void main(String[] args) {
		DoubleLinkedList DLL= new DoubleLinkedList(0);
		DLL.append(1);
		DLL.prepend(5);
		DLL.prepend(3);
		//DLL.removelast();
		//DLL.removefirsrt();
//		System.out.println("The value of:"+DLL.get(2).value);
//		DLL.set(1, 11);
		DLL.insert(2, 100);
		DLL.remove(2);
		DLL.printlist();
		
	}       

}
