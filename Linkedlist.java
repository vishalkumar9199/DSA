public class LINKLIST {
	private Node head;
	private Node tail;
	int length;
	
	class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value=value;
		}
	}
	
	public LINKLIST(int value) {
		Node newNode= new Node(value);
		head=newNode;
		tail=newNode;
		length=1;
	}
	
	//Append method..Adding element to last;

	public void append(int value) {
		Node newNode = new Node(value);
		if(length==0) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
		length++;
	}
	
	
      //Prepend method..Adding element to first

	public void prepend(int value) {
		Node newNode= new Node(value);
		if(length==0) {
		head=newNode;
		tail=newNode;
		}else{
			newNode.next=head;
			head=newNode;
		}
		length++;
	}
	
//       Remove last

	public Node removelast() {
		if(length==0) return null;
		
		Node temp=head;
		Node pre=head;
		while(temp.next!=null) {
			pre=temp;
			temp=temp.next;
			
		}
		tail=pre;
		tail.next=null;
		length--;
		 if(length==0) {
			 head=null;
			 tail=null;
		 }
		 return temp;
	}
	
	//remove first

	public Node removefirst() {
		if(length==0)return null;
			Node temp=head;
		   head=head.next;
		   temp.next=null;
		   length--;
		   if(length==0) {
			   tail=null;
		   }
		   return temp;
	}
	
		
	// Reverse the linked list

	public void reverse() {
		Node temp=head;
		head=tail;
		tail=temp;
		Node after= temp.next;
		Node before=null;
		for(int i=0;i<length;i++) {
			after=temp.next;
			temp.next=before;
			before=temp;
			temp=after;
		}
	}

	// Get method
	 public Node Get(int index){
        if(index<0 || index>=length) return null;
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    // set method'
    public boolean set(int index,int value){
        Node temp=Get(index);
         if(temp!=null){
             temp.value=value;
             return true;
         }
         return false;
         
    }
    // insert
    public boolean insert(int index,int value){
        if(index<0 || index>length) return false;
        if(index==0){
            prepend(value);
            return true;
        }
        if(index==length){
            append(value);
            return true;
        }
        Node newNode=new Node(value);
        Node temp=Get(index-1);
        newNode.next=temp.next;
        temp.next=newNode;
        length++;
        return true;
        
    }
    // remove method
    public Node remove(int index){
        if(index<0 || index>length) return null;
        if(index==0) return deletefirst();
        if(index==length-1) return deletelast();
        
        Node prev=Get(index-1);
        Node temp=prev.next;
        
        prev.next=temp.next;
        temp.next=null;
        length--;
        return temp;
    }
    
    // reverse the linkedlist
    public void reverse(){
        Node temp=head;
        head=tail;
        tail=temp;
        
        Node after=temp.next;
        Node before=null;
        
        for(int i=0;i<length;i++){
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }
	//  PrintLIst method

	public void printlist() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	
	
	
	
	public static void main(String[] args) {
	LINKLIST mylinkedlist= new LINKLIST(1);
	mylinkedlist.append(2);
	mylinkedlist.append(3);
	mylinkedlist.append(4);
	mylinkedlist.prepend(0);
//	System.out.println("The element after removefirst");
//	mylinkedlist.removefirst();
//	//System.out.println(mylinkedlist.removelast().value);
//	mylinkedlist.reverse();
	mylinkedlist.printlist();
	
		
	}
}
