package shape;

public abstract  class Circle extends Shape {
	public double radius;

	// constructor
	public Circle(double circleRadius, String circleName) {
		super(circleName);
		radius = circleRadius;
	}

	@Override
	public abstract double area();


	@Override
	public double perimeter() {
		// TODO Auto-generated method stub

		return 2 * Math.PI * radius;
	}

}
