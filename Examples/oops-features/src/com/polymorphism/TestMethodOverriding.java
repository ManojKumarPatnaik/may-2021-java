package com.polymorphism;

public class TestMethodOverriding {
	public static void main(String[] args) {
		
		Person p = new Person();
		Employee e = new Employee();
		Student s = new Student();
		Customer c = new Customer();
		
		// higher type can accept lower type values
		// ex: byte value to int variable
		Person p1 = p; // p1 is accepting person object same type assignment
		p1.display();
		System.out.println("-------------------------");
		p1 = e; // p1 is accepting employee object, lower type is assigned to higher type
		p1.display();
		System.out.println("-------------------------");
		p1 = s; // p1 is accepting student object, lower type is assigned to higher type
		p1.display();
		System.out.println("-------------------------");
		p1 = c; // p1 is accepting customer object, lower type is assigned to higher type
		p1.display();
	}
}
