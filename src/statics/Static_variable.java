package statics;

public class Static_variable {

	int rollno;			// instance variable
	String name;
	static String college = "ITS";		// static variable
	
	// constructor

	Static_variable(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display the values
	
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
	
	 public static void main(String args[])
	 {  
		 Static_variable s1 = new Static_variable(111,"Karan");  
		 Static_variable s2 = new Static_variable(222,"Aryan");  
		 
	 //			we can change the college of all objects by the single line of code  
	 //			Static_variable.college="VIT";  
		 
	 s1.display();  
	 s2.display(); 
	 
	 }

}
