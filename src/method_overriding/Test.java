package method_overriding;

class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

// Creating child classes.

class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {                                   //   All have same mehods  . .   getRateOfInterest();
	int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}

// Test class to create objects and call the methods

class Test {
	public static void main(String args[]) {
		
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
		
		
		System.out.println("\nRunTime Polymorphism\n");
		
		Bank b = new Bank ();
		
		b = new SBI();
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest()); 
		b = new ICICI();
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
		b = new AXIS();
		System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
		
	}
}
