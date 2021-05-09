package com.inheritance;

public class Employee extends Person {
	// name, phone, display() are inheritted
	int id;
	double salary;
	
	
	
	Employee(int id, String name, double salary, long phone) {
		super(name, phone); // Person(name, phone)
		this.id = id;
		this.salary = salary;
		System.out.println("Employee(4) constructor");
	}
	
	@Override
	void display(){
		System.out.println("Id = "+id+", Salary = "+salary);
		// it calls the display of super class
		super.display();
	}
}
