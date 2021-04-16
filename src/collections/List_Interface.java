package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class List_Interface {

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>();		 // Creating Arraylist
		
		LinkedList<String> al = new LinkedList<String>(); 		// Creating Linklist
		
		Vector<String> v = new Vector<String>(); 				// Creating Vector
		
		Stack<String> stack = new Stack<String>();				// Creating Stack

		list.add("**********ArrayList");
		list.add("zz");
		list.add("cc");
		list.add("ff");
		list.add("zz");		// allow duplicate and unsorted
//		list.add("xx");
		
		al.add("**********LinkList");
		al.add("zz");
		al.add("cc");
		al.add("ff");
		al.add("zz");		// allow duplicate
		
		v.add("**********Vector");
		v.add("zz");
		v.add("cc");
		v.add("ff");
		v.add("zz");		// allow duplicate
		
		stack.push("**********Stack");
		stack.push("zz");
		stack.push("cc");
		stack.push("ff");
		stack.push("gg");
		stack.push("zz");    // dont allow duplicate
		
		stack.pop();    // Remember pop for stack

//		Collections.sort(list,Collections.reverseOrder());   // sort in decending alphabatically
		
//		Collections.sort(list); 						    // sort in asending alphabatically		

		Iterator itr = list.iterator(); 		// Traversing list through Iterator
		
		Iterator itr1 = al.iterator();
		
		Iterator<String> it2r = v.iterator();
		
		Iterator<String> it3r = stack.iterator();
		

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		while (it2r.hasNext()) {
			System.out.println(it2r.next());
		}
		
		while (it3r.hasNext()) {
			System.out.println(it3r.next());
		}
	}
}
