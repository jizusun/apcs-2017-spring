package inheritance;

public class SuperClass {
	private int num;
//	public SuperClass(){
//		num=0;
//		System.out.println("superclass --无参数");
//	}
	public SuperClass(int num){
		this.num=num;
		System.out.println("superclass --有参数");
	}
	public int get(){
		return num;
	}
}
