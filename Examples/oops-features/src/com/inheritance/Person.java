package com.inheritance;

public class Person {
	String name;
	long phone;
	
	Person(String name, long phone) {
		this.name = name;
		this.phone = phone;
		System.out.println("Person(2) constructor");
	}
	
	void display() {
		System.out.println("---- display of Person -----");
		System.out.println("Name = "+name+", Phone = "+phone);
	}
	void updatePhone(long phone) {
		this.phone = phone;
	}
}
