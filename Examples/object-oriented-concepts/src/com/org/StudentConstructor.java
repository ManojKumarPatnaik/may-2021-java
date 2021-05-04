package com.org;

public class StudentConstructor {
	int rollNo;
	String name;
	char grade;
	
	StudentConstructor(int r, String n, char g) {
		System.out.println("StudentConstructor(int, String, char) called");
		rollNo = r;
		name = n;
		grade = g;
	}
	
	void display() {
		System.out.println("RollNo = "+rollNo+", Name = "+name+", Grade = "+grade);
	}
}
