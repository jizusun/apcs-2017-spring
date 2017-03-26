
public class IteratorsInArray {
	
	public static void main(String[] args) {
		Person[] arr = new Person[2];
//		arr[0] = new Person("Jizu");
//		arr[1] = new Person("Weicong");
//		for(Person p : arr) {
//			System.out.println(p);
//			p = new Person("Gates"); // not working
//			p.name = "Gates"; // working
//		};
		
//		for (int i = 0; i<arr.length; i++){
//			arr[i] = new Person("Gates");  // working
//			// for-each
//			Person p = arr[i];
//			p = new Person("Hello");
//		};
//		
		for(Person p : arr)
			System.out.println(p.name);
		};	
}

class Person {
	public String name;
	public Person(String name) {
		this.name = name;
	} 
}