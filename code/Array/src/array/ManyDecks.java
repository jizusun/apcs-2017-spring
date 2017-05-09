package array;

public class ManyDecks {
	private Deck[] allDecks;
	private static final int NUMBER = 100;

	/** constructor **/
	public ManyDecks() {
		allDecks = new Deck[NUMBER];
		for (int i = 0; i < NUMBER; i++) {
			allDecks[i] = new Deck();
		}
	}

	/** shuffle **/
	public void shuffle() {
		for (Deck d : allDecks) {
			d.shuffle();
		}
	}

	/** write contents of all the Deck **/
	public void printDecks() {
		for (Deck d : allDecks) {
			d.writeDeck();
		}
	}
}
