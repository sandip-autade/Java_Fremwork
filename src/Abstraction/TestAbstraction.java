package Abstraction;

abstract class Shape {
	abstract void draw();
}


class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle1 extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}


class TestAbstraction {
	public static void main(String args[]) {
		
		Shape s = new Circle1();						
		s.draw();
		
		Shape s1 = new Rectangle();						
		s1.draw();
	}
}
