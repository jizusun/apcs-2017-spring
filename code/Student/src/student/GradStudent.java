package student;

public class GradStudent extends Student {
	private int myGradID;
	static int a[] = { 3, 3, 3 };

	public GradStudent() {

		super("3434", a, "PASS");

		myGradID = 0;
		System.out.println("gradstudent 默认的构造函数被执行");

	}

	// constructor

	public GradStudent(String name, int[] tests, String grade, int gradID) {

	//	super(name, tests, grade);
		myGradID = gradID;
		System.out.println("gradstudent 有参的构造函数被执行");

	}

	public int getID() {

		return myGradID;

	}

	

}
