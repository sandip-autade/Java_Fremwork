package exceptional_handeling;

import java.io.IOException;

class TestThrows {
	void m() throws IOException {
		throw new IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			//System.out.println("exception handled");
			try {
				throw e;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {
		TestThrows obj = new TestThrows();
		obj.p();
		System.out.println("normal flow...");
	}
}
