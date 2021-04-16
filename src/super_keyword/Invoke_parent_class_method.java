package super_keyword;

class Animals {
	void eat() {
		System.out.println("eating...");
	}
}

class Dogs extends Animals {
	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();                                //   Parent class method
		bark();
	}
}

class Invoke_parent_class_method {
	public static void main(String args[]) {
		Dogs d = new Dogs();
		d.work();
	}
}