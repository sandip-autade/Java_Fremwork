package statics;

public class Static_method {

	int rollno;
	String name;
	static String college = "ITS";

	// static method to change the value of static variable

	static void change() {
		college = "BBDIT";
	}

	// constructor to initialize the variable

	Static_method(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display values
	
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	
	// Test class to create and display the values of object
	
	public static void main(String args[]) {
		Static_method.change();			// calling change method
		
		// creating objects
		
		Static_method s1 = new Static_method(111, "Karan");
		Static_method s2 = new Static_method(222, "Aryan");
		Static_method s3 = new Static_method(333, "Sonoo");
		
		// calling display method
		
		s1.display();
		s2.display();
		s3.display();
	}

}
