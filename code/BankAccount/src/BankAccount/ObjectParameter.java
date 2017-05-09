package BankAccount;

public class ObjectParameter {
	
	public static void chargeFee(BankAccount b, String password, double fee) {
		final double MIN_BALANCE = 10.0;
		if (b.getBalance() < MIN_BALANCE) {
			b.withdraw(password, fee);
		}
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		final double FEE = 5.0;
		BankAccount anydsAccount = new BankAccount("Andys", 7.0);
		chargeFee(anydsAccount, "Andys", FEE);
		System.out.println(anydsAccount.getBalance());
	}

}
