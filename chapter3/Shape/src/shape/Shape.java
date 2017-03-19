package shape;

public abstract class Shape {
	private String name;

	// constructor
	public Shape(String shapeName) {
		name = shapeName;
	}

	public String getName() {
		return name;
	}

	public abstract double area();

	public abstract double perimeter();

	public double semiPerimeter() {
		return perimeter() / 2;
	}
}
