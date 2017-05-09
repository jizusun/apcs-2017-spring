package array;

public class Deck {
	private int[] deck;
	private static final int NUMBERCARDS = 52;

	// constructor deck is an array whose size is 52,
	// each element in deck is equal to the subscript.
	public Deck(){
		deck=new int[NUMBERCARDS];
		for(int i=0;i<NUMBERCARDS;i++){
			deck[i]=i;
		}
		
	}
	
	//write the content of Deck
	public void writeDeck(){
		for(int card :deck){
			System.out.print(card+" ");
		}
		System.out.println();
	}
	
	//swap arr[i] and arr[j] in array
	private void swap(int[] arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	/**shuffle Deck:generate a random permutation by 
	 * picking a random card from those remaining and 
	 * putting it in the next slot,starting from the right
	**/
	public void shuffle(){
		int index;
		for (int i=NUMBERCARDS-1;i>0;i--){
			//generate an int from 0 to i
			index=(int)(Math.random()*(i+1));
			swap(deck,i,index);
		}
		
	}
	
}
