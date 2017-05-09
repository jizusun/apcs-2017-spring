package student;

import java.util.Arrays;

public class Student {

	// data memebers

	public final static int NUM_TESTS = 3;

	private String myName;

	private int[] myTests;

	private String myGrade;
	int a;

	// constructors

//	public Student() {
//
//		myName = "";
//
//		myTests = new int[NUM_TESTS];
//
//		myGrade = "";
//		System.out.println("student 默认的构造函数被执行");
//
//	}

//	public Student(String name, int[] tests, String grade) {
//
//		myName = name;
//
//		myTests = tests;
//
//		myGrade = grade;
//		System.out.println("student 有参的构造函数被执行");
//
//	}

	public String getName() {

		return myName;

	}

	public String getGrade() {

		return myGrade;

	}

	public void setGrade(String newGrade) {

		myGrade = newGrade;
		System.out.println(newGrade);

	}

	public void computeGrade() {

		if (myName.equals(""))

			myGrade = "No Grade";

		else if (getTestAverage() >= 65)

			myGrade = "Pass";

		else

			myGrade = "False";

	}

	@Override
	public String toString() {
		return "Student [myName=" + myName + ", myTests=" + Arrays.toString(myTests) + ", myGrade=" + myGrade + "]";
	}

	public double getTestAverage() {

		double total = 0;

		for (int score  : myTests)

			total += score;

		return total / NUM_TESTS;

	}

}



