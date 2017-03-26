/**
 * A gift ...
 * 
 * Special for April Fool's Day in 2017
 * Special for APCS 2017
 * Special for Y-O-U
 * 
 * This program pretend to "format" your hard-disk, 
 * according to the command line arguments
 * 
 * If you provide "C", then prompt "Partition C is formatted" 
 * If you provide "C D", then prompt "Partition C and D are formatted"
 * If you provide nothing or anything else, then prompt "Nothing provided or recognized, all partitions are formatted"
 * 
 */


import java.util.Arrays;

/**
 * @author Jizu
 *
 */
public class AprilFoolsDay2017Gift {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * iterate over an array
		 */
		for(String s: args){
			System.out.println(s);
		}
		/*
		 * Bonus: simplest way to inspect elements of arrays
		 * See more static methods of Arrays here:
		 * https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
		 */
		System.out.println(Arrays.toString(args));
		
		String[] strArr = new String[2];
		System.out.println(strArr[0]);
	}

}
