package BankAccount;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount("123", 40.0);
		
		//object.method
		double moreBalance = 0.0;
		
		if (b1.getBalance() > b2.getBalance()) {
			moreBalance = b1.getBalance();
		} else {
			moreBalance = b2.getBalance();
		}
		
		System.out.println(moreBalance);
		
		//static
		double overdrawn = BankAccount.getOverdrawnPenalty();
		System.out.println(overdrawn);
		
		//this
		b1.printThis();
		//System.out.println(b1);
		
		

	}

}
