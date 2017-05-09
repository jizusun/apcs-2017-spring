package dancer;

public class Dancer {
public void act(){
	System.out.println("dancer--act");
	doTrick();
}
public void doTrick(){
	System.out.println("dancer--dotrick");
}
}
 class Acrobat extends Dancer{
	public void act(){
	
		System.out.println("acroba--act");
		super.act();
	}
	public void doTrick(){
		System.out.println("acrobat--dotrick");
	}
}