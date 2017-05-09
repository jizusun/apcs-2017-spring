package scope;

public class Scope {
	private int a;
	private int b;

	public Scope(int a, int b) {
		this.a = a;
		this.b = b;
	}

	//product �Ǻ�������
	public int product() {
		System.out.println(" product is:"+a*b);
		return a * b;

	}

	public int product(int ac, int bd) {
		return ac * bd;

	}
	
	// local variable's scope
//	 public double divide(){
//	 return ac/bd;
//	 }

	// local variable ���ȼ��Ƚϸ�
	public double divide(int a, int b) {
		System.out.println(a / b);
		return a / b;
	}
	
	public void print(Scope s){
		System.out.println(s);
	}


}
