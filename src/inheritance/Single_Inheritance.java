package inheritance;

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class Single_Inheritance {
	public static void main(String args[]) {
		
		Dog d = new Dog();
		d.bark();
		d.eat();
		
//		Animal a = new Animal();
//		a.bark();                       // found error . . cant call bark method from obj of Animal
//		a.eat();
	}
}
