package com.org;

public class TestEmployee {

	public static void main(String[] args) {
		// creating object of Employee class
		// data-type variableName = value;
		// int x = 20;
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.id = 100;
		e1.name = "Alex";
		e1.salary = 35200.0;
		
		e2.id = 200;
		e2.name = "Bruce";
		e2.salary = 42000.0;
		
		// invoke display e1.display() & e2.display()
		e1.display();
		System.out.println("--------------------------------");
		e2.display();
	}
}
