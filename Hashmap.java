import java.util.*;

public class hashMap {

	public static void main(String[] args) {
	
	//HashMap... put,containKey,delete,Size(); unorder 
          HashMap<String,Integer> map = new HashMap<>();
       
		//PUT FUNCTION
          map.put("India",100);
          map.put("New Zealand", 20);
          map.put("America", 120);
          map.get("India");
          
          
          
          for(Map.Entry<String,Integer>e:map.entrySet()) {
        	  System.out.println(e.getKey());
        	  System.out.println(e.getValue());
          }
		
		   
               
              System.out.println( map.get("India"));
              System.out.println(map);
               
               
        
       
          
         
	}
}
