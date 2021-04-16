package Encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		
		// creating instance of Account class
		
		Account acc = new Account();
		
		// setting values through setter methods
		
		acc.setAcc_no(7560504000L);
		acc.setName("Sonoo Jaiswal");
		acc.setEmail("sonoojaiswal@javatpoint.com");
		acc.setAmount(500000f);
		
		// getting values through getter methods
		
		System.out.println("Account Number : "+acc.getAcc_no() + "\nName :  " + acc.getName() + "\nMail : " + acc.getEmail() + "\nAmount : " + acc.getAmount());
	}

}
