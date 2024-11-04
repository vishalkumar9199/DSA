//This is the collection framework of JAVA

import java.util.ArrayList;
import java.util.Collections;
public class arraylist {

	//MAIN class
	
	public static void main(String[] args) {
		// creating Arraylist object which is Type Integer
       ArrayList<Integer>list= new ArrayList<Integer>();
       
       
       //Add element
       list.add(1);
       list.add(2);
       list.add(3);
       System.out.println(list);//Expected output is [1,2,3]
       
       
       // Get element
       int element=list.get(1);   //Its return the Index value
       System.out.print(element); //Expected output is:2
       
       
       
       //Add element between the list
       
       list.add(1, 100);   //(Index,value)
       System.out.println(list);   //Expected output is:[1, 100, 2, 3]
       
       
       
      //set element
       
       list.set(0, 99);   
       System.out.println(list);//Expected output is:[99, 100, 2, 3]
       
       
       //Delete element
       list.remove(1);         //index delete
       System.out.println(list);    //Expected output is:[99, 2, 3]
       
       
       //size
       int size=list.size();
       System.out.println("The size of the list:"+size);
       
       
	
	//Loop in ArrayList
       for(int i=0;i<list.size();i++) {
    	   System.out.print(list.get(i)+" ");
    	  }
       System.out.println();
       
       
       //sorting 
       
       Collections.sort(list);
       System.out.println(list);
	}

}
