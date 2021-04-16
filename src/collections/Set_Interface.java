package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Interface {

	public static void main(String args[]) {

		HashSet<String> set = new HashSet<String>(); // Creating HashSet

		LinkedHashSet<String> set1 = new LinkedHashSet<String>(); // Creating  LinkedHashSet
																	
		TreeSet<String> set2 = new TreeSet<String>(); // Creating TreeSet

		set.add("zz");
		set.add("cc");
		set.add("ff");
		set.add("gg");
		set.add("aa");
		set.add("zz"); 		// Cant allow duplicate element

		set1.add("zz");
		set1.add("cc");
		set1.add("ff");
		set1.add("gg");
		set1.add("aa");		// Cant allow duplicate element

		set2.add("zz");
		set2.add("cc");
		set2.add("ff");
		set2.add("zz");		// Cant allow duplicate element  and sorted

		Iterator<String> itr = set1.iterator();

		Iterator<String> i = set.iterator();
		
		Iterator<String> itr1=set2.iterator(); 

		System.out.println("*********  HashSet"); // not mentain the order

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("*********  LinkedHashSet"); // mentain the order

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//  Iterator i=set.descendingIterator();   // mentain decending order.
		
		//  System.out.println("Reverse Set: "+set2.descendingSet()); // also mentain decending order.
		
		System.out.println("*********  TreeSet"); // mentain ascending order.

		while (itr1.hasNext()) {
			
			System.out.println(itr1.next()); 
		
		}
	}

}
