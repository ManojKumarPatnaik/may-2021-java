package com.org;

public class TestIfElseIf {

	public static void main(String[] args) {
		int marks = 60;
		
		if(marks >= 70) {
			System.out.println("FCD");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("First class");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("Second class");
		} else if (marks >= 35 && marks < 50) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}
