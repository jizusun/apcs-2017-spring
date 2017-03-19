package dancer;

public class Dance {
public void act(){
	System.out.println("dance--act");
	doTrick();
}
public void doTrick(){
	System.out.println("dance--dotrick");
}
}
 class Acrobat extends Dance{
	public void act(){
	
		System.out.println("acroba--act");
		super.act();
	}
	public void doTrick(){
		System.out.println("acrobat--dotrick");
	}
}