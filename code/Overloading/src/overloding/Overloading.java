package overloding;

public class Overloading {
	public int product(int n) {
		System.out.println(n*n);
		return n * n;
	}

	public double product(double n) {
		System.out.println(n*n);
		return n * n;
	}

	public double product(int x, int y) {
		System.out.println(x*y);
		return x * y;
	}


}
