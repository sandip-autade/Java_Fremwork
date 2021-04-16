package constructor;

public class Default_Constructor {
	
	int id;
	String name;

	// method to display the value of id and name
	
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) 
	{
		// creating objects
		
		Default_Constructor s1 = new Default_Constructor();
		Default_Constructor s2 = new Default_Constructor();
		
		// displaying values of the object
		
		s1.display();
		s2.display();

	}

}
