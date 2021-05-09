package com.org;

public class TestThisKeyword {
	public static void main(String[] args) {
		Person p1 = new Person("Alex", 35); // p1[name=Alex & age=35]
		Person p2 = new Person("Bruce", 40); // p2 [name=Bruce & age=40]
		
		p1.display();
		System.out.println("================");
		p2.display();
	}
}
