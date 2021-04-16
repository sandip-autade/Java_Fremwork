package this_keyword;

public class Real_use {

	int rollno;
	String name, course;
	float fee;

	Real_use(int rollno,String name,String course){  
	this.rollno=rollno;  
	this.name=name;  
	this.course=course;  
	}

	Real_use(int rollno,String name,String course,float fee){  
	this(rollno,name,course);										//reusing constructor  
	this.fee=fee;  
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}

	public static void main(String args[]) {
		
		Real_use s1 = new Real_use(111, "ankit", "java");
		Real_use s2 = new Real_use(112, "sumit", "java", 6000f);
		
		s1.display();
		s2.display();
	}

}
