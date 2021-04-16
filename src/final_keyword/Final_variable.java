package final_keyword;

public class Final_variable {

	final int speedlimit = 90;// final variable

	void run() {
		//speedlimit = 400;                             // we can not change the value of final veriable
	}

	public static void main(String args[]) {
		Final_variable obj = new Final_variable();
		obj.run();
	}

}
