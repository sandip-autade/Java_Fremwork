package method_overloading;

class Adders {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}
}

public class changing_data_type {
	public static void main(String[] args) {
		
		System.out.println(Adders.add(11, 11));
		System.out.println(Adders.add(12.3, 12.6));             //       changing DataType

	}
}
