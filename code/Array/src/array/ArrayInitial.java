package array;

import java.util.Scanner;

public class ArrayInitial {
	
	public static int findMin(int[] arr) {
		return 0;

	}
	/** add 3 to each element **/
	public static void changeArray(int [] b){
		for (int i = 0; i < b.length; i++) {
			b[i] +=3;
		}
	}
	
	/** add 3 to an element**/
	public static void changeArray2(int n){
		n+=3;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list={1,2,3,4};
		System.out.println(findMin(list));
		changeArray(list);
		System.out.print("the change list is ");
		for(int num: list){
			System.out.print(num+" ");
		}
		
		//use changeArray2
		int[] list2={1,2,3,4};
		System.out.println("the origin array is:");
		for(int num:list2){
			System.out.println(num+" ");
		}
		changeArray2(list2[0]);
		System.out.println("the modified array is ");
		for (int num:list2){
			System.out.println(num+" ");
		}
		
		//input
		Scanner s=new Scanner(System.in);
		for(int i=0;i<2;i++){
			System.out.println(s.nextInt());
			
			
			
		}
	}

}
