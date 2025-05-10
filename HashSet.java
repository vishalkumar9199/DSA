import java.util.*;
import java.util.Iterator;
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		
		//Insert method
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		System.out.println(set);
		
//		contain method
		if(set.contains(1)) {
			System.out.println("contains");
		}else {
			System.out.println("Not contains");
		}
//				
		//Delete
		set.remove(1);
				
		//Iterator
		Iterator it= set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}



}
