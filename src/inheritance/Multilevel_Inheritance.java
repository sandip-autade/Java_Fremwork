package inheritance;

//class Animal {
//	void eat() {
//		System.out.println("eating...");
//	}
//}                                                    // that class is all ready defined in this packege
//
//class Dog extends Animal {
//	void bark() {
//		System.out.println("barking...");
//	}
//}

class BabyDog extends Dog {
	void weep() {
		System.out.println("weeping...");
	}
}

class Multilevel_Inheritance {
	public static void main(String args[]) {
		
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();
		
//		Dog d1 = new Dog();
//		d1.bark();
//		d1.eat();
//		
//		Animal a = new Animal();
//		a.eat();

	}
}
