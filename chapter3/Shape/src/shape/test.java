package shape;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle(10.0, "circle");
		Shape square = new Square(4.0, "square");
		Shape s = null;
		System.out.println("which shape?");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();//
		if (str.equals("circle")) {
			s = circle;
		} else {
			s = square;
		}
		System.out.println("area of " + s.getName() + "is" + s.area());
		scanner.close();
	}

}
