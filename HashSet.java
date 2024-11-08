
import java.util.HashSet;
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
		
		
		//Delete
		set.remove(1);
		
		//Size
		
		System.out.println(set.size());
		
		//Iterator
		Iterator it = set.iterator();		

	}

}
