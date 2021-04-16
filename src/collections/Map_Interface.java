package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_Interface {

	public static void main(String args[]) {

//		Map<Integer, String> map = new HashMap<Integer, String>();        // 	New Method / Generic             // automatic sorting
		
//		Map<Integer,String> map=new LinkedHashMap<Integer,String>();     // declearing LinkedHashMap             // no sorting
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();  	 // declearing LinkedHashMap             // automatic sorting
		
//		Hashtable<Integer,String> map=new Hashtable<Integer,String>();   // declearing LinkedHashMap             // no sorting

		map.put(100, "zz");
		map.put(101, "cc");
		map.put(103, "ff");
		map.put(104, "zz");         // dont allow duplicate kay but allow duplicate elements
		map.put(102, "xx"); 
//		map.put(101, "ll");

		// Elements can traverse in any order

		for (Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

//		Map map = new HashMap();                                           // 	Old Method / non Generic
//		
//		// Adding elements to map
//		
//		map.put(1, "Amit");
//		map.put(5, "Rahul");
//		map.put(2, "Jai");
//		map.put(6, "Amit");
//		
//		// Traversing Map
//		
//		Set<?> set = map.entrySet();			// Converting to Set so that we can traverse
//		Iterator<?> itr = set.iterator();
//		while (itr.hasNext()) {
//			
//			// Converting to Map.Entry so that we can get key and value
//			// separately
//			
//			Map.Entry entry = (Map.Entry) itr.next();
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
	}

}
