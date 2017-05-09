package stringPackage;

public class TestEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//example 1
		String a1 = "hello";
		String b1 = "hello";
		System.out.println(a1==b1);
		System.out.println(a1.equals(b1));
		
		//example 2
		String a2 = "hello";
		String b2 = "good";
		System.out.println(a2==b2);
		System.out.println(a2.equals(b2));
		
		//example 3
		String a3 = "hello";
		String b3 = new String ("hello");
		System.out.println(a3==b3);
		System.out.println(a3.equals(b3));
		//compareTo
		System.out.println("compareTo:"+a3.compareTo(b3));
		//substring
		System.out.println(a3.substring(5));
		System.out.println(a3.substring(1, 1));
		//length
		System.out.println(a3.length());
		System.out.println(a3.charAt(4));
		//array
		char[] a4={'h','e','l','l','o'};
		//System.out.println(a4[a4.length]);
	System.out.println("---");
	System.out.println(a3.substring(5));
	}

}

