package com.fundamentals;

public class TestEmployee {

	public static void main(String[] args) {
		String name = "Alexandar"; // string object
		System.out.println(name);  // toString() method of String
		Employee e1 = new Employee(100, "Raj", 56000);
		Employee e2 = new Employee(200, "Vijay", 66000);
		System.out.println(e1); // toString() method of Employee
		System.out.println(e2); // toString() method of Employee
	}

}
