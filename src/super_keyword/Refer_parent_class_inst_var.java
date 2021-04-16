package super_keyword;

class Animal {
	String color = "white";
}

class Dog extends Animal {
	String color = "black";

	void printColor() {
		System.out.println(color);			
		System.out.println(super.color);	 //  Parent class Instance Veriable
	}
}

class Refer_parent_class_inst_var {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.printColor();
	}
}