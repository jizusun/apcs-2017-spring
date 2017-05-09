package telephone;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone tel=new Telphone();
		Telphone tel2 =new SmartPhone("vivo",2,4);
		IPlayGame play = new SmartPhone();
		tel.call();
	}

}
