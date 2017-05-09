package array;

public class DeckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck d = new Deck();
		d.shuffle();
		d.writeDeck();
		int a[]={1,1,1,1,2};
		for(int b:a){
			System.out.println(b);
		}
	}

}
