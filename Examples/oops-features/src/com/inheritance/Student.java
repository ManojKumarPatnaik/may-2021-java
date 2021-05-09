package com.inheritance;

public class Student extends Person {
	// name, phone, display()
	int rollNo;
	String grade;
	
	Student(int rollNo, String name, long phone, String grade) {
		super(name, phone);
		this.rollNo = rollNo;
		this.grade = grade;
		System.out.println("Student(4) constructor");
	}
	
	@Override
	void display() {
		System.out.println("RollNo = "+rollNo+", Grade = "+grade);
		super.display();
	}
}
