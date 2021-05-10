package com.cts.demos.settergetter1;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Ravi");
		System.out.println(emp.getId());
		System.out.println(emp.getName());

	}

}
