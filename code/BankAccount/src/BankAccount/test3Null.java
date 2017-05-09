package BankAccount;

public class test3Null {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount b2=null ;
		System.out.println(b2);
		//b2.deposit("dsd", 3.3);

		//Initialize
		BankAccount b3=new BankAccount();
		System.out.println("余额是"+b3.balance);
		System.out.println("password 默认值是"+b3.password);


	}

}
