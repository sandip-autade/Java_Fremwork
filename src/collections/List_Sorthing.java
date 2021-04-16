package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Sorthing {

	public static void main(String args[]) {
		
		List<String> list1 = new ArrayList<String>();  
		
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		
		Collections.sort(list1);		// Sorting the list
		
		for (String fruit : list1)		// Traversing list through the for-each loop
			System.out.println(fruit);

		System.out.println("Sorting numbers...");
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(21);
		list2.add(11);
		list2.add(51);
		list2.add(1);
		
		Collections.sort(list2);		// Sorting the list
		
		for (Integer number : list2)		// Traversing list through the for-each loop
			System.out.println(number);
	}

}
