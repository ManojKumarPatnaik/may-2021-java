package com.org;

public class TestStudent {
	public static void main(String[] args) {
		StudentConstructor s1 = new StudentConstructor(100, "Alex", 'C');
		StudentConstructor s2 = new StudentConstructor(200, "Bruce", 'A');
		
		s1.display();
		System.out.println("--------------------");
		s2.display();
		
	}
}
