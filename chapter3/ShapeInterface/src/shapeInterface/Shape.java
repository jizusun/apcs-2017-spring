package shapeInterface;


public abstract class Shape implements Comparable {
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

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		final double EPSILON = 1.0e-15;
		Shape rhs = (Shape) obj;
		double diff = area() - rhs.area();
		if (Math.abs(diff) <= EPSILON * Math.abs(area())) {
			return 0;
		} else if (diff < 0) {
			return -1;
		} else
			return 1;
		
	}
}
