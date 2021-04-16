package final_keyword;

class Bike {
	final void run() {
		System.out.println("running");
	}
}

class Honda extends Bike {
	
//	void run() {                                             //   we cannot override final method
//		System.out.println("running safely with 100kmph");
//	}

}

public class Final_method {

	public static void main(String args[]) {
		Honda honda = new Honda();
		honda.run();
	}
}
