package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Interface {

	public static void main(String args[]) {

		Queue<String> queue = new PriorityQueue<String>(); 		// Creating  PriorityQueue class using queue interface

		Deque<String> deque = new ArrayDeque<String>(); 		// Creating ArrayDeque class using dqueue interface

		queue.add("zz");
		queue.add("cc");
		queue.add("ff");
		queue.add("xx");
//		queue.add("zz");		// 		allow duplicte unsorted

		deque.offer("zz");
		deque.offer("cc");
		deque.add("ff");
//		queue.add("zz");   		// 		allow duplicte unsorted
		deque.offerFirst("xx");

		System.out.println(" head:" + queue.element());

		System.out.println(" head:" + queue.peek());

		System.out.println("	Iterating the queue elements:");

		Iterator itr = queue.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		queue.remove(); // remove from queue

		queue.poll(); // remove from queue

		System.out.println("	After removing two elements:");

		Iterator<String> itr2 = queue.iterator();

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		
		//  for Deque
		
		System.out.println("	After offerFirst Traversal...");
		
		for (String s : deque) {
			System.out.println(s);
		}
		
	    //deque.poll();                    //  remove front element
		
	    //deque.pollFirst();			  //  it is same as poll()
		
		deque.pollLast();                 //  remove last element
		
	    System.out.println("	After pollLast() Traversal...");  
	    
	    for(String s:deque){  
	        System.out.println(s);  
	    }
	}

}
