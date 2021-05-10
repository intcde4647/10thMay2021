package com.cts.demos.constructordemo4;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student(1,"CTS");  // During the student object creation
		// we are calling the parameterized constructor
		student.displayData();
        Student student2=new Student(); // parameterless constructor
        student2.displayData();
	}

}
