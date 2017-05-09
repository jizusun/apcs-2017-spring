package BankAccount;

public class test2Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=a;
		b=3;
		System.out.println("a:"+a+"  b:"+b);
		
		
		//new b1,b3,b4. b1和b3指向相同
		BankAccount b1 = new BankAccount("234",80.0);
		BankAccount b3=b1;
		BankAccount b4=new BankAccount("234",80.0);
		System.out.println("b1:"+b1);
		System.out.println("b3:"+b3);
		System.out.println("b4:"+b4);
		
		//向b3中存入20，查看b1,b4中的balance
		b3.deposit("234", 20.0);
		System.out.println(b1.getBalance());
		System.out.println(b4.getBalance());
		
		
	}

}
