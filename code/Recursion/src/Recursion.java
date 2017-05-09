import java.util.Scanner;

public class Recursion {

	public static void stackWords(){
		Scanner s=new Scanner(System.in);
		String word= s.next();
		if(word.equals(".")){
			System.out.println();			
		}
		else{
			
			stackWords();
		}
		System.out.println(word);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter list of words,one line per");
		System.out.println("final word should be a period");
		stackWords();
	}

}
