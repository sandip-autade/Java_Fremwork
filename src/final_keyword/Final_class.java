package final_keyword;

final class Car {
}

class Final_class //extends Car {                                   //    we cannot extend final class.
{
	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]){  
	  Final_class honda= new Final_class();  
  honda.run();  
  }
}
