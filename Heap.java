import java.util.*;
public class Heap {
	private List<Integer> heap;    // Create  a heap using Arraylist
	
	public Heap() {
		this.heap= new ArrayList<>();
	}
//	get  the heap
	public List<Integer>getheap(){
		return new ArrayList<>(heap);
	}
	
//	left child of a heap
	private int leftchild(int index) {
		return 2*index+1;
	}
//	right child of a heap
	private int rightchild(int index) {
		return 2*index+2;
	}
	private int parent(int index) {
		return (index-1)/2;
	}
//    Swap method
	private void swap(int index1,int index2) {
		int temp = heap.get(index1);
		heap.set(index1,heap.get(index2));
		heap.set(index2,temp);
	}
	
//	Insert method
	 public void insert(int value) {
		 heap.add(value);
		 int current= heap.size()-1;
		 
		 while(current>0 && heap.get(current)>heap.get(parent(current))) {
			 swap(current,parent(current));
			 current=parent(current);
		 }
	 }
	 
	 //delete method it only remove the top node no matter its max heap or min
	 public Integer remove() {
		 if(heap.size()==0) {
			 return null;
		 }
		 if(heap.size()==1) {
			 return heap.remove(0);
		 }
		 int maxvalue= heap.get(0);
		 heap.set(0,heap.remove(heap.size()-1));
		 sinkdown(0);
		 return maxvalue;
	 }
	 
	 //SINK METHOD
	 private void sinkdown(int index) {
		 int maxindex=index;
		 while(true) {
			 int leftindex=leftchild(index);
			 int rightindex=rightchild(index);
			 
			 if(leftindex<heap.size() && heap.get(leftindex)>heap.get(maxindex)) {
				 maxindex=leftindex;
			 }
			 if(rightindex<heap.size() && heap.get(rightindex)>heap.get(maxindex)) {
				 maxindex=rightindex;
			 }
			 if(maxindex!=index) {
				 swap(index,maxindex);
				 index=maxindex;
				 
			 }else {
				 return;
			 }
		 }
	 }
	 
	public static void main(String[] args) {
		Heap myheap = new Heap();
		
		myheap.insert(95);
		myheap.insert(75);
		myheap.insert(80);
		myheap.insert(55);
		myheap.insert(60);
		myheap.insert(50);
		myheap.insert(65);
		
		System.out.println(myheap.getheap());
		
		myheap.remove();
		System.out.println(myheap.getheap());
		myheap.insert(100);
		System.out.println(myheap.getheap());
		
		myheap.remove();
		System.out.println(myheap.getheap());

	}

}
