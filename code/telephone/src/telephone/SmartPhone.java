package telephone;

public class SmartPhone extends Telphone implements IPlayGame {
	private int kindGames;
	public SmartPhone(){
		super();
		kindGames=0;
	
	}
	public SmartPhone(String name,int weight,int kindGames){
		super(name,weight);
		this.kindGames=kindGames;
	}
	@Override
	public void play(Object a) {
		// TODO Auto-generated method stub
		System.out.println("smartphone can play");
	}
	@Override
	public boolean isPlay() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
	
}
