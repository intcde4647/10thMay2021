package com.cts.demos.constructordemo3;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student(1,"CTS");  // During the student object creation
		// we are calling the parameterized constructor
		student.displayData();

	}

}
