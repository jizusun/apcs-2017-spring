package shapeInterface;

public class FindMaxTest {

	public static IComparable max(IComparable a, IComparable b) {
		if (a.compareTo(b) > 0) {
			return a;
		} else {
			return b;
		}

	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//IComparable  b1= new Shape("dsdjs");
		//Shape s1 = new Circle(3.0, "circle");
		Shape s2 = new Square(4.5, "square");
		//System.out.println("area of " + s1.getName() + "is" + s1.area());
		System.out.println("area of " + s2.getName() + "is" + s2.area());
		//Shape s3 = (Shape) max(s1, s2);
		//System.out.println("the larger shape is the " + s3.getName());
	}

}
