package com.polymorphism;

public class TestMethodOverloading {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(30, 40); // add(int, int)
		System.out.println("------------------");
		calculator.add(25.5, 30.5); // add(double, double)
		System.out.println("-------------------");
		calculator.add("Hello", "World"); // add(String, String)
		System.out.println("-------------------");
		calculator.add(40, 40.5); // add(double, double)
	}

}
