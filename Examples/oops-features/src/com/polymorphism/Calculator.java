package com.polymorphism;

public class Calculator {
	public int add(int x, int y) {
		System.out.println("add(int, int)");
		return (x + y);
	}
	public String add(String s1, String s2) {
		System.out.println("add(String, String)");
		return (s1 + s2);
	}
	public double add(double d1, double d2) {
		System.out.println("add(double, double)");
		return (d1 + d2);
	}
}
