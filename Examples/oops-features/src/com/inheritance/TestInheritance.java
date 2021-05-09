package com.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		Person p = new Person("Alex", 99989393);
		
		p.display();
		System.out.println("----------------------");
		Employee e = new Employee(100, "Bruce", 235200, 8888899);
		
		e.display();
		e.updatePhone(88888);
		e.display();
		System.out.println("-------------------");
		Student s = new Student(200, "Charles", 9999000, "C");
		
		s.display();
		s.updatePhone(6666);
		s.display();
	}

}
