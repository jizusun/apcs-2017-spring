package inheritance;

public class SuperClass {
	private int num;
//	public SuperClass(){
//		num=0;
//		System.out.println("superclass --�޲���");
//	}
	public SuperClass(int num){
		this.num=num;
		System.out.println("superclass --�в���");
	}
	public int get(){
		return num;
	}
}
