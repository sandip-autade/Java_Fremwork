package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainComparator {

	public static void main(String args[]) {

		ArrayList<Student> al=new ArrayList<Student>(); 
		
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("		Sorting by Name");

		Collections.sort(al, new NameComparator());
		
		//Iterator itr = al.iterator();
		
		for(Student st: al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);            // Generic Method / new
			} 

		System.out.println("		Sorting by age");

		Collections.sort(al,new AgeComparator());
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student st = (Student) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);	 // Non Generic Method / old
		}

	}

}
