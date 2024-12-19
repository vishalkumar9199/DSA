import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.HashSet;
public class hash {

	public static void main(String[] args) {
	
		//HashMap... put,containKey,delete,Size();
          HashMap<String,Integer> lhm = new HashMap<>();
          
          //LinkedHashMap
          
         // LinkedHashMap<String,Integer> lhm= new LinkedHashMap<>();
          
          //TreeMap.. already sorted
           //TreeMap<String,Integer>tmp= new TreeMap<>();
		
		   
               //PUT FUNCTION
              lhm.put("India",100);
              lhm.put("New Zealand", 20);
               lhm.put("America", 120);
               lhm.get("India");
               System.out.println( lhm.get("India"));
               System.out.println(lhm);
        
       
           
		
		
		// HashSet => contain unique element...add,containkey,set.size(),remove;
				
//		HashSet<String> hs= new HashSet<>();
//		LinkedHashSet<String> lhs= new LinkedHashSet<>();
//		TreeSet<String>ts= new TreeSet<>();
//		lhs.add("vishal");
//		lhs.add("Peter");
//		lhs.add("Rosers");
//		lhs.add("Tony");
//		
////		Iterator it= hs.iterator();
////		while(it.hasNext()) {
////			System.out.println(it.next());
////		}
//		
//		for(String name:lhs) {
//			System.out.println(name);
//		}
		
       
         
         
         
	}
}
