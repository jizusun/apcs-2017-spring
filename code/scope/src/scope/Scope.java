package scope;

public class Scope {
	private int a;
	private int b;

	public Scope(int a, int b) {
		this.a = a;
		this.b = b;
	}

	//product 是函数重载
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

	// local variable 优先级比较高
	public double divide(int a, int b) {
		System.out.println(a / b);
		return a / b;
	}
	
	public void print(Scope s){
		System.out.println(s);
	}


}
