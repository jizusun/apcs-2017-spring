package student;

public class UnderGrad extends Student {
	public UnderGrad() {

		super();
		System.out.println("understudent 默认的构造函数被执行");

	}

	// constructor

	public UnderGrad(String name, int[] tests, String grade) {

		//super(name, tests, grade);
		System.out.println("understudent 有参的构造函数被执行");

	}

	public void computeGrade() {

		if (getTestAverage() >= 70)

			setGrade("Pass");

		else

			setGrade("Fail");

	}
}
