package student;

public class UnderGrad extends Student {
	public UnderGrad() {

		super();
		System.out.println("understudent Ĭ�ϵĹ��캯����ִ��");

	}

	// constructor

	public UnderGrad(String name, int[] tests, String grade) {

		//super(name, tests, grade);
		System.out.println("understudent �вεĹ��캯����ִ��");

	}

	public void computeGrade() {

		if (getTestAverage() >= 70)

			setGrade("Pass");

		else

			setGrade("Fail");

	}
}
