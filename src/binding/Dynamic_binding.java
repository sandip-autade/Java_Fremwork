package binding;

class Humans {
	// Overridden Method
	public void walk() {
		System.out.println("Human walks");
	}
}

class Dynamic_binding extends Humans {
	// Overriding Method
	public void walk() {
		System.out.println("Boy walks");
	}

	public static void main(String args[]) {
		/*
		 * Reference is of Human type and object is Boy type
		 */
		Humans obj = new Dynamic_binding();
		/*
		 * Reference is of HUman type and object is of Human type.
		 */
		Human obj2 = new Human();
		
		obj.walk();
		obj2.walk();
	}

}
