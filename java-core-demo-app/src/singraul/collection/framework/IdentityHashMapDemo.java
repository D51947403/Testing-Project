package singraul.collection.framework;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
	  Integer a = new Integer(10);
	  Integer b= new Integer (10);
	  Integer c= new Integer (20);
	  Integer d= new Integer (20);
	  
	  HashMap<Integer, String>  hm= new HashMap<>();
	  hm.put(a, "first");
	  hm.put(b, "second");
	  hm.put(c, "third");
	  hm.put(d, "fourth");
	  // HashMap uses equals methods to compare key
	  // so it compares values 
	  System.out.println("HashMap "+hm);
	  
	  IdentityHashMap<Integer, String>  ihm= new IdentityHashMap<>();
	  ihm.put(a, "first");
	  ihm.put(b, "second");
	  ihm.put(c, "third");
	  ihm.put(d, "fourth");
	  // Identity HashMap uses equality operator == to compare key
	  // it compares value and address reference both  
	  System.out.println("Identity HashMap "+ihm);
	  

	}

}
