package BankAccount;

public class BankAccount {
	public String password;
	public double balance;
	private static final double OVERDRAWN_PENALTY = 20.0;

	// Constructors
	/*
	 * default constructor constructs bank account with default values
	 */

	public BankAccount() {
		password = "";
		balance = 0.0;
	}

	// constructors
	/* construct a bank account with specified password and balance */
	public BankAccount(String password, double balance) {
		this.password = password;
		this.balance = balance;
	}

	// Accessor
	public double getBalance() {
		this.deposit("dsds",20.2);
		return balance;
	}

	@Override
	public String toString() {
		return "BankAccount [password=" + password + ", balance=" + balance + "]";
	}

	// mutator
	/* deposit amount in a bank account with the given password */
	public void deposit(String password, double amount) {
		if (!password.equals(this.password)) {
			
		} else {
			balance += amount;
		}
	}

	/* withdraw amount from bank account with given password */
	public void withdraw(String password, double amount) {
		if (!password.equals(this.password)) {

		} else {
			balance -= amount;
		}
	}
	
	public static double getOverdrawnPenalty(){
		return OVERDRAWN_PENALTY;
	}

	//print this
	public void printThis(){
		System.out.println(this);
	}

}
