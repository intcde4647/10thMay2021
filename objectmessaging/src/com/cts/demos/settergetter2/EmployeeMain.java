package com.cts.demos.settergetter2;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Ravi");
		emp.setMarried(false);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.isMarried());

	}

}
