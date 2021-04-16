package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class List_Traversing {
	
	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("apple");
		name.add("mango");
		name.add("banana");
		name.add("greps");
		
		Iterator<String> itr = name.iterator();    //   Traversing list through Iterator 
		
		System.out.println("Traversing list through List Iterator:");  
		
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
		
		System.out.println("Traversing list through for loop:");  
		
				for(String fruit:name)    			//	Traversing list through for-each loop  
				    System.out.println(fruit); 
		
        System.out.println("Traversing list through forEach() method:");  //  The forEach() method is a new feature, introduced in Java 8. 
         
	            name.forEach(a->{ 									//Here, we are using lambda expression  
	                System.out.println(a);  
	              });
			
         System.out.println("Traversing list through forEachRemaining() method:");  
            
	            itr.forEachRemaining(a-> 		//Here, we are using lambda expression  
	            {  
	          System.out.println(a);  
	            });     
	}

}
