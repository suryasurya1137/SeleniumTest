package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {

		System.out.println(" Name");

	}

	public void studentId() {
		System.out.println("Id");

	}

	public void studentDept() {
		System.out.println("Dept ");

	}
	
	
	 public void deptName() { System.out.println("Override"); } 
	 
	public static void main(String[] args) {
		Student obj = new Student();
		obj.studentDept();
		obj.deptName();
		obj.collegeCode();
	}

}
