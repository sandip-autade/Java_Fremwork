package super_keyword;

class Car {
	Car() {
		System.out.println("Car is Running");
	}
}

class Van extends Car {
	Van() {
		super();
		System.out.println("Van is Running");
	}
}

class Invoke_parent_class_constructor {
	public static void main(String args[]) {
		Van d = new Van();
	}
}
