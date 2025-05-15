import java.util.*;
public class HashTable {
	private int size=7;
	private Node[]datamap;
	
	class Node{
		String key;
		int value;
		Node next;
		
		Node(String key,int value){
			this.key=key;
			this.value=value;
		}
	}
	public HashTable() {
		datamap=new Node[size];
	}
	
//	Hash
	public  int Hash(String key) {
		int hash=0;
		char[]keychar=key.toCharArray();
		for(int i=0;i<keychar.length;i++) {
			int ascii=keychar[i];
			hash=(hash+ascii*23)%datamap.length;
		}
		return hash;
	}
	
//	set method
	public void set(String key,int value) {
		int index=Hash(key);
		Node newNode=new Node(key,value);
		if(datamap[index]==null) {
			datamap[index]=newNode;
		}else {
			Node temp=datamap[index];
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
//	get method
	public int get(String key) {
		int index=Hash(key);
		Node temp=datamap[index];
		while(temp!=null) {
			if(temp.key==key) return temp.value;
			temp=temp.next;

		}
		return 0;
	}

	public void printTable(){
		for(int i=0;i<datamap.length;i++) {
			System.out.println(i+": ");
			Node temp = datamap[i];
			while(temp!=null) {
				System.out.println("{"+temp.key+"="+temp.value+"}");
				temp=temp.next;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashTable hs= new HashTable();
      hs.set("Apple",22);
      hs.set("Mango", 23);
      hs.set("Orange", 18);
      
      System.out.println(hs.get("Mango"));
      
      hs.printTable();
	}

}
