package com.org;

public class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name = "+name+", Age = "+age);
		System.out.println("Name = "+this.name+", Age = "+this.age);
	}
}
