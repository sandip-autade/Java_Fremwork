package this_keyword;

public class Student {              // conside the example of parameterized constructor 
		
	    int id;  
	    String name;  
	    
	    //creating a parameterized constructor 
	    
//	    Student(int i,String n)  
//	    {  
//	    id = i;  
//	    name = n;  
//	    }  
	    
	    Student(int id,String name)  // instade of passing differnt parameter -- >  pass same parameter
	    {  
	    this.id = id;  
	    this.name = name;  
	    }
	    
	    //method to display the values  
	    
	    void display(){
	    	System.out.println(id+" "+name);
	    	}
	   
	    public static void main(String args[])
	    {  
	    	
	    //creating objects and passing values  
	    	
	    	Student s1 = new Student(111,"Karan");  
	    	Student s2 = new Student(22,"Aryan");  
	    	
	    //calling method to display the values of object  
	    	
	    s1.display();  
	    s2.display();  
	    
	   }

	}
